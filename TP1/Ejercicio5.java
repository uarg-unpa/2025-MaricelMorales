package TP1;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.print("Ingrese la inicial de un día de la semana (L, M, I, J, V, S, D): ");
                String dia = scan.nextLine().toUpperCase();

                if ( dia.equals("M") || dia.equals("I") || dia.equals("J")) {
                    System.out.println("HOY TENGO RESOLUCION");
                } else if (dia.equals("L") |dia.equals("V") |dia.equals("S") || dia.equals("D")) {            
                    System.out.println("Hoy no hay resolución");
                } else {
                    System.out.println("Ese no es un dia");
                }
                
        scan.close();
    }
}
