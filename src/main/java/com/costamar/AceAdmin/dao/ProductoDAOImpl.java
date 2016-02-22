package com.costamar.AceAdmin.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.costamar.AceAdmin.bean.Producto;

@Repository
public class ProductoDAOImpl implements ProductoDAO{
	
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(@Qualifier("dataSourceOrigen")DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Producto producto) {
		String query = "INSERT INTO producto (descripcion,precio)"
				+ "VALUES(?,?)";
		Object[] params = new Object[]{producto.getDescripcion(),producto.getPrecio()};
		int result = jdbcTemplate.update(query,params);
		return result;
	}

}
