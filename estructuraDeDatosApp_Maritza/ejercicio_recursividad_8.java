package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_8 {
	//se crea una clase y un metodo main
		public static void main(String[] args) {
		String palabra = "Hola";
		//se invoca el argumuento
		System.out.println(invertirPalabra(palabra, palabra.length()-1));
		} // va a imprimir lo que contenga la clase invertirPalabra
		//se crea una clase
		//se le otorga el contenido del string palabra que es de tipo texto al int longitud para que se contabilicen los caracteres 
		public static String invertirPalabra(String palabra, int longitud){
		// si la variable longitud es igual a 0 entra y retorna un espacio en blanco
		if(longitud==0){
		return palabra.charAt(longitud)+"";
		// si no es igual a 0 retorna la palabra invertida 
		}else{
		return palabra.charAt(longitud) + (invertirPalabra(palabra, longitud-1));
		}
	}

}
