package ejercicios_01_arreglos;


import java.util.Scanner; //importar el scanner

public class ejercicio_04 { //inicar metodo
	public static void main(String[] args) { //iniciar metodo main

		Scanner sn=new Scanner(System.in); //crear nuevo scanner

		//Pedimos una longitud
		System.out.println("Inserte una longitud");
		int longitud=sn.nextInt(); //introducido por usuario

		//creo un array con esa longitud
		int numeros[]=new int[longitud];

		//recorro el arreglo y uso la funcion para crear un aleatorio
		for(int i=0;i<numeros.length;i++){
		numeros[i]=generaNumeroAleatorio(0,10);
		System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]); //imprime numero aleatorio
		}

		}

		//Crea un numero aleatorio, entre un minimo y un maximo
		public static int generaNumeroAleatorio(int minimo, int maximo){

		return (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));

		}

		}
