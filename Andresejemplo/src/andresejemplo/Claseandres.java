/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andresejemplo;

import javax.swing.JOptionPane;

/**
 *
 * @author MARIO MUÑOZ
 */
public class Claseandres {
     int tam;
     double notas[];
      
    public Claseandres(){
        this.notas=null;
        this.tam=0;
    }
    public double getNotas(int posicion){
        return notas[posicion];
    }
    public void setNotas(int posicion, double elemento){
        notas[posicion]=elemento;
    }
    public void  setTam(int ta){
        tam=ta;
        this.notas = new double [getTam()];
    }
    public int getTam(){
        return tam;
    }
    public void metodomostrarvectorandres(Claseandres sel){
         for(int i=0; i<sel.getTam(); i++){
          JOptionPane.showMessageDialog(null,"1: Nota "+(i+1)+" ES "+sel.getNotas(i)); 
      }
    }
}
