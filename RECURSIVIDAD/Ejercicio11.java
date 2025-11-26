package RECURSIVIDAD;

/*11. Escribe un método recursivo que cuente las ocurrencias de un número dado en un arreglo de enteros. 
Pista: Compara el elemento actual con el número buscado y llama recursivamente con el resto del arreglo.  */
public record Ejercicio11() {
    public static int contarOcurrencia(int [] arregloNumeros, int numeroAEncontrar, int indice){
        if(arregloNumeros.length== indice){
            return 0;

        } else if (arregloNumeros[indice]==numeroAEncontrar){
            return 1+contarOcurrencia(arregloNumeros, numeroAEncontrar, indice +1);
        } else{
            return contarOcurrencia(arregloNumeros, numeroAEncontrar, indice+1);
        }

    }
    public static void main(String[] args) {
        
    }
    
}
