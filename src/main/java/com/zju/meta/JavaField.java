package com.zju.meta;

import com.zju.util.SQLUtil;

/**
 * @author ted on 16/8/23.
 */
public class JavaField {
    private String databaseType;
    private String javaType;
    private String databaseName;
    private String camelCaseName;

    public JavaField(String databaseType, String databaseName) {
        this.databaseType = databaseType;
        this.javaType= SQLUtil.covertType(databaseType);
        this.databaseName = databaseName;
        this.camelCaseName=SQLUtil.covertToCamelCase(databaseName);
    }

    public String getDatabaseType() {
        return databaseType;
    }

    public void setDatabaseType(String databaseType) {
        this.databaseType = databaseType;
    }

    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public String getCamelCaseName() {
        return camelCaseName;
    }

    public void setCamelCaseName(String camelCaseName) {
        this.camelCaseName = camelCaseName;
    }
}
