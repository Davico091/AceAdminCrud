package com.costamar.AceAdmin.service;

import java.util.List;

import com.costamar.AceAdmin.bean.DetallePedido;
import com.costamar.AceAdmin.bean.Pedido;

public interface IPedidoService {

	int save(Pedido pedido, List<DetallePedido> pedidos);

}
