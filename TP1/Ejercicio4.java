package TP1;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int num1 = 1, num2 = 2, num3= 3; 

            System.out.println("ingrese un numero entero");
            num1=  scanner.nextInt();
            System.out.println("ingrese otro numero entero");
            num2=  scanner.nextInt();
            System.out.println("ingrese otro numero entero");
            num3=  scanner.nextInt();

            if (num1 > num2 & num1 > num3) {
                System.out.println("el mayor es:" + num1);
            } else {
                    if (num2 > num1 & num2 > num3) {
                        System.out.print("el mayor es: "+ num2);
                    } else{
                        System.out.println("El mayor es: "+ num3);
                    }

                }
        scanner.close();
    }
}
