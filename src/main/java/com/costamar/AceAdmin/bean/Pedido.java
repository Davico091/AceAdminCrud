package com.costamar.AceAdmin.bean;

public class Pedido {
private int codigo_pedido;
private int codigo_cliente;
private String fecha_pedido;
public int getCodigo_pedido() {
	return codigo_pedido;
}
public void setCodigo_pedido(int codigo_pedido) {
	this.codigo_pedido = codigo_pedido;
}
public int getCodigo_cliente() {
	return codigo_cliente;
}
public void setCodigo_cliente(int codigo_cliente) {
	this.codigo_cliente = codigo_cliente;
}
public String getFecha_pedido() {
	return fecha_pedido;
}
public void setFecha_pedido(String fecha_pedido) {
	this.fecha_pedido = fecha_pedido;
}

}
