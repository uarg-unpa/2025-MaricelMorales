package TP1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int  NUM1, NUM2, NUM3;

        System.out.println("ingrese numero entero");
        NUM1= scanner.nextInt();
        System.out.println("ingrese numero entero");
        NUM2= scanner.nextInt();
        System.out.println("ingrese numero entero");
        NUM3= scanner.nextInt();

        int Producto = NUM1 * NUM2 * NUM3;
        int Suma = NUM1 + NUM2 + NUM3;

        System.out.println("Suma de enteros: "+ Suma);
        System.out.println("Producto de enteros: "+ Producto);

        scanner.close();
    }
}
