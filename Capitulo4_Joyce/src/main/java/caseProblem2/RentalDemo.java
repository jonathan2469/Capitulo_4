/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el numero de contracto");
        String n = leer.nextLine();
        System.out.println("Introduzca el numero de minutos");
        int m = leer.nextInt();
        Rental r1 = new Rental(m, n);
        Rental r2 = new Rental();
        
        
        System.out.println(r1+"\n"+r2);
        
    }
}
