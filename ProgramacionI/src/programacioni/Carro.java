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
public class Carro extends Propietario{
    
    VectorCarro obj=new VectorCarro();
    
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
    
    
    public void LlenarVector(){
    Carro obj1= new Carro("Renault",50000000,2800, "HSD-345", "Andres Cabarcas", 317388922, 1242533);
    Carro item=obj1;
    obj.setVectorCarro(0, item);
    Carro obj2= new Carro("Logan",80000000,5800, "FFF-675", "Jesus Moreno", 318767892, 989878);
    obj.setVectorCarro(1, obj2);
    Carro obj3= new Carro("BMW",90000000,8800, "HDF-777", "Yeinis Espinosa", 305895922, 1245553);
    obj.setVectorCarro(2, obj3);
    Carro obj4= new Carro("Chevrolet",50000000,4800, "WWE-787", "Andres Mestra", 3564922, 1999533);
    obj.setVectorCarro(3, obj4);
    Carro obj5= new Carro("Aveo",60000000,4900, "HFF-788", "Deivis Sanches", 388922, 888833);
    obj.setVectorCarro(4, obj5);
    Carro obj6= new Carro("Renault",45000000,3800, "HCC-999", "Anderson Oviedo", 313922, 7777733);
    obj.setVectorCarro(5, obj6);
    Carro obj7= new Carro("Campero",80000000,5000, "QQQ-535", "David Soto", 8888822, 17777733);
    obj.setVectorCarro(6, obj7);
    }

    
}
