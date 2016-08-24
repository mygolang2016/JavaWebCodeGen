package com.zju.util;

/**
 * @author ted on 16/8/23.
 */
public class SQLUtil {
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
}
