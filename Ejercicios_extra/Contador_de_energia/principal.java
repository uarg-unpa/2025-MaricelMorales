package Ejercicios_extra.Contador_de_energia;

import java.util.Scanner; 

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Ingrese la capacidad de la pila");
        int MAX = sc.nextInt();

        PilaEnergia pila = new PilaEnergia(MAX);

        System.out.println("Ingrese niveles de energia");
        while (true) {
            int nivel = sc.nextInt();
            if (!pila.meter(nivel)) {
                System.out.println("La pila  llena. No se pudo agregar el siguiente nivel de energia: " + nivel);
                break;
            }
        }

        pila.mostrarPila();

        int ElemCima = pila.elementoCima();
        if (ElemCima == -1) {
            System.out.println("La pila está vacia. No hay elemento en la cima");
        } else {
            System.out.println("En la cima se encuentra el nivel de energia: " + ElemCima); 
        }

        System.out.print("Ingrese el valor a contar cuantas veces aparece en la pila: ");
        int nivelAContar = sc.nextInt();
        System.out.println("El valor " + nivelAContar + " aparece " + pila.contarVecesAparece(nivelAContar) + " veces");

        sc.close();
    }
}