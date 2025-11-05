package Ejercicios_extra.Reproductor_Musical;

public class claseTemaMusical {
    private String titulo;
    private String interprete;
    private String genero;
    private int anio;

    public claseTemaMusical(String titulo, String interprete, String genero, int anio) {
        this.titulo = titulo;
        this.interprete = interprete;
        this.genero = genero;
        this.anio = anio;
    }
    
    public void mostrarTema() {
        System.out.println("Título: " + titulo + ", Intérprete: " + interprete + ", Género: " + genero + ", Año: " + anio);
    }

}
