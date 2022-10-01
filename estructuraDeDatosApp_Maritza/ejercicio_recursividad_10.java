package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_10 {
		public static void main(String[] args) {
		int numero = 123;
		System.out.println(sumaDigitos(numero));
		}
		public static int sumaDigitos(int numero){
		if(numero < 10){ //caso base
		return numero; //devuelve el numero
		}else{
		return (numero % 10) + sumaDigitos(numero/10); //tomo el digito y llamo a la funcion
		}
	}
}
