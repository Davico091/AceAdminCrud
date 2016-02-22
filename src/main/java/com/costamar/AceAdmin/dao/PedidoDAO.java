package com.costamar.AceAdmin.dao;

import java.util.List;

import com.costamar.AceAdmin.bean.DetallePedido;
import com.costamar.AceAdmin.bean.Pedido;

public interface PedidoDAO {

	int save(Pedido pedido, List<DetallePedido> pedidos);

}
