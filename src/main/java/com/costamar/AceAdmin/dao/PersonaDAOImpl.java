package com.costamar.AceAdmin.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.costamar.AceAdmin.bean.Persona;
import com.costamar.AceAdmin.util.Util;

@Repository
public class PersonaDAOImpl implements PersonaDAO {
	
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(@Qualifier("dataSourceOrigen")DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public int savePerson(Persona persona) {
		int result=0;
		
		String query = "INSERT INTO persona (nombre_persona"
										+ ",apellidos_persona,"
										+ "documento_persona,"
										+ "telefono_persona,"
										+ "celular_persona,"
										+ "direccion_persona,"
										+ "nacimiento_persona)"
										+ "VALUES(?,?,?,?,?,?,?)";
		try {
			Object[] params = new Object[]{persona.getNombre_persona(),
											persona.getApellidos_persona(),
											persona.getDocumento_persona(),
											persona.getTelefono_persona(),
											persona.getCelular_persona(),
											persona.getDireccion_persona(),
											Util.parseDate(persona.getNacimiento_persona())};
			result = jdbcTemplate.update(query,params);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
}
