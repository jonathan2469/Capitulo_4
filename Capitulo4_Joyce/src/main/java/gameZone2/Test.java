/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;
import java.util.Scanner;

/**
 *
 * @author jonat
 */
public class Test {
    public static void main(String[] args) {
        FiveDice dados = new FiveDice();
        FiveDice dados2 = new FiveDice();

        Scanner leer = new Scanner(System.in);

      
        int resp = 0;

        do {
            dados.lanzar();
            dados2.lanzar();
            dados.imprimir();
            dados2.imprimir();
            if (dados.evaluar() > dados2.evaluar()) {
                System.out.println("Ha ganado el jugador 1");
            } else if (dados.evaluar() < dados2.evaluar()) {
                System.out.println("Ha ganado el jugador 2");
            } else {
                System.out.println("Ha sido un empate");
            }
            System.out.println("Desea seguir jugando? [0=no, 1=sí]");
            resp = leer.nextInt();
        } while (resp == 1);

    }
}
