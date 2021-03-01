/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;
import gameZone1.Die;
/**
 *
 * @author jonat
 */
public class FiveDice {
    private Die[] dados;
    
    public FiveDice(){
        this.dados = new Die[5];
        for (int i = 0; i < 5; i++) {
            this.dados[i] = new Die();
        }
    }
    
    public void lanzar(){
        for (int i = 0; i < 5; i++) {
            this.dados[i].Lanzar();
        }
    }
    
    public Integer evaluar(){
        Integer contador = 0;
        Integer maximo = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < 5; j++) {
                if(this.dados[j].getNumero()==i){
                    contador++;
                }
            }
            if(contador>maximo){
                maximo=contador;               
            }
            contador = 0;
        }
        return maximo;
    }
    
    public void imprimir() {
        for (int i = 0; i < 5; i++) {
            System.out.print(this.dados[i].getNumero()+" ");
        }
        System.out.println("");
    }
    
}
