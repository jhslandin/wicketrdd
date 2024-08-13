/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.io.File;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class DataBase implements IDataBase {

    public static final String DATABASE = "rdd_jhsl.db3";
    final Logger logger = LoggerFactory.getLogger(DataBase.class);

    public static Connection conn = null;

    public static void open() {
        try {
            Class.forName("org.sqlite.JDBC");

            if (conn == null) {

                URL url = DataBase.class.getResource(DATABASE);
//				App.print(url.toString() + " " + url.getProtocol());

                try {
                    if (url.getProtocol().equalsIgnoreCase("file")) {
//						App.print("Fuera del jar");
                        conn = DriverManager.getConnection("jdbc:sqlite:" + url);
                    } else {
//						App.print("Dentro del jar");
                        String pathname = System.getProperty("user.dir");
                        pathname += File.separator + "modelo";
                        pathname += File.separator + DATABASE;

                        conn = DriverManager.getConnection("jdbc:sqlite:file:/" + pathname);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    System.exit(-1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    public static boolean isEnable() {
        return (conn != null);
    }

}
