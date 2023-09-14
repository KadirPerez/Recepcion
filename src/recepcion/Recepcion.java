/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recepcion;

import java.util.Scanner;

/**
 *
 * @author kadirperez
 */
public class Recepcion {

    public static void main(String[] args) {
        Cola cola = new Cola(10);
        Scanner leer = new Scanner(System.in);
        Scanner leerS = new Scanner(System.in);
        int op = 0;
        
        cola.insertar(new Orden("Pedro", 10));
        cola.insertar(new Orden("Laura", 4));
        cola.insertar(new Orden("Rodrigo", 60));
        cola.insertar(new Orden("Maria", 7));
        cola.insertar(new Orden("Lorenzo", 9));
        cola.insertar(new Orden("Carlos", 2));
        cola.insertar(new Orden("Marcela", 45));
        cola.insertar(new Orden("Rosa", 24));
        cola.insertar(new Orden("Eliseo", 2));
        cola.insertar(new Orden("Roberto", 1));
        
        do
        {
            mostrarMenu();
            op = leer.nextInt();

            switch(op){
                case 1:
                    System.out.println(cola.eliminar() + "\n");
                break;
                case 2:
                    System.out.println("\nOrdenes a procesar: " + cola.cantidadDeElementos() + "\n");
            }
            
        }
        while(op != 3);
        
    }
    
    public static void mostrarMenu(){
        System.out.println("MENU");
        System.out.println("1. Recibir cliente");
        System.out.println("2. Ordenes a procesar");
        System.out.println("3. Salir\n");
        System.out.print("Opcion elegida: ");
    }
    
   
    
}
