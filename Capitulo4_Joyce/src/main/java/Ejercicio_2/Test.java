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
public class Test {
    
    public static void main(String[] args) {
        Billing billing = new Billing();
        System.out.println(billing.computeBill(100));
        System.out.println(billing.computeBill(100,3));
        System.out.println(billing.computeBill(100,3,20.0));
        
        
    }
}
