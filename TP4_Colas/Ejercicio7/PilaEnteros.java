package TP4_Colas.Ejercicio7;

public class PilaEnteros {
    private int[] elementos;
    private int cima;
    private final int MAX = 10;

    public PilaEnteros() {
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }

    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public void meter(int elem) {
        cima++;
        elementos[cima] = elem;
        
    }

    public int sacar() {
        int elem = elementos[cima];
        cima--;
        return elem;
        
    }
}
