package ejercicios_02_arreglos;

import java.util.Scanner;

public class ejercicio01 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in); 
		int numeros[]=new int[15];
		int num;
		for(int i=0;i<numeros.length;i++){
		System.out.println("Inserte un n�mero en la posicion "+i);
		do{
		num=sn.nextInt();
		if(!(num>=0 && num<=10)){
		System.out.println("Error. Solo n�meros del 0 al 10. "
		+ "Inserte un n�mero en la posicion "+i);
		}
		}while(!(num>=0 && num<=10));
		numeros[i]=num;
		}
		System.out.println("Estos son los n�meros elegidos por el usuario");
		for(int i=0;i<numeros.length;i++){
		System.out.println("En la posicion "+i+" esta el valor: "+numeros[i]); //imprime numero aleatorio
		}
	}

}

