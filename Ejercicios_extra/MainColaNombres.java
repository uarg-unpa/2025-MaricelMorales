package Ejercicios_extra;

import java.util.Scanner;

public class MainColaNombres {
    public static void main(String[] args) {
        ColaNombres cola = new ColaNombres();
        Scanner sc = new Scanner(System.in);

        // Encolar 8 nombres
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese nombre " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            cola.encolar(nombre);
        }

        cola.mostrarCola();

        // Desencolar 3 nombres
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());
        System.out.println("Desencolado: " + cola.desencolar());

        cola.mostrarCola();

        // Mostrar el frente sin desencolar
        System.out.println("Peek: " + cola.peek());

        sc.close();
    }
}

class ColaNombres {
    private final int max = 10;
    private String[] elementos;
    private int frente;
    private int ultimo;

    public ColaNombres() {
        elementos = new String[max];
        frente = -1;
        ultimo = -1;
    }

    // Método para poder avanzar circularmente
    private int siguiente(int indice) {
    if (indice == max - 1) {
        return 0; // si está al final, vuelve al inicio
    } else {
        return indice + 1; // avanza normalmente
    }
}
    public boolean estaVacia() {
        return frente == -1;
    }

    public boolean estaLlena() {
        return siguiente(ultimo) == frente;
    }

    public void encolar(String nombre) {
        if (estaLlena()) {
            System.out.println("La cola está llena. No se puede encolar.");
            return;
        }

        if (estaVacia()) {
            frente = 0;
        }

        ultimo = siguiente(ultimo);
        elementos[ultimo] = nombre;
    }

    public String desencolar() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no se puede desencolar");
            return "\0"; 
        }

        String nombre = elementos[frente];

        if (frente == ultimo) {
            // Solo había un elemento
            frente = -1;
            ultimo = -1;
        } else {
            frente = siguiente(frente);
        }

        return nombre;
    }

    public String peek() {
        if (estaVacia()) {
            System.out.println("La cola está vacía, no hay elemento en el frente");
            return "\0";
        }
        return obtenerFrente();
    }

    private String obtenerFrente() {
        return elementos[frente];
    }

    public void mostrarCola() {
        if (estaVacia()) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.print("Cola: ");
        int i = frente;
        while (true) {
            System.out.print(elementos[i] + " ");
            if (i == ultimo) break;
            i = siguiente(i);
        }
        System.out.println();
    }
}
