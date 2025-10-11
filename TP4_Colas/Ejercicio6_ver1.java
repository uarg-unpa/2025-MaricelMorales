package TP4_Colas;

import java.util.Scanner;
/* 
6. Escribir un método en la clase cola que tenga como argumento una cola del mismo tipo y devuelva verdadero o falso si las dos colas son o no idénticas (tienen el mismo tamaño y poseen los mismos elementos), respectivamente. Nota: no olvidar que, si bien la cola se implementa como un arreglo, no debería manejarse como tal. 
*/
 
public class Ejercicio6_ver1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Primera cola
        System.out.print("Ingrese el tamaño máximo de la cola: ");
        int tamaño1 = sc.nextInt();
        
        Cola cola1 = new Cola(tamaño1);

        for (int i = 0; i < tamaño1; i++) {
            System.out.print("Ingrese un comando: ");
            int comando1 = sc.nextInt();
            cola1.encolar(comando1);
        }
        cola1.mostrarCola();

        //Segunda cola
        System.out.print("Ingrese el tamaño máximo de la cola: ");
        int tamaño2 = sc.nextInt();
        
        Cola cola2 = new Cola(tamaño2);

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

class Cola {
    private int tamaño;
    private int[] elementos;
    private int ultimo;

    public Cola(int tamaño) {
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
        if (estaVacia()) {
            return '\0';
        }
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
        return '\0';
    }

    public boolean colasIdenticas(Cola cola2){
        if (this.getTamaño() == cola2.getTamaño()) {
            
            Cola cola1_aux = new Cola(this.getTamaño());
            Cola cola2_aux = new Cola(cola2.getTamaño());
            
            //Se compara cada elemento 
            while (!this.estaVacia() && !cola2.estaVacia()){
                int dato1 = this.desencolar();
                int dato2 = cola2.desencolar();

                //Se guarda y compara los elementos de las dos colas
 
                if (dato1 != dato2) {
                    //si los datos son distintos se los encola en un cola auxiliar
                    cola1_aux.encolar(dato1);
                    cola2_aux.encolar(dato2);

                    //Se revierte lo borrado anteriormente en las colas originales 
                    while (!cola1_aux.estaVacia()) {
                        this.encolar(cola1_aux.desencolar());
                    }
                    while (!cola1_aux.estaVacia()) {
                        cola2.encolar(cola2_aux.desencolar());
                    }

                    //Como no son iguales devuelve falso
                    return false;
                }
                    //Si son iguales, los guardamos para restaurar después
                    cola1_aux.encolar(dato1);
                    cola2_aux.encolar(dato2);
            }
            
            //Se restauran las colas originales
            while (!cola1_aux.estaVacia()) {
                this.encolar(cola1_aux.desencolar());
            }
            while (!cola2_aux.estaVacia()) {
                cola2.encolar(cola2_aux.desencolar());
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