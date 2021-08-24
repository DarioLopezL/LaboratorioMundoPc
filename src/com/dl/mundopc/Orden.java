package com.dl.mundopc;

public class Orden {
private final int idOrden;
private Computadora computadoras[];
private static int contadorOrdenes;
private  int contadorComputadoras;
private static final int maxComputadoras =10;

public Orden() {
	this.idOrden=++Orden.contadorOrdenes;
	this.computadoras=new Computadora[Orden.maxComputadoras];
   
	}

public void agregarComputadora(Computadora computadora ) {
	if(this.contadorComputadoras < Orden.maxComputadoras) {
		// si no ha alcanzado el maximo de computadoras-- se le agrega en computadoras[0,1,2] y luego se incrementa el tamanio y se va asignando a su respectivo celda
		this.computadoras[this.contadorComputadoras++]= computadora;
		}
	else {
		System.out.println("Has superado el Limite : "+Orden.maxComputadoras);
		
		}
	
	}
public void mostrarOrden() {
	System.out.println("Orden: "+this.idOrden);
	System.out.println("Computadoras de la orden #:"+this.idOrden);
	for (int i = 0; i < this.contadorComputadoras; i++) {
		System.out.println(this.computadoras[i]);
		}
	
		
	}

}
