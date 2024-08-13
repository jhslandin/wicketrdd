/**
 *
 */
package com.loxasmart.wicket.rdd.modelo.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.loxasmart.wicket.rdd.modelo.DataBase;
import com.loxasmart.wicket.rdd.modelo.ICrudTable;
import com.loxasmart.wicket.rdd.modelo.IDataBase;

/**
 *
 */
public class SysEstado implements IDataBase, ICrudTable {

    private Integer staCodigo = null;
    private String staSiglas = null;
    private String staNombre = null;
    private String staDescripcion = null;

    /**
     *
     */
    public SysEstado() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the staCodigo
     */
    public Integer getStaCodigo() {
        return staCodigo;
    }

    /**
     * @param staCodigo the staCodigo to set
     */
    public void setStaCodigo(Integer staCodigo) {
        this.staCodigo = staCodigo;
    }

    /**
     * @return the staSiglas
     */
    public String getStaSiglas() {
        return staSiglas;
    }

    /**
     * @param staSiglas the staSiglas to set
     */
    public void setStaSiglas(String staSiglas) {
        this.staSiglas = staSiglas;
    }

    /**
     * @return the staNombre
     */
    public String getStaNombre() {
        return staNombre;
    }

    /**
     * @param staNombre the staNombre to set
     */
    public void setStaNombre(String staNombre) {
        this.staNombre = staNombre;
    }

    /**
     * @return the staDescripcion
     */
    public String getStaDescripcion() {
        return staDescripcion;
    }

    /**
     * @param staDescripcion the staDescripcion to set
     */
    public void setStaDescripcion(String staDescripcion) {
        this.staDescripcion = staDescripcion;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub
        String query;

        try {
            query = String.format(QUERY_SYSESTADOS_BY_CODIGO, this.getStaCodigo());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (rs.next()) {
                this.setStaDescripcion(rs.getString("sta_descripcion"));
                this.setStaNombre(rs.getString("sta_nombre"));
                this.setStaSiglas(rs.getString("sta_siglas"));
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
