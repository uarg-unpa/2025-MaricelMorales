package TP4_Colas.Ejercicio4;

public class Cola4 {
    private int[] elementos;
    private int frente;
    private int finalCola;
    private final int max;

    public Cola4(int tamaño) {
        max = tamaño;
        elementos = new int[max];
        frente = 0;
        finalCola = -1;
    }

    public boolean estaLlena() {
        return (finalCola + 1) % max == frente;
    }

    public boolean estaVacia() {
        return frente == (finalCola + 1) % max;
    }

    public void encolar(int elem) {
        finalCola = (finalCola + 1) % max;
        elementos[finalCola] = elem;
    }

    public int desencolar() {
        int eliminado = elementos[frente];
        frente = (frente + 1) % max;
        return eliminado;
    }

    public int contar( ) {
        int contador = 0;
        Cola4 aux = new Cola4(max);   

        while (!this.estaVacia()) {
            int elem = this.desencolar();   
            contador++;                 
            aux.encolar(elem);       
        }
        
        while (!aux.estaVacia()) {
            this.encolar(aux.desencolar());
        }

        return contador;
    }

}
