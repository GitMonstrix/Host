package com.exam.test7;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
    public String getUpdate(String schemaName, String tableName){
        DBConnect connect = new DBConnect();
        String spisokTablic = "";
        String primaryKey = "";
        try {
            Statement statement = connect.getConnection().createStatement();
            String query = "select column_name from information_schema.columns where table_name= '" + tableName + "'";  //Запрос на список полей в таблице.
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
                spisokTablic += resultSet.getString(1) + "= ?,";
            spisokTablic = spisokTablic.substring(0, spisokTablic.length() - 1);
            String queryPK = "SELECT\n" +                                                                               //Запрос на поле первичного ключа в таблице.
                    "    i.relname AS indexname,\n" +
                    "    pg_get_indexdef(i.oid) AS indexdef\n" +
                    "FROM pg_index x\n" +
                    "INNER JOIN pg_class i ON i.oid = x.indexrelid\n" +
                    "WHERE x.indrelid = '" + tableName +"'::regclass::oid AND i.relkind = 'i'::\"char\"\n" +
                    "AND x.indisprimary";
            resultSet = statement.executeQuery(queryPK);
            while (resultSet.next())
                primaryKey += resultSet.getString(1).substring(tableName.length() + 1, resultSet.getString(1).length() - 3) + ","; //Название поля первичного ключа
            primaryKey = primaryKey.substring(0, primaryKey.length() - 1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "UPDATE " + tableName + " SET " + spisokTablic + " WHERE " + primaryKey + "= ?";
    }
}
