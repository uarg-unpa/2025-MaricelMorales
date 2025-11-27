package RECURSIVIDAD;

public class Ejercicio7 {
    public static int vocales(String cd, int i){
        if (cd.length() == i) {
            return 0; 
        } else if( cd.charAt(i) == 'a' || cd.charAt(i) == 'e' || cd.charAt(i) == 'i' || cd.charAt(i) == 'o' || cd.charAt(i) == 'u' ||
            cd.charAt(i) == 'A' || cd.charAt(i) == 'E' || cd.charAt(i) == 'I' || cd.charAt(i) == 'O' || cd.charAt(i) == 'U') {

             return 1+ vocales(cd, i+1);
        } else {
            return vocales(cd, i+1);
        }  

    }
    public static void main(String[] args) {        
        String palabra = "Murcielago";
        System.out.println("La palabra " + palabra + " cuenta con " + vocales(palabra, 0) +" vocales");

        String palabra2 = "Abecedario";
        System.out.println("La palabra " + palabra2 + " cuenta con " + vocales(palabra2, 0) +" vocales");

   
    } 
}
