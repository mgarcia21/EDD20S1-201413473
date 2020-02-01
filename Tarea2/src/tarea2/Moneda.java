/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;
import java.util.Scanner;


/**
 *
 * @author Maynor
 */
public class Moneda {
    String nombre = "Shitcoins";
    int numero;
    double saldo;
    double monedero = 10000; 
    
    public Moneda(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getMonedero() {
        return monedero;
    }

    public void setMonedero(double monedero) {
        this.monedero = monedero;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return monedero;
    }

    public void setLimite(double limite) {
        this.monedero = limite;
    }
    
    public void insertar(double valor){
    saldo = saldo+valor;
    }
    public void retirar(double valor){
        saldo = saldo-valor;
    }
    
    public void transferirFrom(Moneda envio, Moneda otro, double valor){
        envio.retirar(valor);
        otro.insertar(valor);
    }
    public void transferir(Moneda solicito, double valor){
        solicito.insertar(valor);
        this.monedero -= valor;

    }
     
}
