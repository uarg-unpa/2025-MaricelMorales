/*
10. Escribe un método recursivo que encuentre el valor mínimo en un arreglo de enteros.
Pista: Divide el problema en dos partes: el elemento actual y el mínimo de los elementos restantes
del arreglo.
 */

package RECURSIVIDAD;

public class Ejercicio10{
    public static int valorMinimo(int [] arr, int n, int indice){
        if (indice==arr.length-1){
            return arr.[indice];
        } else{
            int minResto= valorMinimo(arr, n, indice+1);
            if(arr[indice]<minResto){
                return arr[indice];
            } else{
                return minResto;
            }
        }
    } 
    public static void main(String[] args) {
        
    }
}