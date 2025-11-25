package RECURSIVIDAD;
/*
6. Suponer que la función G está definida recursivamente de la siguiente forma: 
1  
G(x, y) =  
sí x ≤ y 
G(x, y+1) + 1 sí y < x 
Si x e y son enteros positivos. 
a) Escribir el método recursivo. 
b) Encontrar el valor de G(8, 6). 
c) Encontrar el valor de G(100, 10).  */
public class Ejercicio6 {
    public static int G (int x, int y ){
        if(x <= y){ return 1;}
        else{
            return G(x, y+1)+1;
        }
    }
    public static void main(String[] args) {
        int resultado1 = G(8,6);
        System.out.println(resultado1);  
        
        int resultado2 = G(100,10);
        System.out.println(resultado2); 
    }
    
    
}
