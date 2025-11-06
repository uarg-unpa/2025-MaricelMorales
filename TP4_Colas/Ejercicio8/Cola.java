package TP4_Colas.Ejercicio8;

public class Cola {
    private char[] cadena = new char[100];
    private int frente = 0;
    private int fin = -1;

    public void encolar(char c) {
        cadena[++fin] = c;
    }

    public char desencolar() {
        return cadena[frente++];
    }

    public boolean estaVacia() {
        return frente > fin;
    }
}
