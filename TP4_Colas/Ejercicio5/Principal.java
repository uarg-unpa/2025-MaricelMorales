package TP4_Colas.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Cola5 cola = new Cola5(10);

        cola.encolar(4);
        cola.encolar(7);
        cola.encolar(4);
        cola.encolar(2);
        cola.encolar(7);
        cola.encolar(9);
        cola.encolar(7);
        cola.encolar(5);

        System.out.println("Cola original:");
        cola.mostrar();

        cola.eliminarRepetidos();

        System.out.println("Cola sin repetidos:");
        cola.mostrar();
    }
}
