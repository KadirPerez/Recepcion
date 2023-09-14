
package recepcion;

public class Cola<T> {
    private T[] cola;
    private int inicio;
    private int fin;
    private int max;
    
    public Cola(int max){
        cola = (T[]) new Object[max];
        this.max = max;
        inicio = -1;
        fin = -1;
    }
    
    public void insertar(T dato){
        if (fin < max-1){
            fin = fin + 1;
            cola[fin] = dato;
            if(fin == 0)
                inicio = 0;
        }else
            System.out.print("Desbordamiento");
    }
    
    public T eliminar(){
        T dato = null;
        
        if(inicio > -1){
            dato = cola[inicio];
            if(inicio == fin){
                inicio = -1;
                fin = -1;
            }else{    
                inicio = inicio + 1;
            }
        }
        
        return dato;
    }
    
    public int cantidadDeElementos(){
        return (fin - inicio) + 1;
    }
}