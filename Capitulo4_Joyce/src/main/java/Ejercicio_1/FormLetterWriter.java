/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_1;

/**
 *
 * @author jonat
 */
public class FormLetterWriter { 
    
    public void displaySalutation(String apellido){
        System.out.println("Estimado Sr. o Sra. " + apellido + " gracias por su pedido");
    }
    
    public void displaySalutation(String nombre, String apellido){
        System.out.println("Estimado " + nombre + " "+ apellido + " gracias por su reciente pedido");
    }
}
