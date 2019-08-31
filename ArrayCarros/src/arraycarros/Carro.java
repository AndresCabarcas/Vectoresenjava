/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycarros;

/**
 *
 * @author ANDACAMES
 */
public class Carro extends Propietario{
    
    String Modelo;
    int PrecioCarro;
    int Cilindraje;
    String Placa;
    
    
    public Carro(){
        super();
        Modelo="";
        PrecioCarro=0;
        Cilindraje=0;
        
    }

    public Carro(String Modelo, int PrecioCarro, int Cilindraje,String Placa ,String Nombre, int Telefono, int ID) {
        super(Nombre, Telefono, ID);
        this.Modelo = Modelo;
        this.PrecioCarro = PrecioCarro;
        this.Cilindraje = Cilindraje;
        this.Placa= Placa;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
        
    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getPrecioCarro() {
        return PrecioCarro;
    }

    public void setPrecioCarro(int PrecioCarro) {
        this.PrecioCarro = PrecioCarro;
    }

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int Cilindraje) {
        this.Cilindraje = Cilindraje;
    }
    
}