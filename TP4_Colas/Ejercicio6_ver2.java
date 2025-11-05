package TP4_Colas;

import java.util.Scanner;
 
public class Ejercicio6_ver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Primera cola
        System.out.print("Ingrese el tamaño máximo de la cola: ");
        int tamaño1 = sc.nextInt();
        
        Cola2 cola1 = new Cola2(tamaño1);

        for (int i = 0; i < tamaño1; i++) {
            System.out.print("Ingrese un comando: ");
            int comando1 = sc.nextInt();
            cola1.encolar(comando1);
        }

        cola1.mostrarCola();

        //Segunda cola
        System.out.print("Ingrese el tamaño máximo de la cola: ");
        int tamaño2 = sc.nextInt();
        
        Cola2 cola2 = new Cola2(tamaño2);

        for (int i = 0; i < tamaño2; i++) {
            System.out.print("Ingrese un comando: ");
            int comando2 = sc.nextInt();
            cola2.encolar(comando2);
        }

        cola2.mostrarCola();

        //Se comparan las colas
        if (cola1.colasIdenticas(cola2)) {
            System.out.println("Las colas son iguales");
        } else {
            System.out.println("Las colas son distintas");
        }

        sc.close();
    }
}

class Cola2 {
    private int tamaño;
    private int[] elementos;
    private int ultimo;

    public Cola2(int tamaño) {
        this.tamaño = tamaño;
        elementos = new int[tamaño];
        ultimo = 0; 
    }

    public int getTamaño(){
        return tamaño;
    } 

    public int[] getElementos(){
        return elementos;
    } 
    public boolean estaVacia() {
        return ultimo == 0;
    }

    public boolean estaLlena() {
        return ultimo == tamaño;
    }

    public void encolar(int comando) {
        if (!estaLlena()) {
            elementos[ultimo] = comando;
            ultimo++;
        }
    }

    public int desencolar() {
        int frente = elementos[0];

        int i = 0;
        while ( i < ultimo - 1) {
            elementos[i] = elementos[i + 1];
            i++;
        }

        ultimo--;
        return frente;
    }

    public int peek() {
        if (!estaVacia()) {
            return elementos[0]; 
        }
        return -1;
    }

    public boolean colasIdenticas(Cola cola2){
        if (this.getTamaño() == cola2.getTamaño()) {
            //Se compara cada elemento 
            while (!this.estaVacia() && !cola2.estaVacia()){
                int dato1 = this.peek();
                int dato2 = cola2.peek();

                //Se guarda y compara los elementos de las dos colas
 
                if (dato1 != dato2){
                    //Como no son iguales devuelve falso
                    return false;
                }else{
                    //Se desencola para poder avanzar
                    this.desencolar();
                    cola2.desencolar();
                }
            }
            return true;

        } else {
            return false;
        }
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