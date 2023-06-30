package Colecciones;

//import java.util.HashSet;//hijo
//import java.util.Set;//papa

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;




public class Colecciones {

	public static void main(String[] args) {

		// declarando mi primer arreglo de Java[]
		// Primero el tipo de dato que voy a almacenar, le pongo los corchetes, despues
		// el nombre del arreglo y por ultimo instancia mi arreglo[]

		String[] listaDeCompras = new String[] { "leche", "pan", "frutas" };

		System.out.println(listaDeCompras); // da como resultado la memoria

		// forEach para imprimir cada elemento

		// para nuestros datos del tipo string, que se almacena en una variable
		// temportal llamada producto te-mporal, que se esta llenando en un arreglo
		// llamado lista de compras, vas a imprimir ese producto temporal.

		for (String productoTemporal : listaDeCompras) {
			System.out.println(productoTemporal);
		}

		// Declaro mi Arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];

		// Inicializco o asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[8] = "109";
		habitaciones[9] = "110";

		//habitaciones[10] = "111"; // Si tratamos de acceder a un elemento mas alla de los elementos declaradosal
									// principio, tendremos una excepcion que solo veremos cuando se ejecute el
									// programa./

		// Cuando imprimimon un elemento que no esta definido dentro del arreglo,
		// veremos un null. Esto pasa porque para JAVA es preferible tener un elemento
		// nulo a un indefinido.
		System.out.println(habitaciones[8]);

		// En caso de querer usar un for each para imprimir los elementos, solo se
		// imprimiran 7 elementos. (Solo itera sobre los elementos existentes).
		for (String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}
		
		//ArrayList
		
		List<Cliente> listaDeClientes = new ArrayList<>();
		
		//primero hago la instancia
		
		Cliente Felipe = new Cliente("Felipe","ABC1233",156.50f,"1234");
		
		listaDeClientes.add(Felipe);// luego se agrega a la lista
		
		listaDeClientes.add(new Cliente("Naruto","XXXXX",100.00f,"3333")); //en un sola linea
		
		
		System.out.println(listaDeClientes);
		
		
		//sacar un elemento de la lista y asignarlo a una variable
		
		
		
		System.out.println("Lista completa");
		System.out.println(listaDeClientes);
		
		System.out.println("impresion de un elemento de la lista");
		Cliente datoDeLaLista= listaDeClientes.get(0);
		System.out.println(datoDeLaLista);
		
		// eliminar datos de la lista
		
		listaDeClientes.remove(0);
		
		// imprimo datos de la lista
		
		System.out.println();
		System.out.println(listaDeClientes);
		
		Set<String> roomService=new HashSet<>();
		
		roomService.add("chilaquiles");
		roomService.add("agua mineral");
		roomService.add("wifi");
		
		//Hotel con promo
		
		if(roomService.contains("agua mineral")) {
			System.out.println("obtienes un descuento del 50%");
		}
		
		System.out.println(roomService); // si imprime la lista porque el set esta usando elementos string
		
		
		//HashMap para mi sistema de reservas
		
		Map<String, Cliente> reservaHabitacion =new HashMap<>();
		
		
		
		
		
		
		
	

		
		//Primero crear mis objetos y luego agregarlos
		// Hacre lo mismo, en una sola linea
		
		

	}// cierre main

}// cierre clase

/*
 * 
 * instanciando un espacio donde guardar objetos
 * 
 * Set<String> cartasDeJuego = new HashSet<>();
 * 
 * 
 * Colecciones:
 *
 * - Arrays
 * 
 * Un array es una estructura de datos linea que contiene elementos del mismo
 * tipo. La longitud de un array se establece al momento de crearlo y no puede
 * cambiar. No cuenta con metodos adicionales para agregar o eliminar elementos.
 * Los elementos estan almacenados de forma contigua en memoria, y se puede
 * acceder a ellos a traves de un indice. Sus principales caracteristicas son:
 * 
 * 1. Tamanio fijo. 2. Acceso rapido. 3. Coste elevado para insertar o eliminar
 * elementos.
 *
 *
 *- ArrayList
 *
 *es una implementacion de una coleccion llamada list(interface superior), y se utiliza mucho para almacenar elementons de una forma dinamica. Las principales caracteristicas  de una ArrayList son:
 *
 *1.- Tamaño dinámico
 *2.- Acceso rapido
 *
 *-Set
 *es una estructuira de datos que almacena elementos unicos sin orden especifico. Las principales caracteristicas de un set son:
 *1.- No hay elementos duplicados
 *2.- No hay orden especifico
 *2.-Busqueda es mas rapida (key-value)
 *
 *
 *
 * 
 * 
 * 
 */