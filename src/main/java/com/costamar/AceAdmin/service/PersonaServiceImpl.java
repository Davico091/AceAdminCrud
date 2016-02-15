package com.costamar.AceAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamar.AceAdmin.bean.Persona;
import com.costamar.AceAdmin.dao.PersonaDAO;
@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	PersonaDAO personaDAO;

	@Override
	public int savePerson(Persona persona) {
		// TODO Auto-generated method stub
		return personaDAO.savePerson(persona);
	}
	
}
