package RECURSIVIDAD.ParaPracticar;
/*escribe una funcion recursiva que calcule el maximo elemento en un vector de enteros */

public class calcularMaximo {
    public static int calMaximo(int [] vector, int indice){
        if(indice==vector.length-1){
            return  vector[indice];
        } else{
            int valorMaximo= calMaximo(vector, indice+1);
            if(vector[indice]>valorMaximo){
                return vector[indice];
            } else{
                return valorMaximo;
            }
        }
    }

    public static int sumaMultiploDe3(int n){
        if (n < 3) {
            return 0; 
        } else if (n % 3 == 0) {
            return n + sumaMultiploDe3(n - 1); 
        } else {
            return sumaMultiploDe3(n - 1); 
        }
    }

    public static void main(String[] args) {
        int[] numeros = {58, 912, 93, 19, 7, 25, 100};

        int maximo = calMaximo(numeros, 0);

        System.out.println("El máximo del vector es: " + maximo);
    }

}
