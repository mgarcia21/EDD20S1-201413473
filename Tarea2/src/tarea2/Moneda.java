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
public class Moneda {
    String nombre = "narcoMoneda";
    int cantidad;

    Moneda() {
    }
    
    public Moneda(int cantidad) {
        this.cantidad = cantidad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int Transferir(int cantidad){
        this.cantidad = cantidad;
        cantidad = cantidad - 100;
        return cantidad;
    }
    
    
}
