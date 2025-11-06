package TP2_P2;

public class Ejercicio2 {

     public static void main(String[] args) {
            Estacion combuEstacion = new Estacion(5);
            System.out.println(combuEstacion.toString());

            combuEstacion.cargarCombustible(300);
            System.out.println(combuEstacion);

            combuEstacion.usarCombustible(50);
            System.out.println(combuEstacion);
            
            combuEstacion.usarCombustible(500);
            System.out.println(combuEstacion);     
    }
}     

class Estacion {
    private int cantCombustible;

    public Estacion(int cantCombustible){
        if (cantCombustible <= 10000) {
            this.cantCombustible = cantCombustible;
        } else {
            this.cantCombustible = 10000;
        }
    }

    public void setCantCombustible(int cantCombustible){
        if (cantCombustible <= 10000)
            this.cantCombustible = cantCombustible;
    }

    public int getCantCombustible(){
        return cantCombustible;
    }
    public void cargarCombustible(int combustibleACargar){
        if (cantCombustible + combustibleACargar <= 10000) {
            cantCombustible = cantCombustible + combustibleACargar;
        } else {
            cantCombustible = 10000;
        }

    }
    public void informarBajoCombustible(){
        if(cantCombustible < 10){
            System.out.println("Por favor recargue la estacion de servicio");
        }
    } 

    public void usarCombustible(int combustibleAUsar){
        if(combustibleAUsar <= cantCombustible){
            cantCombustible= cantCombustible - combustibleAUsar;
        } else {
            System.out.println("No hay suficiente combustible para cargar " + combustibleAUsar + " a su vehiculo");
        }
        informarBajoCombustible();
    }

    public String toString(){
        return "La estación cuenta con " + cantCombustible + " litros disponibles";
    }

}
