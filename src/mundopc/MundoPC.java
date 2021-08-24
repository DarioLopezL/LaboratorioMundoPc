package mundopc;

import com.dl.mundopc.*;


public class MundoPC {

	public static void main(String[] args) {
		
		Monitor  monitorHP= new Monitor("Hp",13);
		Teclado tecladoHP= new Teclado("bluetooth","HP");
		Raton ratonHP=new Raton("bluetooth","HP");
	
		Computadora computadoraHP = new Computadora("Computadora HP",monitorHP, tecladoHP,ratonHP); 
		//nuevo objeto
		Monitor  monitorGamer= new Monitor("Gamer",45);
		Teclado tecladoGamer= new Teclado("bluetooth","Gamer");
		Raton ratonGamer=new Raton("bluetooth","Gamer");
	
		Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer, tecladoGamer,ratonGamer);
		
	
		Orden orden1 = new Orden();
		orden1.agregarComputadora(computadoraHP);
		orden1.agregarComputadora(computadoraGamer);

		orden1.mostrarOrden();
		
	}

}
