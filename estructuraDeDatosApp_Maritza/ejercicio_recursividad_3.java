package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_3 {
		public static void main(String[] args) {
		int[] array={1,2,3,4,5}; //Creamos un array ya proporciona m�todos para efectuar operaciones de recorrido y de mutaci�n.
		mostrarArrayRecursivo(array, 0); //Pasamos el array y la posicion donde empieza
		}
		public static void mostrarArrayRecursivo(int[] array, int indice){ //este permite ejecutar el codigo con los indicadores que se
			//encuentran entre paremtesis
		/*1� forma*/
		
		if (indice == (array.length-1)){
		System.out.println(array[indice]);
		}else{
		System.out.println(array[indice]);
		//Se llama de manera recursiva a la funci�n
		mostrarArrayRecursivo(array, indice+1);
		}
		
		/*2� forma*/
		if (indice != array.length){
		//se muestra el valor en ese indice
		System.out.println(array[indice]);
		//Se llama de manera recursiva a la funci�n
		mostrarArrayRecursivo(array, indice+1);
		}
	}
}   

