package TP2_P2;

public class Ejercicio1 {
    public static void main(String[] args) {

        Persona p3 = new Persona ("ana", 19, 'F', 56.6, 1.50);

        System.out.println("Persona 3: " + p3.toString());

        
    }
}

class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private char  sexo;
    private double peso;
    private double altura;

    public Persona (){
        this.nombre = "";
        this.edad = 0;
        this.sexo = 'H'; 
        this.peso = 0.0;
        this.altura = 0.0;    
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = 0;
        this.sexo = 'H';
        this.peso = 0.0;
        this.altura = 0.0;
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public int getEdad() { 
        return edad; 
    }
    public void setEdad(int edad) { 
        this.edad = edad; 
    }

    public int getDni() { 
        return dni; 
    }
    public void setDni(int dni) { 
        this.dni = dni; 
    }

    public char getSexo() { return sexo; }
    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public double getPeso() { 
        return peso; 
    }
    public void setPeso(double peso) { 
        this.peso = peso; 
    }

    public double getAltura() { 
        return altura; 
    }
    public void setAltura(double altura) { 
        this.altura = altura; 
    }

    public boolean esMayorDeEdad() {
        if (edad>=18){
            return true;
        } else {
            return false;
        }
    }

    private char comprobarSexo(char sexo){
        if (sexo == 'H' || sexo =='M'){
            return sexo;
        } else{

            return 'M';
        }
    }

    public String toString(){
        return nombre + edad + dni + sexo + peso + altura;
    }
}

