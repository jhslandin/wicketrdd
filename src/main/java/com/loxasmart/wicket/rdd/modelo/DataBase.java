/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class DataBase implements IDataBase {
    public static final String SQLITEDRIVER="org.sqlite.JDBC";
    public static final String MYSQLDRIVER="com.mysql.jdbc.Driver";

    public static final String DATABASE = "rdd_jhsl.db3";
    final Logger logger = LoggerFactory.getLogger(DataBase.class);

    public static Connection conn = null;

    public static void open() {
        try {
            Class.forName(MYSQLDRIVER);
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rdddb","rdduser","rddpwd");  
        } catch (SQLException | ClassNotFoundException e) {
            conn = null;
        }
    }

    public static boolean isEnable() {
        return (conn != null);
    }

}
