package TP4_Colas.Ejercicio7;

public class Principal { 
    public static void main(String[] args) {
        PilaEnteros pila = new PilaEnteros();
        ColaPares cola = new ColaPares();

        if (!pila.estaLlena()) {
            pila.meter(3);
        }
        if (!pila.estaLlena()) {
            pila.meter(2);
        }
        if (!pila.estaLlena()) {
            pila.meter(8);
        }
        if (!pila.estaLlena()) {
            pila.meter(5);
        }
        if (!pila.estaLlena()) {
            pila.meter(12);
        }
        if (!pila.estaLlena()) {
            pila.meter(98);
        }
        if (!pila.estaLlena()) {
            pila.meter(32);
        }
        if (!pila.estaLlena()) {
            pila.meter(1116);
        }
        if (!pila.estaLlena()) {
            pila.meter(06);
        }
        if (!pila.estaLlena()) {
            pila.meter(54);
        }
        if (!pila.estaLlena()) {
            pila.meter(32);
        }

        // Sacamos de la pila y si es par, lo ponemos en la cola
        while (!pila.estaVacia()) {
            int elem = pila.sacar();
            if (elem % 2 == 0) {
                cola.encolar(elem);
            }
        }

        ColaPares cAuxiliar = new ColaPares();

        System.out.println("Elementos pares en la cola:");
        while (!cola.estaVacia()) {
            int elem = cola.desencolar();
            System.out.println(elem);
            cAuxiliar.encolar(elem); 
        }

        while (!cAuxiliar.estaVacia()) {
            cola.encolar(cAuxiliar.desencolar());
        }

    }
}
