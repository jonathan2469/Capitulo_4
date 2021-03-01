/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2;

/**
 *
 * @author jonat
 */
public class Billing {
    private double costo;
    private int cantidad;
    private double descuento;
    
    public double computeBill(Integer costo){
        return costo + (costo * 0.08);
    }
    
    public double computeBill(Integer costo, Integer cantidad){
        Integer totalProductos = costo * cantidad;
        return totalProductos + (totalProductos * 0.08);
    }
    
    public double computeBill(Integer costo, Integer cantidad, Double descuento){
        Integer totalProductos = costo * cantidad;
        return totalProductos - (totalProductos * (descuento/100)) + (totalProductos * 0.08);
    }
    
}
