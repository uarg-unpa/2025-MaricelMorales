package Ejercicios_extra.Contador_de_energia;

public class PilaEnergia {
    private int[] elementos;
    private int cima;
    private int MAX;

    public PilaEnergia(int MAX) {
        this.MAX = MAX;
        elementos = new int[MAX];
        cima = -1;
    }

    public boolean estaVacia() {
        return cima == -1;
    }
    public boolean estaLlena() {
        return cima == MAX - 1;
    }

    public boolean meter(int nivel) {
        if (!estaLlena()) {
            cima++;
            elementos[cima] = nivel;
            return true;
        }
        return false;
    }

    public int sacar() {
        int elemento = elementos[cima];
        cima--;
        return elemento;
    }

    public int elementoCima() {
        return elementos[cima];

    }

    public int contarVecesAparece(int nivelAContar) {
        int contador = 0;
        PilaEnergia auxiliar = new PilaEnergia(nivelAContar);

        while (!estaVacia()) {
            int aux_nivelAContar = sacar();
            if (aux_nivelAContar == nivelAContar) {
                contador++;
            }
            auxiliar.meter(aux_nivelAContar);
        }

        while (!auxiliar.estaVacia()) {
            meter(auxiliar.sacar());
        }

        return contador;
    }

    // este método viola el principio LIFO, se debe utilizar meter y sacar
    // public int contarVecesAparece(int nivelAContar) {
    //     int contador = 0;
    //     for (int i = 0; i <= cima; i++) {
    //         if (elementos[i] == nivelAContar) {
    //             contador++;
    //         }
    //     }
    //     return contador;
    // }

    // No se puede public void mostrarPila() {
    //     if (estaVacia()) {
    //         System.out.println("La pila está vacia");
    //         return;
    //     }

    //     System.out.println("Niveles de energia en la pila:");
    //     for (int i = cima; i >= 0; i--) {
    //         System.out.println("| " + elementos[i] + " |");
    //     }
    //     return;
    // }
}