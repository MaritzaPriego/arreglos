package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_4 {
		public static void main(String[] args) { //este permite ejecutar el codigo
		int elementoBuscar=3;
		int posElementoEncontrado=posicionElementoRecursivo(array, elementoBuscar,0);
		//se declaran las variables con int que es para un tipo de dato entero
		System.out.println(posElementoEncontrado);
		} //se imprime la variable declarada con el nombre posElemento encontardo
		public static int posicionElementoRecursivo(int[] array, int elementoBuscar ,int indice){
		if(indice==array.length || array[indice]==elementoBuscar){
		if(indice==array.length){ //se establece una condicion
		return -1; //retorna lo que contiene la variable indice si se cumple la condicion 
		}else{
		return indice;
		} //retorna lo que contiene la variable indice si no se cumple la condicion 
		}else{
		return posicionElementoRecursivo(array, elementoBuscar, indice+1);
		}
	}
}



