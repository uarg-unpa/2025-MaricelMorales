package TP4_Colas.Ejercicio4;

public class principal {
     public static void main(String[] args) {
        Cola4 cola = new Cola4(10); 

        cola.encolar(5);
        cola.encolar(8);
        cola.encolar(3);

        System.out.println("Cantidad de elementos en la cola: " + cola.contar());

        int eliminado = cola.desencolar();
        System.out.println("Elemento eliminado: " + eliminado);

        System.out.println("Cantidad de elementos en la cola despues de borrar: " + cola.contar());

        cola.encolar(7);

        System.out.println("Cantidad de elementos en la cola: " + cola.contar());
    }
}
