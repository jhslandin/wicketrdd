package com.loxasmart.wicket.rdd.modelo;

import java.util.Date;

public interface IDataBase {
	public final String SYSIDIOMA 		= "sys_idioma";
	public final String SYSPROPIEDAD 	= "sys_propiedad";
	public final String SYSGLOSARIO 	= "sys_glosario";

	public final String SYSACCESOS 		= "sys_accesos";
	public final String SYSESTADOS 		= "sys_estados";
	public final String SYSROLES 		= "sys_roles";
	public final String SYSUSUARIOS 	= "sys_usuarios";

	public final String CPIFOTOS 		= "cpi_fotos";
	
	public static java.util.Date convertFromSQLDateToJAVADate(java.sql.Date sqlDate) {
        java.util.Date javaDate = null;
        if (sqlDate != null) {
            javaDate = new Date(sqlDate.getTime());
        }
        return javaDate;
    }
	
	public final String QUERY_PERSONA_BY_CEDULA = 
	"""
		SELECT 	*
		FROM 	persona 
		WHERE 	persona.cedula = '%s'
		;
	""";
	
	public final String QUERY_SYSUSUARIOS_BY_CEDULA = 
	"""
		SELECT 	sys_usuarios.*,
				persona.*
		FROM 	sys_usuarios,
				persona
		WHERE 	sys_usuarios.per_cedula = '%s'
		AND		persona.cedula = sys_usuarios.per_cedula 
		;
	""";
	
	public final String QUERY_ALTERNATIVAS_BY_CONSIGNA = 
	"""
		SELECT 	*
		FROM 	cpi_alternativas 
		WHERE 	cpi_alternativas.con_codigo = %d
		;
	""";

	public final String QUERY_CONSIGNA_BY_PRUEBAITEMS = 
	"""
		SELECT 	cpi_consigna.*
		FROM 	cpi_prueba_item,
				cpi_consigna
		WHERE 	cpi_prueba_item.pru_codigo = %d
		AND	    cpi_consigna.con_uuid = cpi_prueba_item.con_uuid
		;
	""";

	public final String QUERY_SYSESTADOS_BY_CODIGO = 
	"""
		SELECT 	*
		FROM 	sys_estados
		WHERE 	sta_codigo = %d
		;
	""";

	public final String QUERY_IDIOMAS_ALL = 
	"""
		SELECT 	*
		FROM 	sys_idioma
		;
	""";

	public final String QUERY_SYSPROPIEDAD_BY_LLAVE = 
	"""
		SELECT 	*
		FROM 	sys_propiedad
		WHERE   pro_llave = '%s'
		;
	""";

	public final String QUERY_GLOSARIO_BY_IDIOMA = 
	"""
		SELECT 	sys_glosario.*
		FROM 	sys_glosario,
		        sys_idioma,
		        sys_propiedad
		WHERE   sys_idioma.idi_codigo    = %d
		AND     sys_propiedad.pro_llave  = '%s'
		AND     sys_glosario.idi_codigo = sys_idioma.idi_codigo
		AND	    sys_glosario.pro_codigo = sys_propiedad.pro_codigo
		;
	""";

	public final String QUERY_CPIFOTOS_BY_CEDULA = 
	"""
		SELECT 	*
		FROM 	cpi_fotos
		WHERE 	cedula = '%s'
		;
	""";

}
