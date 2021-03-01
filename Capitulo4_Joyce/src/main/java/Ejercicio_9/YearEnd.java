/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_9;
import java.util.GregorianCalendar;
/**
 *
 * @author jonat
 */
public class YearEnd {
    private GregorianCalendar fecha = new GregorianCalendar();
    private int dia_año = fecha.get(GregorianCalendar.DAY_OF_YEAR);

    public void diasParaFin() {
        System.out.println(diasAño() - this.dia_año);
    }
    
    public int diasAño(){
        if(fecha.get(GregorianCalendar.YEAR)%4==0){
            return 366;
        }
        return 365;
    }
}
