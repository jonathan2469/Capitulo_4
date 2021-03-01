/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_8;
import java.util.GregorianCalendar;
/**
 *
 * @author jonat
 */
public class NexthMonth {
     private GregorianCalendar fecha = new GregorianCalendar();
    private int dia = fecha.get(GregorianCalendar.DAY_OF_MONTH);

    public void diasPara1() {
        System.out.println(diasMes()+1 - this.dia);
    }

    public int diasMes() {
        switch (fecha.get(GregorianCalendar.MONTH)) {
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;

            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
                return 31;

            case 11:
                return 31;
            case 1:
                if (fecha.get(GregorianCalendar.YEAR) % 4 == 0) {
                    return 29;
                } else {
                    return 28;
                }
        }
        return 0;
    }
}
