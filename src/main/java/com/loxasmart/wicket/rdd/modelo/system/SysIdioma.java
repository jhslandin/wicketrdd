/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.loxasmart.wicket.rdd.modelo.DataBase;
import com.loxasmart.wicket.rdd.modelo.ICrudTable;
import com.loxasmart.wicket.rdd.modelo.IDataBase;

/**
 *
 */
public class SysIdioma implements IDataBase, ICrudTable {

    private Integer idiCodigo = null;
    private String idiSiglas = null;
    private String idiNombre = null;

    /**
     *
     */
    public SysIdioma() {
        // TODO Auto-generated constructor stub
    }

    public Integer getIdiCodigo() {
        return idiCodigo;
    }

    public void setIdiCodigo(Integer idiCodigo) {
        this.idiCodigo = idiCodigo;
    }

    public String getIdiSiglas() {
        return idiSiglas;
    }

    public void setIdiSiglas(String idiSiglas) {
        this.idiSiglas = idiSiglas;
    }

    public String getIdiNombre() {
        return idiNombre;
    }

    public void setIdiNombre(String idiNombre) {
        this.idiNombre = idiNombre;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

    }

    public static ArrayList<SysIdioma> readAll() {
        // TODO Auto-generated method stub
        String query;
        ArrayList<SysIdioma> sysIdiomas = new ArrayList<SysIdioma>();

        try {
            query = String.format(QUERY_IDIOMAS_ALL);
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                SysIdioma row = new SysIdioma();

                row.setIdiCodigo(Integer.valueOf(rs.getInt("idi_codigo")));
                row.setIdiNombre(rs.getString("idi_nombre"));
                row.setIdiSiglas(rs.getString("idi_siglas"));

                sysIdiomas.add(row);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
//			App.readln();
            System.exit(-1);
        }
        return sysIdiomas;
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete() {
        // TODO Auto-generated method stub

    }

    @Override
    public void insert() {
        // TODO Auto-generated method stub

    }

}
