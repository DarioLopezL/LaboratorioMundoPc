package com.dl.mundopc;

public class DispositivosdeEntrada {
private String tipoEntrada;
private String marca;

public DispositivosdeEntrada(String tipoEntrada, String marca) {
	
	this.tipoEntrada = tipoEntrada;
	this.marca = marca;
}

public String getTipoEntrada() {
	return this.tipoEntrada;
}

public void setTipoEntrada(String tipoEntrada) {
	this.tipoEntrada = tipoEntrada;
}

public String getMarca() {
	return this.marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("DispositivosdeEntrada [tipoEntrada=");
	builder.append(tipoEntrada);
	builder.append(", marca=");
	builder.append(marca);
	builder.append("]");
	return builder.toString();
}




}
