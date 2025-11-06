package TP4_Colas.Ejercicio8;

public class Pila {
    private char[] cadena = new char[100];
    private int cima = -1;

    public void meter(char c) {
        cadena[++cima] = c;
    }

    public char sacar() {
        return cadena[cima--];
    }

    public boolean estaVacia() {
        return cima == -1;
    }
}

