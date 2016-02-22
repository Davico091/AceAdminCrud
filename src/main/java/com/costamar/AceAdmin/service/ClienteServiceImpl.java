package com.costamar.AceAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamar.AceAdmin.bean.Cliente;
import com.costamar.AceAdmin.dao.ClienteDAO;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	ClienteDAO clienteDAO;

	@Override
	public int save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienteDAO.save(cliente);
	}
	
}
