package RECURSIVIDAD;
/*7. Escribir un método recursivo int vocales(String cd) para calcular el número de vocales de una cadena. 
 */

public class Ejercicio7 {
    public static int vocales(String cd, int i){
        if (cd.length() == i) {
            return 0; 
        }
        
        int suma = 0;
        if (cd.charAt(i) == 'a' || cd.charAt(i) == 'e' || cd.charAt(i) == 'i' || cd.charAt(i) == 'o' || cd.charAt(i) == 'u' ||
            cd.charAt(i) == 'A' || cd.charAt(i) == 'E' || cd.charAt(i) == 'I' || cd.charAt(i) == 'O' || cd.charAt(i) == 'U') {
            suma = 1;
        }

        return suma + vocales(cd, i+1);

    }
    public static void main(String[] args) {        
        String palabra = "Murcielago";
        System.out.println("La palabra " + palabra + " cuenta con " + vocales(palabra, 0) +" vocales");

        String palabra2 = "Abecedario";
        System.out.println("La palabra " + palabra2 + " cuenta con " + vocales(palabra2, 0) +" vocales");

   
    } 
}
