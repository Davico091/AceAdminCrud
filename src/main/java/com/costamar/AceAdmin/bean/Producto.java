package com.costamar.AceAdmin.bean;

public class Producto {
private int codigo_producto;
private String descripcion;
private double precio;
public int getCodigo_producto() {
	return codigo_producto;
}
public void setCodigo_producto(int codigo_producto) {
	this.codigo_producto = codigo_producto;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}

}
