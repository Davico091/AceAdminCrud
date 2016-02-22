package com.costamar.AceAdmin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.costamar.AceAdmin.bean.DetallePedido;
import com.costamar.AceAdmin.bean.Pedido;
import com.costamar.AceAdmin.util.Util;

@Repository
public class PedidoDAOImpl implements PedidoDAO{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(@Qualifier("dataSourceOrigen")DataSource dataSource) {
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}

	@Override
	public int save(final Pedido pedido,List<DetallePedido>pedidos) {
		
		final String query = "INSERT INTO pedido (codigo_cliente,fecha_pedido)"
				+ "  VALUES(?,?) ";
		Object[] params = new Object[]{pedido.getCodigo_cliente(),Util.parseDate(pedido.getFecha_pedido())};
		KeyHolder keyHolder = new GeneratedKeyHolder();
//		int result = jdbcTemplate.update(query,params);
		int result = jdbcTemplate.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
					PreparedStatement ps = 
							con.prepareStatement(query,new String[]{"codigo_pedido"});
					ps.setInt(1, pedido.getCodigo_cliente());
					ps.setString(2,Util.parseDate(pedido.getFecha_pedido()));
				return ps;
			}
		},keyHolder);
		System.out.println(keyHolder.getKey()+"obtenido");
		
		if(keyHolder.getKey()!=null){
			String query2 = "INSERT INTO detalle_pedido (codigo_pedido,codigo_producto,cantidad)"
					+ " VALUES (?,?,?)";
			
			for(DetallePedido detalle :pedidos ){
				Object[] params2 = new Object[]{keyHolder.getKey(),detalle.getCodigo_producto(),detalle.getCantidad()};
				jdbcTemplate.update(query2,params2);
			}
			
		}
		
		return result;
	}
}
