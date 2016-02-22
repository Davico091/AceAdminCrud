package com.costamar.AceAdmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.costamar.AceAdmin.bean.DetallePedido;
import com.costamar.AceAdmin.bean.Pedido;
import com.costamar.AceAdmin.dao.PedidoDAO;

@Service
public class PedidoServiceImpl implements IPedidoService {

	@Autowired
	PedidoDAO pedidoDAO;

	@Override
	public int save(Pedido pedido, List<DetallePedido> pedidos) {
		// TODO Auto-generated method stub
		return pedidoDAO.save(pedido,pedidos);
	}
}
