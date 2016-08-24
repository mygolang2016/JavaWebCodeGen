package com.zju.meta;

/**
 * @author ted on 16/8/23.
 */
public class TableColumn {
    //数据表列名
    private String name;
    //数据表列类型
    private String type;

    public TableColumn() {
    }

    public TableColumn(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
