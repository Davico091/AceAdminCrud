package com.costamar.AceAdmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamar.AceAdmin.bean.Producto;
import com.costamar.AceAdmin.dao.ProductoDAO;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	ProductoDAO productoDAO;

	@Override
	public int save(Producto producto) {
		// TODO Auto-generated method stub
		return productoDAO.save(producto);
	}
	
}
