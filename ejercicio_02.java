package ejercicios_01_arreglos;

public class ejercicio_02 {//iniciar metodo
		public static void main(String[] args) { //iniciar metodo main
		//Creo un array
		int[] numeros=new int[100];
		//Declaro las variables necesarias
		int suma=0;
		double media;
		//Recorro el arreglo, asigno n�meros y sumo
		for(int i=0;i<numeros.length;i++){
		numeros[i]=i+1;
		suma+=numeros[i];
		}
		//Calculo la media y muestro la suma y la meda
		System.out.println("La suma es "+suma);
		media=(double)suma/numeros.length;
		System.out.println("La media es "+media);
		}
	}

