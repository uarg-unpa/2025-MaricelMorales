package RECURSIVIDAD;

/*4. Escribir un método recursivo que calcule la siguiente suma: 
1 + 2 + 3 + … + (n - 1) + n  */

public class Ejercicio5 {
    public static int sumaPares(int num) {
        if (num <= 0) {
            return 0; 
        } else if (num % 2 == 0) {
            return num + sumaPares(num - 2); 
        } else {
            return sumaPares(num - 1); 
        }
    }

    public static void main(String[] args) {
        int resultado1 = sumaPares(9);
        System.out.println(resultado1);  
        
        int resultado2 = sumaPares(14);
        System.out.println(resultado2);  
    }  
}