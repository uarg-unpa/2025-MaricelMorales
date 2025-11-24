package TP4_Colas.Ejercicio5;

public class Cola5 {
    private int[] elementos;
    private int frente;
    private int finalCola;
    private final int max;

    public Cola5(int tamaño) {
        max = tamaño;
        elementos = new int[max];
        frente = 0;
        finalCola = -1;
    }

    public boolean estaLlena() {
        return (finalCola + 1) % max == frente;
    }

    public boolean estaVacia() {
        return frente == (finalCola + 1) % max;
    }

    public void encolar(int elem) {
        finalCola = (finalCola + 1) % max;
        elementos[finalCola] = elem;
    }

    public int desencolar() {
        int eliminado = elementos[frente];
        frente = (frente + 1) % max;
        return eliminado;
    }

    public void eliminarRepetidos() {
        Cola5 aux = new Cola5(max);

        while (!this.estaVacia()) {
            int actual = this.desencolar();
            boolean repetido = false;

            Cola5 aux2 = new Cola5(max);
            while (!aux.estaVacia()) {
                int elem = aux.desencolar();
                if (elem == actual) {
                    repetido = true;
                }
                aux2.encolar(elem); 
            }
            
            while (!aux2.estaVacia()) {
                aux.encolar(aux2.desencolar());
            }

            if (!repetido) {
                aux.encolar(actual);
            }
        }

        while (!aux.estaVacia()) {
            this.encolar(aux.desencolar());
        }
    }

    public void mostrar() {
        Cola5 aux = new Cola5(max);

        while (!this.estaVacia()) {
            int elem = this.desencolar();
            System.out.print(elem + " ");
            aux.encolar(elem);
        }
        System.out.println();

        while (!aux.estaVacia()) {
            this.encolar(aux.desencolar());
        }
    }
}
