package RECURSIVIDAD.ParaPracticar;

import java.util.Scanner;

public class SumaVector {
    public static int sumarVector(int[] v, int i) {
        if (i == v.length) {
            return 0; 
        } else {
            return v[i] + sumarVector(v, i + 1); 
        }
    }
    
    public static int sumarDigitos(int n) {
        if (n == 0) {
            return 0; 
        } else {
            return (n % 10) + sumarDigitos(n / 10); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Ingresa un número positivo: ");
            numero = sc.nextInt();
        } while (numero < 0); 

        int suma = sumarDigitos(numero);
        System.out.println("La suma de los dígitos es: " + suma);

        sc.close();
    }
}
