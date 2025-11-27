package TP4_Colas.Ejercicio7;

public class ColaPares {
    private int[] elementos;
    private int frente, fin;
    private final int MAX = 10;

    public ColaPares() {
        elementos = new int[MAX];
        frente = 0;
        fin = -1;
    }

    public boolean estaLlena() {
        return fin == MAX - 1;
    }

    public boolean estaVacia() {
        return frente > fin;
    }

    public void encolar(int elem) {
        fin++;
        elementos[fin] = elem;  
    }

    public int desencolar() {
        int elem = elementos[frente];
        frente++;
        return elem;
    }
}
