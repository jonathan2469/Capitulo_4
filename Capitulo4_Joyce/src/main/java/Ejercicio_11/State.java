/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_11;

/**
 *
 * @author jonat
 */
public class State {
    private String name;
    private Integer population;
    private City capital;
    private City populous;
    
    public State(String s_n, int s_p, String c_n, int c_p, String p_n, int p_p){
        this.name=s_n;
        this.population = s_p;
        if((c_p+p_p)>s_p){
            System.out.println("error, cheque sus datos");
        }else{
            this.capital = new City(c_n, c_p);
            this.populous = new City(p_n, p_p);
        }
                
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "State{" + "name=" + name + ", population=" + population + ", capital=" + capital + ", populous=" + populous + '}';
    }
    
    
    
    
}
class City{
    private String name;
    private Integer population;
    
    public City(String n, int p){
        this.name = n;
        this.population = p;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" + "name=" + name + ", population=" + population + '}';
    }
}
