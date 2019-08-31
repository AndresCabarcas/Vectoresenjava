/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication69;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class lista {

    private char lista[];
    int tam;
    String buscar;


    public lista(int elementos) {
        
        tam = elementos;
        lista = new char[tam];
    }

    public char getLista(int p) {
        return lista[p];
    }

    public void setLista(int p, char dato) {
        lista[p] = dato;

    }

    public int getTam() {
        return tam;
    }

    public String getBuscar() {
        return buscar;
    }

    public void setBuscar(String buscar) {
        this.buscar = buscar;
    }
    
    public void Busqueda() {
        String Unir="";
        for (int i = 0; i < getTam(); i++) {
            Unir+=String.valueOf(getLista(i));
        }
        String[] arre2=Unir.split(" ");
        String Suma = getBuscar();
        String[] arre =Suma.split(" ");
        for (int i = 0; i < arre2.length; i++) {
            if (arre[0].equals(arre2[i])) {
                  JOptionPane.showMessageDialog(null, "La palabra: "+getBuscar() +" se encuentra en el arreglo en las posicion: "+i);
            }else{
                   JOptionPane.showMessageDialog(null, "La palabra no se encuentra en la pos: "+i+" del arreglo");
            }
        }
    }
   

}
