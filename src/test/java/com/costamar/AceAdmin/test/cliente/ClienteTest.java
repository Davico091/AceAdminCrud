package com.costamar.AceAdmin.test.cliente;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.costamar.AceAdmin.bean.Cliente;
import com.costamar.AceAdmin.configuration.ApplicationConfiguration;
import com.costamar.AceAdmin.service.IClienteService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class,classes = {ApplicationConfiguration.class})
@WebAppConfiguration
public class ClienteTest {
	
	@Autowired
	IClienteService iClienteService;
	Cliente cliente;
	@Before
	public void setUp(){
		cliente = new Cliente();
		cliente.setRazon_social("David Perez");
		cliente.setNro_documento("56565656");
		cliente.setCelular("965232350");
		cliente.setCorreo("correo@dominio.com");
	}
	@Ignore
	@Test
	public void test() {
		
		assertTrue(iClienteService.save(cliente)>0);
		
	}

}
