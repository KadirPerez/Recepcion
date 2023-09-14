
package recepcion;

public class Orden {
    private String nombre;
    private int cantidad;
    
    public Orden(String nombre, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + nombre + ", Cantidad de productos: " + cantidad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCanitdad(){
        return cantidad;
    }
}
