package com.costamar.AceAdmin.test.pedido;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.costamar.AceAdmin.bean.DetallePedido;
import com.costamar.AceAdmin.bean.Pedido;
import com.costamar.AceAdmin.configuration.ApplicationConfiguration;
import com.costamar.AceAdmin.service.IPedidoService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class,classes = {ApplicationConfiguration.class})
@WebAppConfiguration
public class PedidoTest {
	
	@Autowired
	IPedidoService iPedidoService;
	Pedido pedido ;
	List<DetallePedido> pedidos;
	DetallePedido detallePedido;
	@Before
	public void setUp() throws Exception {
		pedido = new Pedido();
		pedido.setCodigo_cliente(1);
		pedido.setFecha_pedido("02/08/2015");
		pedidos = new ArrayList<DetallePedido>();
		
		detallePedido = new DetallePedido();
		detallePedido.setCodigo_producto(1);
		detallePedido.setCantidad(2);
		pedidos.add(detallePedido);
		detallePedido = new DetallePedido();
		detallePedido.setCodigo_producto(2);
		detallePedido.setCantidad(2);
		pedidos.add(detallePedido);
	}
	@Ignore
	@Test
	public void shouldSaveOrder() {
		assertTrue(iPedidoService.save(pedido,pedidos)>0);
	}
	
	
}
