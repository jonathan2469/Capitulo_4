/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;

/**
 *
 * @author jonat
 */
public class BloodData {
    private Tipo_de_Sangre Sangre;
    private String Rh;
    
    public BloodData(){
    this.Sangre = Tipo_de_Sangre.O;
    this.Rh = "+";
    
    
    }
    
    public BloodData(Tipo_de_Sangre Sangre, String Rh) {
        this.Sangre = Sangre ;
        this.Rh = Rh ;
    }

    public Tipo_de_Sangre getSangre() {
        return Sangre;
    }

    public void setSangre(Tipo_de_Sangre Sangre) {
        this.Sangre = Sangre;
    }

    public String getRh() {
        return Rh;
    }

    public void setRh(String Rh) {
        this.Rh = Rh;
    }
        
    
}
