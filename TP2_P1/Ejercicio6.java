package TP2_P1;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Fecha f1 = new Fecha(1, 9, 2012); 
        Fecha f2 = new Fecha(32, 13, -5); 
        System.out.println("Fecha 1: " + f1.toString());
        System.out.println("Fecha 2: " + f2.toString());

        f2.setDia(15);
        f2.setMes(10);
        f2.setAnio(2025);

        System.out.println("Fecha 2 modificada: " + f2.toString());
    }
}

class Fecha{
    private int dia;
    private int mes;
    private int anio;

    public Fecha (int dia, int mes, int anio){
        if(esFechaValida(dia,mes,anio)){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.anio = 2013;
        }
    }

    private boolean esFechaValida(int dia, int mes, int anio){
        if (mes < 1 || mes > 12) 
            return false;
        if (dia < 1 || dia > diasDelMes(mes)) 
            return false;
        if (anio < 1500)
            return false; 
        return true;
    }

    private int diasDelMes(int mes){
        switch (mes) {
            case 2: 
                return 28;
            case 4: 
            case 6: 
            case 9: 
            case 11: 
                return 30;
            default: 
                return 31;        
        }
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        if(dia<=31 && dia >0)
            this.dia = dia;
    }
    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        if(mes<=12 && mes >0)
            this.mes = mes;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int anio){
        if(anio >= 1500)
            this.anio = anio; 
    }

    public String getMesNombre(){
        switch (mes) {
            case 1: return "Enero";
            case 2: return "Febrero";
            case 3: return "Marzo";
            case 4: return "Abril";
            case 5: return "Mayo";
            case 6: return "Junio";
            case 7: return "Julio";
            case 8: return "Agosto";
            case 9: return "Septiembre";
            case 10: return "Octubre";
            case 11: return "Noviembre";
            case 12: return "Diciembre";
            default: return "Mes inválido";
        }
    }

    public String toString(){
        return dia + " de " + getMesNombre() + " de " + anio;
    }
}
