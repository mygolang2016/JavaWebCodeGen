package com.zju.meta;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author ted on 16/8/23.
 */
public class Table {
    //数据表表名
    private String tableName;
    //数据表列信息
    private List<TableColumn> columns;

    public Table(String tableName) {
        this.tableName = tableName;
        this.columns = Lists.newArrayList();
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<TableColumn> getColumns() {
        return columns;
    }

}
