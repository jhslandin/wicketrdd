/**
 *
 */
package com.loxasmart.wicket.rdd.modelo;

/**
 *
 */
public class CpiProyecto implements ICrudTable {

    private Integer pryCodigo = null;
    private String pryUUID = null;
    private String pryRequerimieto = null;
    private String pryProcesoEducativo = null;
    private String pryInstitucionProducto = null;
    private String pryInstitucionRducativa = null;
    private String pryNivelEducativo = null;

    /**
     *
     */
    public CpiProyecto() {
        // TODO Auto-generated constructor stub
    }

    public Integer getPryCodigo() {
        return pryCodigo;
    }

    public void setPryCodigo(Integer pryCodigo) {
        this.pryCodigo = pryCodigo;
    }

    public String getPryUUID() {
        return pryUUID;
    }

    public void setPryUUID(String pryUUID) {
        this.pryUUID = pryUUID;
    }

    public String getPryRequerimieto() {
        return pryRequerimieto;
    }

    public void setPryRequerimieto(String pryRequerimieto) {
        this.pryRequerimieto = pryRequerimieto;
    }

    public String getPryProcesoEducativo() {
        return pryProcesoEducativo;
    }

    public void setPryProcesoEducativo(String pryProcesoEducativo) {
        this.pryProcesoEducativo = pryProcesoEducativo;
    }

    public String getPryInstitucionProducto() {
        return pryInstitucionProducto;
    }

    public void setPryInstitucionProducto(String pryInstitucionProducto) {
        this.pryInstitucionProducto = pryInstitucionProducto;
    }

    public String getPryInstitucionRducativa() {
        return pryInstitucionRducativa;
    }

    public void setPryInstitucionRducativa(String pryInstitucionRducativa) {
        this.pryInstitucionRducativa = pryInstitucionRducativa;
    }

    public String getPryNivelEducativo() {
        return pryNivelEducativo;
    }

    public void setPryNivelEducativo(String pryNivelEducativo) {
        this.pryNivelEducativo = pryNivelEducativo;
    }

    @Override
    public void read() {
        // TODO Auto-generated method stub

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
