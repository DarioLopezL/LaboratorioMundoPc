package com.dl.mundopc;

public class Computadora {
private final int idComputadora;
private String nombre;
private Monitor monitor;
private Teclado teclado;
private Raton raton;
private static int idContadorCompu;

private Computadora() {
	this.idComputadora= ++Computadora.idContadorCompu;
	
	}
public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
	this();
	this.nombre = nombre;
	this.monitor = monitor;
	this.teclado = teclado;
	this.raton = raton;
}
public int getIdComputadora() {
	return this.idComputadora;
}

public String getNombre() {
	return this.nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Monitor getMonitor() {
	return this.monitor;
}
public void setMonitor(Monitor monitor) {
	this.monitor = monitor;
}
public Teclado getTeclado() {
	return this.teclado;
}
public void setTeclado(Teclado teclado) {
	this.teclado = teclado;
}
public Raton getRaton() {
	return this.raton;
}
public void setRaton(Raton raton) {
	this.raton = raton;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Computadora [idComputadora=");
	builder.append(idComputadora);
	builder.append(", nombre=");
	builder.append(nombre);
	builder.append(", monitor=");
	builder.append(monitor);
	builder.append(", teclado=");
	builder.append(teclado);
	builder.append(", raton=");
	builder.append(raton);
	builder.append("]");
	return builder.toString();
} 



}
