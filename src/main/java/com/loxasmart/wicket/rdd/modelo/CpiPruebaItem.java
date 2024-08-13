/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 */
public class CpiPruebaItem extends CpiConsigna implements IDataBase, ICrudTable {

    private CpiPruebaHead cpiPruebaHead = null;
    private ArrayList<CpiPruebaItem> cpiPruebaItems = null;

    public CpiPruebaItem() {

    }

    /**
     * @return the cpiPruebaHead
     */
    public CpiPruebaHead getCpiPruebaHead() {
        return cpiPruebaHead;
    }

    /**
     * @param cpiPruebaHead the cpiPruebaHead to set
     */
    public void setCpiPruebaHead(CpiPruebaHead cpiPruebaHead) {
        this.cpiPruebaHead = cpiPruebaHead;
    }

    /**
     * @return the cpiPruebaItems
     */
    public ArrayList<CpiPruebaItem> getCpiPruebaItems() {
        return cpiPruebaItems;
    }

    /**
     * @param cpiPruebaItems the cpiPruebaItems to set
     */
    public void setCpiPruebaItems(ArrayList<CpiPruebaItem> cpiPruebaItems) {
        this.cpiPruebaItems = cpiPruebaItems;
    }

    public static ArrayList<CpiPruebaItem> readByConsigna(CpiPruebaHead prueba) {
        // TODO Auto-generated method stub
        String query;
        ArrayList<CpiPruebaItem> items = new ArrayList<CpiPruebaItem>();

        try {
            query = String.format(QUERY_CONSIGNA_BY_PRUEBAITEMS, prueba.getPruCodigo());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                CpiPruebaItem row = new CpiPruebaItem();
                row.setCpiPruebaHead(prueba);

                row.setConCodigo(Integer.valueOf(rs.getInt("con_codigo")));
                row.setConUuid(rs.getString("con_uuid"));
                row.setConContenido(rs.getString("con_contenido"));
                row.setSysLugar(prueba.getSysLugar());

                row.getAlternativas();
                items.add(row);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

}
