package RECURSIVIDAD;
/*

9. Escribe un método recursivo que determine si un número está presente en un arreglo. Devuelve true si el número se encuentra en el arreglo y false en caso contrario. 
Pista: El caso base es cuando el tamaño del arreglo es 0, en cuyo caso el número no está presente. De lo contrario, verifica el primer elemento del arreglo y llama recursivamente con el resto del arreglo.  */
public class Ejercicio9 {
    public static encontrarNum(int [] arregloNumeros, int numeroAEncontrar, int indice){
        if(arregloNumeros.length== indice){
            return false;

        } else if (arregloNumeros[indice]==numeroAEncontrar){
            return true;
        } else{
            return false;
        }

    }
    public static void main(String[] args) {
        
    }
}