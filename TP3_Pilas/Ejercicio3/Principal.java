package TP3_Pilas.Ejercicio3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        Pila pila = new Pila(palabra.length());

        for (int i = 0; i < palabra.length(); i++) {
            pila.meter(palabra.charAt(i));
        }

        System.out.print("Palabra invertida: ");
        while (!pila.estaVacia()) {
            System.out.print(pila.sacar());
        }
        System.out.println();
        scanner.close();
    }
}

