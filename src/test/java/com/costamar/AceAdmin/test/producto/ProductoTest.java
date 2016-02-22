package com.costamar.AceAdmin.test.producto;

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

import com.costamar.AceAdmin.bean.Producto;
import com.costamar.AceAdmin.configuration.ApplicationConfiguration;
import com.costamar.AceAdmin.service.IProductoService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class,classes = {ApplicationConfiguration.class})
@WebAppConfiguration
public class ProductoTest {

	@Autowired
	IProductoService iProductoService;
	Producto producto;
	@Before
	public void setUp(){
		producto = new Producto();
		producto.setDescripcion("Pan con camote");
		producto.setPrecio(1.2);
		
	}
	@Ignore
	@Test
	public void test() {
		
		assertTrue(iProductoService.save(producto)>0);
	}

}
