package TP3_Pilas.Ejercicio5;

public class Pila {
    //Atrubutos
    private int[] elementos;
    private int cima;
    private int MAX;

    //Constructor
    public Pila(int MAX) {
        this.MAX = MAX;
        elementos = new int[MAX];
        cima = -1;
    }
    //Metodos basicos
    public boolean estaVacia() {
        return cima == -1;
    }
    public boolean estaLlena() {
        return cima == MAX - 1;
    }
    public void meter(int elemento) {
        cima++;
        elementos[cima] = elemento; 
        
    }
    public int sacar() {
        int elemento = elementos[cima];
        cima--;
        return elemento;
    }

    public int elementoCima() {
        return elementos[cima];
    }
}