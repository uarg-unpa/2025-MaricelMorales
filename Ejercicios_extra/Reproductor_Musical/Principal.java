package Ejercicios_extra.Reproductor_Musical;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        colaReprodMusical reproductor = new colaReprodMusical();

        System.out.print("¿Cuántos temas querés agregar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Agregá tus temas musicales:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Intérprete: ");
            String interprete = sc.nextLine();
            System.out.print("Género: ");
            String genero = sc.nextLine();
            System.out.print("Año: ");
            int anio = sc.nextInt();
            sc.nextLine(); // Limpia el buffer

            claseTemaMusical tema = new claseTemaMusical(titulo, interprete, genero, anio);
            reproductor.agregarTema(tema);

        }

        System.out.println("Reproduciendo lista completa:");
        reproductor.reproducirListaCompleta();
        sc.close();
    }
}
