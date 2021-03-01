/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_10;
import java.util.Scanner;
/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el número de certificado");
        int n = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduzca el apellido del cuentahabiente");
        String l = leer.nextLine();
        
        System.out.println("Introduzca el balance de la cuenta");
        double b = leer.nextDouble();
        System.out.println("Introduzca el dia del proceso");
        int d = leer.nextInt();
        System.out.println("Introduzca el mes del proceso");
        int m = leer.nextInt();
        System.out.println("Introduzca el año del proceso");
        int y = leer.nextInt();
        
        CertificateOfDeposit dep = new CertificateOfDeposit(n, l , b , d, m , y);
        
        System.out.println(dep);
        
        
    }
}
