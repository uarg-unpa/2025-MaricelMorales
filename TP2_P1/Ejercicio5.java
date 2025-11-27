package TP2_P1;

public class Ejercicio5 {
    public static void main(String[] args) {
        Hora h1 = new Hora(13,30,15);
        Hora h2 = new Hora(22,15,60);

        System.out.println("Hora 1: " + h1.toString());
        System.out.println("Hora 1 en minutos: " + h1.obtenerHoraEnMinutos());

        System.out.println("Hora 2 (inicial): " + h2.toString());
        h2.setHora(9);
        h2.setMinutos(15);
        h2.setSegundos(20);
        System.out.println("Hora 2 (modificada): " + h2.toString());
        System.out.println("Hora 2 en minutos: " + h2.obtenerHoraEnMinutos());    
    }
}

class Hora {
    private int hora;
    private int minutos;
    private int segundos;

    public Hora ( int hora, int minutos, int segundos){
        if (esHoraValida(hora, minutos, segundos)){
            this.hora = hora;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.hora = 0;
            this.minutos = 0;
            this.segundos = 0;
        } 
    }

    private boolean esHoraValida(int h, int m, int s) {
            return (h >= 0 && h <= 23) && (m >= 0 && m <= 59) && (s >= 0 && s <= 59);
    }

     public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        }
    }

    public int obtenerHoraEnMinutos() {
        return (hora * 60) + minutos;
    }
    
    public String toString() {
        String h = (hora < 10 ? "0" : "") + hora;
        String m = (minutos < 10 ? "0" : "") + minutos;
        String s = (segundos < 10 ? "0" : "") + segundos;
        return h + ":" + m + ":" + s;
    }

}
