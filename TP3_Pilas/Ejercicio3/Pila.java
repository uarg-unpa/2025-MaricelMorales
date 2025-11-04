package TP3_Pilas.Ejercicio3;

public class Pila {
    private char[] elementos;
    private int cima;
    private int MAX;

    public Pila(int MAX) {
        this.MAX = MAX;
        elementos = new char[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void meter(char elemento) {
        cima++;
        elementos[cima] = elemento;
    }

    public char sacar() {
        char elemento = elementos[cima];
        cima--;
        return elemento;
    }
}
