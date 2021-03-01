/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author jonat
 */
public class TwoDice {
    public static void main(String[] args) {
        Die dado = new Die();
        Die dado2 = new Die();
    
        dado.Lanzar();
        dado2.Lanzar();
        
        System.out.println("Dado 1 = " + dado.getNumero());
        System.out.println("Dado 2 = " + dado2.getNumero());
        
    }
}
