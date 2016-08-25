package com.zju.meta;

import com.google.common.collect.Lists;
import com.zju.util.SQLUtil;

import java.util.List;

/**
 * @author ted on 16/8/23.
 */
public class Meta {
    private String tableName;
    private List<JavaField> fields;

    public Meta(String tableName) {
        this.tableName = SQLUtil.covertToCamelCase(tableName);
        this.fields= Lists.newArrayList();
    }
    public Meta(Table table){
        this(table.getTableName());
        JavaField javaField=null;
        for(TableColumn tableColumn:table.getColumns()){
            javaField=new JavaField(tableColumn.getType(),tableColumn.getName());
            fields.add(javaField);
        }
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<JavaField> getFields() {
        return fields;
    }

    public void setFields(List<JavaField> fields) {
        this.fields = fields;
    }
}
