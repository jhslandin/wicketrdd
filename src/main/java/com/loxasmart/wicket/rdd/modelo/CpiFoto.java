/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

import java.io.InputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 */
public class CpiFoto extends CpiEstudiante implements ICrudTable {

    private InputStream foto = null;

    /**
     *
     */
    public CpiFoto() {
        // TODO Auto-generated constructor stub
        super();
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }

    public boolean findFoto() throws SQLException {
        String query;
        boolean result = false;

        try {
            query = String.format(QUERY_CPIFOTOS_BY_CEDULA, this.getCedula());
            Statement stmt = DataBase.conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            this.foto = null;

            if (rs.next()) {
                result = true;
                this.foto = rs.getBinaryStream("foto");
            }
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
