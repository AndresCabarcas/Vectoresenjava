/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

/**
 *
 * @author ANDACAMES
 */
public class JavaApplication69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        lista obj = new lista(12);
        
        obj.setLista(0,'e');
        obj.setLista(1,'l');
        obj.setLista(2,' ');
        obj.setLista(3,'s');
        obj.setLista(4,'o');
        obj.setLista(5,'l');
        obj.setLista(6,' ');
        obj.setLista(7,'s');
        obj.setLista(8,'a');
        obj.setLista(9,'l');
        obj.setLista(10,'i');
        obj.setLista(11,'o');
        
        //System.out.println("Digite palabra a buscar:  ");
        obj.setBuscar("sol");
        obj.Busqueda();
        
    }
    
}
