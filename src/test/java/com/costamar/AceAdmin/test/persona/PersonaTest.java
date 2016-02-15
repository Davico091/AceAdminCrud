package com.costamar.AceAdmin.test.persona;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.context.web.AnnotationConfigWebContextLoader;
import org.springframework.test.context.web.WebAppConfiguration;

import com.costamar.AceAdmin.bean.Persona;
import com.costamar.AceAdmin.configuration.ApplicationConfiguration;
import com.costamar.AceAdmin.service.IPersonaService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigWebContextLoader.class,classes = {ApplicationConfiguration.class})
@WebAppConfiguration
public class PersonaTest {
	
	@Autowired
	IPersonaService  iServicePersona;
	Persona persona;
	@Before
	public void setUp(){
		persona = new Persona();
		persona.setNombre_persona("Carlos");
		persona.setApellidos_persona("rengifo");
		persona.setDocumento_persona("41586719");
		persona.setTelefono_persona("3546557");
		persona.setCelular_persona("962412351");
		persona.setDireccion_persona("Mz A5 Lo--");
		persona.setNacimiento_persona("05/01/1989");
		
	}

	@Test
	public void shouldSavePerson() {
		int result=0;
		result = iServicePersona.savePerson(persona);
		assertTrue(result>0);
	}

}
