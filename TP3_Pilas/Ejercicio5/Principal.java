package TP3_Pilas.Ejercicio5;

public class Principal {
    public static void main(String[] args) {
        Pila pila = new Pila(5);

        pila.meter(4);
        pila.meter(13);
        pila.meter(92);

        pila.MostrarPila();

        int ElemCima = pila.elementoCima();
        if (ElemCima == -1) {
            System.out.println("La pila está vacia. No hay elemento en la cima");
        } else {
            System.out.println("En la cima se encuentra el número: " + ElemCima); 
        }

        int elemSacado = pila.sacar();
        if (elemSacado == -1) {
            System.out.println("No hay nada para sacar, la pila está vacia");
        } else {
            System.out.println("Se sacó el elemento " + elemSacado); 
        }
        
        ElemCima = pila.elementoCima();
        if (ElemCima == -1) {
            System.out.println("No hay nada para sacar, la pila está vacia");
        } else {
            System.out.println("En la cima se encuentra el número: " + ElemCima);
        }

        elemSacado = pila.sacar(); 
        System.out.println("Se sacó el elemento " + elemSacado); 

        elemSacado = pila.sacar(); 
        System.out.println("Se sacó el elemento " + elemSacado); 


        elemSacado = pila.sacar();
        if (elemSacado == -1) {
            System.out.println("No hay nada para sacar, la pila está vacia");
        } else {
            System.out.println("En la cima se encuentra el número: " + elemSacado);
        }
    }
}