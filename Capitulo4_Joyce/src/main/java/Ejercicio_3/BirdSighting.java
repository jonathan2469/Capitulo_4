/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_3;

/**
 *
 * @author jonat
 */
public class BirdSighting {
    private String species;
    private Integer avistamientos;
    private Integer dia;

    public BirdSighting(){
        this.species = "robin";
        this.avistamientos = 1;
        this.dia = 1;
    }
    
    public BirdSighting(String species,Integer avistamientos,Integer dia){
        
        this.species = species;
        this.avistamientos = avistamientos;
        this.dia = dia;
    
    }
    
    
    
    public String getSpecies() {
        return species;
    }

    public int getAvistamientos() {
        return avistamientos;
    }

    public int getDia() {
        return dia;
    }
    
    
}
