package RECURSIVIDAD;
/*
1) A partir de un vector de enteros:
a. Buscar el menor elemento 
b. Buscar el mayor elemento
c. Calcular el promedio de los elementos 
*/
public class RecursividadVector{
   
   public static void main(String args []){
      // Constantes y variables
      final int dim = 4;
      int resultado;
      // Declaración y creación de vector
      int [] vector = new int [dim];
      // Carga aleatoria de vector
      for (int i=0; i<dim; i++){
         vector[i] = (int) (Math.random() * dim) + 1;  
      }
      // Muestra de vector
      for (int i=0; i<dim; i++){
         System.out.print(vector[i] + " | ");
      }
       
      resultado = buscarMenor(vector, dim-1, vector[dim-1]);
      System.out.println("");
      System.out.println("Elemento menor: " + resultado);
      resultado = buscarMayor(vector, dim-1, vector[dim-1]);
      System.out.println("");
      System.out.println("Elemento mayor: " + resultado);
      resultado = sumaVector(vector, dim-1);
      System.out.println("");
      System.out.println("Suma: " + resultado);
      resultado = calcularPromedio(vector, dim-1);
      System.out.println("");
      System.out.println("Promedio: " + resultado);

   }
   
   public static int buscarMenor(int v[], int n, int menor){
   
      if (n < 0){   // caso base
         return menor;
      }else{         // caso general
         if (v[n] < menor)         
            return buscarMenor(v,n-1,v[n]);
         else
            return buscarMenor(v,n-1,menor);
      }
   } 
   
   public static int buscarMayor(int v[], int n, int mayor){
   
      if (n < 0){   // caso base
         return mayor;
      }else{         // caso general
         if (v[n] > mayor)         
            return buscarMayor(v,n-1,v[n]);
         else
            return buscarMayor(v,n-1,mayor);
      }
   }
   
   public static int calcularPromedio(int v[], int n){
      int prom = sumaVector(v,n) / (n+1);
      return prom;
   }
   
   public static int sumaVector(int v[], int n){   
      // caso base: n == 0
      // llamador mas pequeño: v, n-1
      // caso general: sV(v,n-1) + v[n]
      if (n == 0){
         return v[n];
      }else{
         return sumaVector(v,n-1) + v[n];
      }
   }
}