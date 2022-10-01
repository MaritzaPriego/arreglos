package ejercicios_01_arreglos;

public class ejercicio_01 {//inicar el metodo
		public static void main(String[] args) {//iniciar metodo main
		//Creo el array
		int[] numeros=new int[100];
		//Lo recorro y le asigno números
		for(int i=0;i<numeros.length;i++){
		numeros[i]=i+1;//se suma cada vez un valor
		System.out.println(numeros[i]); //imprimir el numero cada vez que se sume el valor
		}
	}
}

