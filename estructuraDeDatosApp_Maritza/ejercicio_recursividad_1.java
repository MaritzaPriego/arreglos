package estructuraDeDatosApp_Maritza;

public class ejercicio_recursividad_1 {
    public static void main(String[] args) {
      int n=11;
//guardamos el resultado en una variable
      int resultado=sumaRecursiva(n);
//Mostramos el resultado
  System.out.println(resultado);
  
}
public static int sumaRecursiva(int numero){
     int res;
     if(numero==10){
//Se termina la recursion
return 10;
   }else{
//Se llama a si misma la función con el parametro numero menos 1
   res = numero+sumaRecursiva(numero-1);
   }
//Devuelve el resultado
     return res;
   }
}
