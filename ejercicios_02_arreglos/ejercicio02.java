package ejercicios_02_arreglos;

public class ejercicio02 {
	public static void main(String[] args) { 
		int[] numeros=new int[100];
		int suma=0;
		for(int i=0;i<numeros.length;i++){
		numeros[i]=i+1;
		suma+=numeros[i];
		}
		System.out.println("La suma es "+suma);
		}
		}
}
