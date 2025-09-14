package TP2;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Fechas f1 = new Fechas (13, 6, 2013); 
        Fechas f2 = new Fechas (1,9, 2011);
        
        System.out.println("Fecha 1: " + f1.toString());
        System.out.println("Fecha 2: " + f2.toString());

        if( f1.getAnio() > f2.getAnio()){
            System.out.println("Fecha con mayor año: " + f1.toString());
        } else {
            System.out.println("Fecha con mayor año: " + f2.toString());
        }

    }
}

class Fechas {
    private int dia;
    private int mes;
    private int anio;

    public Fechas (int dia, int mes, int anio){
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

    public String toString(){
        String d = (dia < 10 ? "0" : "") + dia;
        String m = (mes < 10 ? "0" : "") + mes;
        String a = (anio <10 ? "0" : "") + anio;

        return d + " / " + m + " / " + a;
    }
}