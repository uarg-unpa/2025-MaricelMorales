package RECURSIVIDAD;
/*
2) Sumar los digitos de un número entero
*/
public class SumarDigitos{

   public static void main(String[] args){
         
        int numero = Console.readInt("Ingrese número entero");         
        System.out.println("Suma de Digitos:" + sumaDigitos(numero));
    }
     
    public static int sumaDigitos(int numero){
      
      if (numero < 10) // caso base
         return numero;
      else{            // caso general
         return sumaDigitos(numero/10) + (numero%10);
      }           
    }
}