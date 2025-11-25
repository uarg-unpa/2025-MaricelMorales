package RECURSIVIDAD;

/*4. Escribir un método recursivo que calcule la siguiente suma: 
1 + 2 + 3 + … + (n - 1) + n 
 */

public class Ejercicio4 {
    public static int suma(int num){
        if (num==0) {return 0;}
        else {
            return num + suma(num-1);
        }
    }
    public static void main(String[] args) {
        int resultado = suma(4);
        System.out.println(resultado);        
    }
    
}
