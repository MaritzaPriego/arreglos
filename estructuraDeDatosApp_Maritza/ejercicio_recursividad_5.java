package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_5 {
		public static void main(String[] args) {  //este permite ejecutar el código 
		int[][] m = {
		{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
		};
		//se declaran la variable con int que es para un tipo de dato entero
		//llamada inicial
		recorrerMatrizRecursivo(m, 0, 0);
		}
		public static void recorrerMatrizRecursivo(int[][] m, int i, int j) {
		// se muesta el numero (sin salto de linea)
		System.out.print(m[i][j] + " ");
		//
		if (i != m.length - 1 || j != m[i].length - 1) {
		//Indica si es que llega al final de la fila
		if (j == m[i].length - 1) {
		//continua a la siguente
		i++;
		//Reinicia la j
		j = 0;
		//hace un salto de linea (solo formato)
		System.out.println(""); //imprime
		} else {
		//Pasa a la siguiente columna
		j++;
		}
		//se vuelve a llamar la función recursivamente
		recorrerMatrizRecursivo(m, i, j);
		}
	}
	

}
