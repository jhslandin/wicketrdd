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
public class SysGlosario extends SysPropiedad implements IDataBase, ICrudTable {

    private Integer gloCodigo = null;
    private SysIdioma sysIdioma = null;
    private String gloValor = null;

    /**
     *
     */
    public SysGlosario() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the gloCodigo
     */
    public Integer getGloCodigo() {
        return gloCodigo;
    }

    /**
     * @param gloCodigo the gloCodigo to set
     */
    public void setGloCodigo(Integer gloCodigo) {
        this.gloCodigo = gloCodigo;
    }

    public SysIdioma getSysIdioma() {
        if (sysIdioma == null) {
            this.setSysIdioma(new SysIdioma());
        }
        return sysIdioma;
    }

    public void setSysIdioma(SysIdioma sysIdioma) {
        this.sysIdioma = sysIdioma;
    }

    /**
     * @return the gloValor
     */
    public String getGloValor() {
        return gloValor;
    }

    /**
     * @param gloValor the gloValor to set
     */
    public void setGloValor(String gloValor) {
        this.gloValor = gloValor;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

    }

    public boolean findGloValor() {
        String query;
        boolean result = false;

        try {
            query = String.format(IDataBase.QUERY_GLOSARIO_BY_IDIOMA, this.getSysIdioma().getIdiCodigo(), this.getProLlave());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            this.setGloValor(null);
            if (rs.next()) {
                result = true;
                this.setGloValor(rs.getString("glo_valor"));
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
