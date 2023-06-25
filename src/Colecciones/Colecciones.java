package Colecciones;

//import java.util.HashSet;//hijo
//import java.util.Set;//papa

public class Colecciones {

	public static void main(String[] args) {
		
		//declarando mi primer arreglo de Java[]
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes, despues el nombre del arreglo y por ultimo instancia mi arreglo[]
		
		String[] listaDeCompras= new String[] {"leche", "pan","frutas"};
		
		System.out.println(listaDeCompras); // da como resultado la memoria
		
		//forEach para imprimir cada elemento
		
		// para nuestros datos del tipo string, que se almacena en una variable temportal llamada producto te-mporal, que se esta llenando en un arreglo llamado lista de compras, vas a imprimir ese producto temporal.
		
		for(String productoTemporal:listaDeCompras) {
			System.out.println(productoTemporal);
		}
		
		//Declaro mi Arreglo de habitaciones de un hotel
				String[] habitaciones = new String[10];
				
				//Inicializco o asigno valores a cada indice
				habitaciones[0] = "101";
				habitaciones[1] = "102";
				habitaciones[2] = "103";
				habitaciones[3] = "104";
				habitaciones[4] = "105";
				habitaciones[5] = "106";
				habitaciones[6] = "107";
				habitaciones[8] = "109";
				habitaciones[9] = "110";
				
				habitaciones[10] = "111"; //Si tratamos de acceder a un elemento mas alla de los elementos declaradosal principio, tendremos una excepcion que solo veremos cuando se ejecute el programa./
				
				//Cuando imprimimon un elemento que no esta definido dentro del arreglo, veremos un null. Esto pasa porque para JAVA es preferible tener un elemento nulo a un indefinido. 
				System.out.println(habitaciones[8]);
				
				//En caso de querer usar un for each para imprimir los elementos, solo se imprimiran 7 elementos. (Solo itera sobre los elementos existentes).
				for(String habitacionTemporal : habitaciones) {
					System.out.println(habitacionTemporal);
				}

	}//cierre main

}// cierre clase


/*
 * 
 * instanciando un espacio donde guardar objetos
 
		Set<String> cartasDeJuego = new HashSet<>();
		

*Colecciones:
*
*- Arrays

Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos. Los elementos estan almacenados de forma contigua en memoria, y se puede acceder a ellos a traves de un indice. Sus principales caracteristicas son:

    1. Tamanio fijo.
    2. Acceso rapido.
    3. Coste elevado para insertar o eliminar elementos. 



*
*
*
*
*/