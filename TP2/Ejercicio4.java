package TP2;

public class Ejercicio4 {
    public static void main(String[] args) {

        Televisor tv = new Televisor("Phillips", "74823813/77", 55, 20, 29);

        System.out.println("Estado del televisor:");
        System.out.println(tv.toString());
        tv.encender();
        System.out.println("Encendiendo televisor");

        tv.subirCanal();
        System.out.println("Canal actual(+): " + tv.getCanalActual());

        tv.bajarCanal();
        System.out.println("Canal actual(-): " + tv.getCanalActual());

        tv.volverAlCanalAnterior();
        System.out.println("Cambiando al canal anterior");
        System.out.println("Canal actual: " + tv.getCanalActual());

        tv.subirVolumen();
        System.out.println("Volumen actual(+): " + tv.getVolumen());

        tv.bajarVolumen();
        System.out.println("Volumen actual(-): " + tv.getVolumen());

        tv.apagar();
        if (tv.estaEncendido() == false){
            System.out.println("Apagando televisor");
        }

        System.out.println("Estado del televisor:");
        System.out.println(tv.toString());
    }
}

class Televisor {
    private String marca;
    private String  modelo;
    private int tamaño; 
    private int volumen;
    private int canalActual;
    private int canalAnterior;
    private boolean encendido;

    public Televisor(String marca, String modelo, int tamaño, int volumen, int canalActual){
        this.marca = marca;
        this.modelo = modelo;
        this.tamaño = tamaño;
        this.volumen = volumen;
        this.canalActual = canalActual;
        this.canalAnterior = canalActual; 
        this.encendido = false;
    }

    public String getMarca() { 
        return marca; 
    }
    public void setMarca(String marca) { 
        this.marca = marca; 
    }
    public String getModelo() { 
        return modelo; 
    }
    public void setModelo(String modelo) { 
        this.modelo = modelo; 
    }
    public int getTamaño() { 
        return tamaño; 
    }
    public void setTamaño(int tamaño) { 
        this.tamaño = tamaño; 
    }
    public int getCanalActual() { 
        return canalActual; 
    }
    public void setCanalActual(int canalActual){
        this.canalAnterior = this.canalActual;
        this.canalActual = canalActual;
    }
    public int getVolumen() { 
        return volumen; 
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public boolean estaEncendido() { 
        return encendido; 
    }
    public void encender() {
        encendido = true;
    }
    public void apagar(){
        encendido = false;
    }
    public void subirVolumen() { 
        this.volumen = volumen + 1; 
    }
    public void bajarVolumen() {
        if (volumen > 0) 
            this.volumen = volumen - 1;
    }
    public void subirCanal() {
        canalAnterior = canalActual;
        canalActual = canalActual + 1;
    }
    public void bajarCanal() {
        canalAnterior = canalActual;
        if (canalActual > 1) 
            canalActual= canalActual - 1;
    }
    public void volverAlCanalAnterior() {
        int canalActualOriginal = canalActual;
        canalActual = canalAnterior;
        canalAnterior = canalActualOriginal;
    }
    public String toString() {
        return "[Marca: "+ this.marca+ " ] [Modelo: " +this.modelo+ " ] [Tamaño: "+this.tamaño+" ] [Canal: "+this.canalActual+" ] [Volumen: "+this.volumen+" ] [ Encendido: " + (encendido ? "Sí" : "No")+"]";
    }
}