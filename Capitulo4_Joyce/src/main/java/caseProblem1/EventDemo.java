/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class EventDemo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        
        Event ev1 = new Event();
        System.out.println("Introduzca el Numero de evento");
        String event = leer.nextLine();
        System.out.println("Introduzca el numero de invitados");
        int n = leer.nextInt();
        Event ev2 = new Event(event, n);
        
        System.out.println(ev1+"\n"+ev2);
        
    }
}
