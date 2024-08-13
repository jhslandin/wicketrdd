package com.loxasmart.wicket.rdd.modelo.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.loxasmart.wicket.rdd.modelo.DataBase;
import com.loxasmart.wicket.rdd.modelo.ICrudTable;
import com.loxasmart.wicket.rdd.modelo.IDataBase;

public class SysPropiedad implements IDataBase, ICrudTable {

    private Integer proCodigo = null;
    private String proLlave = null;

    public SysPropiedad() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the proCodigo
     */
    public Integer getProCodigo() {
        return proCodigo;
    }

    /**
     * @param proCodigo the proCodigo to set
     */
    public void setProCodigo(Integer proCodigo) {
        this.proCodigo = proCodigo;
    }

    /**
     * @return the proLlave
     */
    public String getProLlave() {
        return proLlave;
    }

    /**
     * @param proLlave the proLlave to set
     */
    public void setProLlave(String proLlave) {
        this.proLlave = proLlave;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

    }

    public boolean findProLlave() {
        // TODO Auto-generated method stub
        String query;
        boolean result = false;

        try {
            query = String.format(QUERY_SYSPROPIEDAD_BY_LLAVE, this.getProLlave());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            this.setProCodigo(null);
            if (rs.next()) {
                result = true;
                this.setProCodigo(Integer.valueOf(rs.getInt("pro_codigo")));
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
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
