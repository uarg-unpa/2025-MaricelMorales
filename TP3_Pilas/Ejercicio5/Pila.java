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
        if (!estaLlena()) {
            cima++;
            elementos[cima] = elemento; 
        } 
    }
    public int sacar() {
        if (!estaVacia()) {
            int elemento = elementos[cima];
            cima--;
            return elemento;
        } else {
            return -1; 
        }
    }

    //El metodo que cumple con la funcion de la consigna 
    public int elementoCima() {
        if (!estaVacia()) {
            return elementos[cima];
        } else {
            return -1; 
        }
    }

    public void MostrarPila(){
        if (estaVacia()) {
            System.out.println("La pila está vacia");
            return;
        }

        System.out.print("Pila: ");
        for (int i = 0; i <= cima; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

}