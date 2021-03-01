/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre del estado: ");
        String n_estado = leer.nextLine();
        System.out.println("Introduzca la populación del estado: ") ;
        Integer s_p = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduzca el nombre de la ciudad capital: ");
        String ciudad = leer.nextLine();
        System.out.println("Introduzca la populacion de la ciudad capital: ");
        Integer c_p = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduzca el nombre de la ciudad más populosa");
        String populosa = leer.nextLine();
        System.out.println("Introduzca la populación de la ciudad más populosa");
        Integer p_p = leer.nextInt();
        
        
        
        State estado = new State(n_estado, s_p, ciudad, c_p, populosa, p_p);
        System.out.println(estado);
    }
}

