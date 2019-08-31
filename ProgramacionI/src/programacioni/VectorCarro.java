/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioni;

/**
 *
 * @author ANDACAMES
 */
public class VectorCarro {
    
    Carro[] VectorCarro;
    int Tam=10;
    
    public VectorCarro(){
        VectorCarro=null;
        Tam=10;
    }
    
    public void CrearVector(){
    this.VectorCarro = new Carro[Tam];
    }
    
     public void setVectorCarro(int pos, Carro car){
        VectorCarro[pos]=car;
    }
    
    public Carro getVectorEstudiante(int pos){
        return VectorCarro[pos];
    }  
    
    
    
}
