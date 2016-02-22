package com.costamar.AceAdmin.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.costamar.AceAdmin.bean.Cliente;

@Repository
public class ClienteDAOImpl implements ClienteDAO{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(@Qualifier("dataSourceOrigen")DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Cliente cliente) {
//		cliente.setRazon_social("David Perez");
//		cliente.setNro_documento("56565656");
//		cliente.setCelular("965232350");
//		cliente.setCorreo("correo@dominio.com");
		
		String query = "INSERT INTO cliente (razon_social,nro_documento,celular,correo) VALUES "
				+ "(?,?,?,?)";
		
		Object[] params = new Object[]{cliente.getRazon_social(),cliente.getNro_documento(),cliente.getCelular(),cliente.getCorreo()};
		
		int result = jdbcTemplate.update(query,params);
		return result;
	}
	
}
