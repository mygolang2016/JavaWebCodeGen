package com.zju.util;

import com.google.common.collect.Maps;
import com.zju.meta.Meta;
import freemarker.template.*;

import java.io.*;
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
            Template temp = cfg.getTemplate("meta.ftl");
            HashMap<String,Object> param= Maps.newHashMap();
            param.put("meta",meta);
            //Writer out = new OutputStreamWriter(System.out);
            File target=new File(path+"/result/meta.java");
            //创建父级目录
            target.getParentFile().mkdirs();
            //创建文件
            target.createNewFile();
            Writer out = new FileWriter(target);
            temp.process(param, out);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
    }

}
