package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_7 {
	//se crea una clase y un metodo main
		public static void main(String[] args) {
			//se crea una variable
		int a = 254; //400 + 50 + 2
		System.out.println(invertirNum(a, 2));
		}
		public static int invertirNum(int num, int pos){
		//Si es menor que 10 devuelvo el numero (el ultimo numero)
		if(num < 10){
		return num;
		}else{
		//modulo del numero y se multiplica por la potencia (4 * 100) por ejemplo
		return (num % 10) * (int) Math.pow(10, pos) + (invertirNum(num/10, pos-1));
		}
	}

}
