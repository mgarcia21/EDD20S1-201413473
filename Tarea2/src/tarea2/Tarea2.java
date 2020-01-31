/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Maynor
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Moneda moneda1 = new Moneda();
        moneda1.cantidad = 250;
        System.out.println(moneda1.nombre+" la cantidad para la moneda 1 es " + moneda1.cantidad);
        moneda1.getNombre();
        moneda1.Transferir(moneda1.cantidad);
        System.out.println(moneda1.cantidad);
        
    }
    
}
