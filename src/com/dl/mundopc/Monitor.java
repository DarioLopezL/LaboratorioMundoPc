package com.dl.mundopc;

public class Monitor {
private final int idMonitor;
private String marca;
private double tamanio;
private static  int contadorMonitores;
	
private Monitor() {
	this.idMonitor=++Monitor.contadorMonitores;
}

public Monitor(String marca, double tamanio) {
	this();
	this.marca = marca;
	this.tamanio = tamanio;
}

public int getIdMonitor() {
	return this.idMonitor;
}


public String getMarca() {
	return this.marca;
}

public void setMarca(String marca) {
	this.marca = marca;
}

public double getTamanio() {
	return this.tamanio;
}

public void setTamanio(double tamanio) {
	this.tamanio = tamanio;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Monitor [idMonitor=");
	builder.append(idMonitor);
	builder.append(", marca=");
	builder.append(marca);
	builder.append(", tamanio=");
	builder.append(tamanio);
	builder.append("]");
	return builder.toString();
}


}
