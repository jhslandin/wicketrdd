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
public class Persona implements IDataBase, ICrudTable {

	private String cedula;
	private String nombres;
	private String apellidos;
	private String genero;
	private String correoInstitucional;
	private String correoPersonal;
	private String celular;
	private String estadoCivil;
	private String etnia;
	private String fechaNacimiento;
	private String nacionalidad;
	private String provinciaActual;
	private String cantonActual;
	private String porroquiaActual;
	private String direccionActual;
	
	
	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}


	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}


	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}


	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}


	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}


	/**
	 * @return the correoInstitucional
	 */
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}


	/**
	 * @param correoInstitucional the correoInstitucional to set
	 */
	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}


	/**
	 * @return the correoPersonal
	 */
	public String getCorreoPersonal() {
		return correoPersonal;
	}


	/**
	 * @param correoPersonal the correoPersonal to set
	 */
	public void setCorreoPersonal(String correoPersonal) {
		this.correoPersonal = correoPersonal;
	}


	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}


	/**
	 * @param celular the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}


	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}


	/**
	 * @param estadoCivil the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}


	/**
	 * @return the etnia
	 */
	public String getEtnia() {
		return etnia;
	}


	/**
	 * @param etnia the etnia to set
	 */
	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}


	/**
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	/**
	 * @return the nacionalidad
	 */
	public String getNacionalidad() {
		return nacionalidad;
	}


	/**
	 * @param nacionalidad the nacionalidad to set
	 */
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	/**
	 * @return the provinciaActual
	 */
	public String getProvinciaActual() {
		return provinciaActual;
	}


	/**
	 * @param provinciaActual the provinciaActual to set
	 */
	public void setProvinciaActual(String provinciaActual) {
		this.provinciaActual = provinciaActual;
	}


	/**
	 * @return the cantonActual
	 */
	public String getCantonActual() {
		return cantonActual;
	}


	/**
	 * @param cantonActual the cantonActual to set
	 */
	public void setCantonActual(String cantonActual) {
		this.cantonActual = cantonActual;
	}


	/**
	 * @return the porroquiaActual
	 */
	public String getPorroquiaActual() {
		return porroquiaActual;
	}


	/**
	 * @param porroquiaActual the porroquiaActual to set
	 */
	public void setPorroquiaActual(String porroquiaActual) {
		this.porroquiaActual = porroquiaActual;
	}


	/**
	 * @return the direccionActual
	 */
	public String getDireccionActual() {
		return direccionActual;
	}


	/**
	 * @param direccionActual the direccionActual to set
	 */
	public void setDireccionActual(String direccionActual) {
		this.direccionActual = direccionActual;
	}

	public void read() {
		String query;
		try {
			query = String.format(QUERY_PERSONA_BY_CEDULA, getCedula());
			Statement stmt = DataBase.conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			if (rs.next()) {
				this.setNombres(rs.getString("nombres"));
				this.setApellidos(rs.getString("apellidos"));
				this.setGenero(rs.getString("genero"));
				this.setCorreoInstitucional(rs.getString("correo_institucional"));
				this.setCorreoPersonal(rs.getString("correo_personal"));
				this.setCelular(rs.getString("celular"));
				this.setEstadoCivil(rs.getString("estado_civil"));
				this.setEtnia(rs.getString("etnia"));
				this.setFechaNacimiento(rs.getString("fecha_nacimiento"));
				this.setNacionalidad(rs.getString("nacionalidad"));
				this.setProvinciaActual(rs.getString("provincia_actual"));
				this.setCantonActual(rs.getString("canton_actual"));
				this.setPorroquiaActual(rs.getString("parroquia_actual"));
				this.setDireccionActual(rs.getString("direccion_actual"));			
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
