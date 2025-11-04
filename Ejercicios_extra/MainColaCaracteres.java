package Ejercicios_extra;

import java.util.Scanner;

public class MainColaCaracteres {
    public static void main(String[] args) {
        ColaCaracteres cola = new ColaCaracteres();
        Scanner sc = new Scanner(System.in);

        // Encolar 5 comandos
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un comando " + (i + 1) + ": ");
            char c = sc.next().charAt(0);
            cola.encolar(c);
        }

        cola.mostrarCola();

        // Desencolar 2 comandos
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());

        cola.mostrarCola();

        // Encolar otra vez hasta llenarla
        while (!cola.estaLlena()) {
            System.out.print("Ingrese un nuevo comando: ");
            char c = sc.next().charAt(0);
            cola.encolar(c);
        }

        cola.mostrarCola();

        // Mostrar el frente sin desencolar
        System.out.println("Peek (frente): " + cola.peek());
    
        sc.close();
    }
}

class ColaCaracteres {
    private final int max = 10;
    private char[] elementos;
    //private final int frente = 0;
    private int ultimo;

    public ColaCaracteres() {
        elementos = new char[max];
        ultimo = 0; // frente fijo en 0
    }

    public boolean estaVacia() {
        return ultimo == 0;
    }

    public boolean estaLlena() {
        return ultimo == max;
    }

    public void encolar(char comando) {
        if (!estaLlena()) {
            elementos[ultimo] = comando;
            ultimo++;
        }
    }

    public char desencolar() {
        // Se guarda el primer elemento 
        char frente = elementos[0];

        // Se desplaza todos los elementos hacia la izquierda
        int i = 0;
        while ( i < ultimo - 1) {
            elementos[i] = elementos[i + 1];
            i++;
        }

        ultimo--;

        return frente;
    }

    public char peek() {
        //Si no esta vacia, devuelve el primer elemento
        if (!estaVacia()) {
            return elementos[0]; 
        }
        return '\0';
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía");
        } else {
            System.out.print("Cola: ");
            for (int i = 0; i < ultimo; i++) {
                System.out.print(elementos[i] + " ");
            }
            System.out.println();
        }
    }
}