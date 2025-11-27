package TP1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C, AUX;

        System.out.print("Ingrese valor de A: ");
        A = scan.nextInt();
        System.out.print("Ingrese valor de B: ");
        B = scan.nextInt();
        System.out.print("Ingrese valor de C: ");
        C = scan.nextInt();

        B = A;
        AUX = C;
        C = A;
        A = AUX;

        System.out.println("Valores intercambiados:");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        scan.close();
    }
}