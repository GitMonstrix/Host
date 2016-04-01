package com.exam.test7;

public class Create{
    public String getCreate(String schemaName, String tableName) {

        return "CREATE TABLE " + tableName + " (\n" +
                " id integer PRIMARY KEY);";
    }
}
