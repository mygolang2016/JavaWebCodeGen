package com.zju.util;

import com.google.common.collect.Maps;
import com.zju.meta.Meta;
import freemarker.template.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

/**
 * @author ted on 16/8/24.
 */
public class FreeMarkerUtil {
    public void run(Meta meta) {
        String path = Class.class.getClass().getResource("/").getPath();
        Configuration cfg = new Configuration(new Version("2.3.23"));
        try {
            cfg.setDirectoryForTemplateLoading(new File(path + "/freemarker"));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            generate(meta, "meta", cfg, path);
            generate(meta, "dao", cfg, path);
            generate(meta, "mapper", cfg, path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

    private void generate(Meta meta, String templateName, Configuration cfg, String path) throws IOException, TemplateException {
        Template temp = cfg.getTemplate(templateName + ".ftl");
        HashMap<String, Object> param = Maps.newHashMap();
        param.put("meta", meta);
        //Writer out = new OutputStreamWriter(System.out);
        String fileName = meta.getTableName();
        if ("meta".equals(templateName)) {
            fileName += ".java";
        } else if ("dao".equals(templateName)) {
            fileName += "Dao.java";
        } else if ("mapper".equals(templateName)) {
            fileName += "DaoMapper.xml";
        }
        File target = new File(path + "/result/" + fileName);
        //创建父级目录
        target.getParentFile().mkdirs();
        //创建文件
        target.createNewFile();
        Writer out = new FileWriter(target);
        temp.process(param, out);
    }

}
