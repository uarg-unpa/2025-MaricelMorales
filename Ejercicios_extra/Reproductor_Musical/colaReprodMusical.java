package Ejercicios_extra.Reproductor_Musical;

public class colaReprodMusical {
    private final int max = 20;
    private claseTemaMusical[] temas;
    private int frente;
    private int ultimo;

    public colaReprodMusical() {
        temas = new claseTemaMusical[max];
        frente = -1;
        ultimo = -1;
    }

    private int siguiente(int i) {
        if (i == max - 1) {
            return 0;
        } else {
            return i + 1;
        }
    }

    public boolean estaVacia() {
        return frente == -1;
    }

    public boolean estaLlena() {
        return siguiente(ultimo) == frente;
    }

    public void agregarTema(claseTemaMusical tema) {
        if (estaLlena()){
            return;
        }

        if (estaVacia()){
            frente = 0;
        }

        ultimo = siguiente(ultimo);
        temas[ultimo] = tema;
    }

    public void reproducirListaCompleta(){
        if (estaVacia()) {
            return;
        }

        int i = frente;

        do {
            temas[i].mostrarTema(); //reproduce el tema actual
            i = siguiente(i); //avanza al siguiente índice
        } while (i != siguiente(ultimo));
    }

}