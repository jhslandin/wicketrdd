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
public class CpiAlternativa implements IDataBase, ICrudTable {

    private Integer altCodigo = null;
    private CpiConsigna cpiConsigna = null;
    private String altContenido = null;
    private String altCorrecta = null;

    public CpiAlternativa() {

    }

    public Integer getAltCodigo() {
        return altCodigo;
    }

    public void setAltCodigo(Integer altCodigo) {
        this.altCodigo = altCodigo;
    }

    public CpiConsigna getCpiConsigna() {
        return cpiConsigna;
    }

    public void setCpiConsigna(CpiConsigna cpiConsigna) {
        this.cpiConsigna = cpiConsigna;
    }

    public String getAltContenido() {
        return altContenido;
    }

    public void setAltContenido(String altContenido) {
        this.altContenido = altContenido;
    }

    public String getAltCorrecta() {
        return altCorrecta;
    }

    public void setAltCorrecta(String altCorrecta) {
        this.altCorrecta = altCorrecta;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub		
    }

    public static ArrayList<CpiAlternativa> readByConsigna(CpiConsigna consigna) {
        // TODO Auto-generated method stub
        String query;
        ArrayList<CpiAlternativa> alternativas = new ArrayList<CpiAlternativa>();

        try {
            query = String.format(QUERY_ALTERNATIVAS_BY_CONSIGNA, consigna.getConCodigo());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                CpiAlternativa row = new CpiAlternativa();
                row.setCpiConsigna(consigna);

                row.setAltCodigo(Integer.valueOf(rs.getInt("alt_codigo")));
                row.setAltContenido(rs.getString("alt_contenido"));
                row.setAltCorrecta(rs.getString("alt_correcta"));

                alternativas.add(row);
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return alternativas;
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
