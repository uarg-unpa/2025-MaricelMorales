package TP4_Colas.Ejercicio8;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Pila pila = new Pila();
        Cola cola = new Cola();

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        //insertar el carácter en pila y cola
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            pila.meter(c);
            cola.encolar(c);
        }

        //compara pila y cola
        boolean esPalindromo = true;
        while (!pila.estaVacia() && !cola.estaVacia()) {
            char desdePila = pila.sacar();
            char desdeCola = cola.desencolar();
            if (desdePila != desdeCola) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo");
        } else {
            System.out.println("La cadena no es un palíndromo");
        }

        sc.close();
    }
}
