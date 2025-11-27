
public class Persona{
   private String apellido;
   private int edad;
   private int dni;
   private char sexo;
   private double peso;
   private double altura;
   
   
   //Constructor
   public Persona(String ape, int ed,int dni, char sex, double pes, double alt ){
      this.apellido = ape;
      this.edad=ed;
      this.dni = dni;
      this.sexo=sex;
      this.peso=pes;
      this.altura=alt;
   }
   
   //get y set
   public void setApellido(String a){
      this.apellido = a;
   }
   public String getApellido(){
      return this.apellido;
   }
   public void setEdad(int e){
      this.edad = e;
   }
   public int getEdad(){
      return this.edad;
   }
   public void setDNI(int dni){
      this.dni = dni;
   }
   public int getDNI(){
      return this.dni;
   }
   public void setSexo(char s){
      this.sexo = s;
   }
   public char getSexo(){
      return this.sexo;
   }
   public void setPeso(double p){
      this.peso = p;
   }
   public double getPeso(){
      return this.peso;
   }
   public void setAltura(double al){
      this.altura = al;
   }
   public double getAltura(){
      return this.altura;
   }
   
   public int calcularIMC(){
      double imc;
      imc = this.peso/(this.altura * this.altura);
      if (imc < 18){
         System.out.println("Esta por debajo de su peso ideal");
         return -1;
      }
      else{
         if (imc >= 18 & imc <= 25){
            //System.out.println("Est� en su peso ideal");
            return 0;
         }
         else{
            //System.out.println("Est� por arriba de su peso ideal");
            return 1;
         }
      }
   }

   public boolean esMayorDeEdad(){
      if (this.edad >= 18){
         //System.out.println("Es mayor de edad");
         return true;
      }
      else{
         //System.out.println("Es menor de edad");
         return false;
      }
   }
   public String toString(){
      return "[ "+ this.apellido+ " ] [ " +this.edad+ " ] [ "+this.dni+" ] [ "+this.sexo+" ] [ "+this.peso+" ] [ "+this.altura+" ]";
   }
}