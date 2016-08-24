package com.zju.util;

/**
 * @author ted on 16/8/23.
 */
public class SQLUtil {
    /**
     * 数据表列类型转Java类型
     * @param databaseType
     * @return
     */
    public static String covertType(String databaseType){
        String javaType="";
        databaseType=databaseType.trim().toLowerCase();
        if("int".equals(databaseType)){
            javaType="Integer";
        }else if("varchar".equals(databaseType)){
            javaType="String";
        }else if("bigint".equals(databaseType)){
            javaType="Long";
        }else if("double".equals(databaseType)){
            javaType="Double";
        }else if("datetime".equals(databaseType)){
            javaType="String";
        }else{
            javaType="[SQL]"+databaseType;
        }
        return javaType;
    }

    /**
     * 数据表列名转Java属性名
     * @param databaseType
     * @return
     */
    public static String covertToCamelCase(String databaseType){
        String[] ss=databaseType.split("_");
        StringBuilder stringBuilder=new StringBuilder();
        for(String s:ss){
            if(s.length()>1){
                stringBuilder.append(s.substring(0,1).toUpperCase());
                stringBuilder.append(s.substring(1).toLowerCase());
            }
            else{
                stringBuilder.append(s.toUpperCase());
            }
        }
        return stringBuilder.toString();
    }
}
