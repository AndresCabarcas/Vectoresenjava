/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderopm;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class PetitaMoi {

    int codigo;
    String cliente;
    String Tipo;
    int horas;
    float valor;


    public PetitaMoi() {

        codigo = 0;
        cliente = "";
        horas = 0;
        Tipo="";
        valor=0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setTipo(String cat) {
        Tipo = cat;
    }

    public String getTipo() {
        return Tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


}
