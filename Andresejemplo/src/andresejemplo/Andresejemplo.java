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
public class Andresejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Claseandres obj = new Claseandres();
       double nota;
       int tam;
       
       tam=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de notas a ingresar"));
       obj.setTam(tam); 
         for(int i=0; i<obj.notas.length; i++){  
          nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Nota "+(i+1)));
          obj.setNotas(i, nota); 
      }
         obj.metodomostrarvectorandres(obj); 
    } 
}
