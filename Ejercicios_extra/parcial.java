package Ejercicios_extra; 
import java.util.Scanner; 
public class parcial { 
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
 
        // Se crea dos produtos con los datos del usuario 
 
        System.out.println("ingrese el nombre del primer producto"); 
        String nombre = scan.nextLine(); 
         
        System.out.println("ingrese el precio del primer producto"); 
        double precio = scan.nextDouble(); 
         
        System.out.println("ingrese la cantidad en stock del primer producto"); 
        int cantidadEnStock = scan.nextInt(); 
 
        Producto prod = new Producto(nombre, precio, cantidadEnStock); 
        System.out.println(prod.toString()); 
 
        scan.nextLine(); 
 
        System.out.println("ingrese el nombre del segundo producto"); 
        String nombre1 = scan.nextLine(); 
         
        System.out.println("ingrese el precio del segundo producto"); 
        double precio1 = scan.nextDouble(); 
         
        System.out.println("ingrese la cantidad en stock del segundo producto"); 
        int cantidadEnStock1 = scan.nextInt(); 
         
        Producto otro = new Producto(nombre1, precio1, cantidadEnStock1); 
 
        System.out.println("Ingrese la cantidad a vender del primer producto"); 
        int cantidad = scan.nextInt(); 
 
        prod.vender(cantidad);  
 
        otro.aumentarStock(10); 
         
        System.out.println(otro.toString()); 
 
        if( prod.tieneMasStockQue(otro) == true){ 
            System.out.println("El producto que tiene mas stock es: " +  prod.getNombre()); 
        } else{ 

            System.out.println("El producto que tiene mas stock es: " +  otro.getNombre()); 
 
        } 
 
        /* 
        if(prod.getCantidadEnStock() > otro.getCantidadEnStock()){ 
            System.out.println("El producto que tiene mas stock es " + 
prod.getNombre()); 
        } else{ 
            System.out.println("El producto que tiene mas stock es " + 
otro.getNombre()); 
        } 
 
        */ 
 
        System.out.println(prod.toString()); 
        System.out.println(otro.toString()); 
 
        scan.close(); 
    }     
} 
 
class Producto { 
//atributos 
    private String nombre; 
    private double precio; 
    private int cantidadEnStock; 
 
//contructor 
    public Producto (String nombre, double precio, int cantidadEnStock){ 
        this.nombre = nombre; 
        this.precio = precio; 
        this.cantidadEnStock = cantidadEnStock; 
    } 
//SET Y GET 
    public String getNombre(){ 
        return nombre; 
    } 
    public void setNombre(String nombre){ 
        this.nombre = nombre; 
    } 
    public double getPrecio(){ 
        return precio; 
    } 
    public void setPrecio(double precio){ 
    this.precio = precio; 
    }   
    public int getCantidadEnStock(){ 
        return cantidadEnStock; 
    } 
    public void setCantidadEnStock(int cantidadEnStock){ 
        this.cantidadEnStock = cantidadEnStock; 
    } 
    //metodos 
    public boolean hayStock (int cantidad){ 
        if(cantidadEnStock > cantidad){ 
            return true; 
        }else{ 
            return false; 
        } 
    } 
 
    public void vender ( int cantidad){ 
        if (cantidad <= cantidadEnStock){ 
            cantidadEnStock = cantidadEnStock - cantidad; 
        } else { 
            System.out.println("No hay suficiente stock"); 
        } 
    } 
    public void aumentarStock (int cantidad){ 
        if(cantidad > 0){ 
            cantidadEnStock = cantidadEnStock + cantidad; 
        } else { 
            System.out.println("No se puede aumentar un numero negativo"); 
        } 
    } 
 
    public boolean tieneMasStockQue(Producto otro){ 
        if (this.getCantidadEnStock() > otro.getCantidadEnStock()){ 
            return true; 
        } else { 
            return false; 
        } 
    } 
 
    public String toString(){ 
        return "[ Nombre: " + nombre + "] [ Precio: " + precio +  
        "] [Stock: " + cantidadEnStock + "]"; 
    } 
 
} 
 