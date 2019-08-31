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
public class Propietario {
    
    String Nombre;
    int Telefono;
    int ID;
    
    public Propietario(){
    
        Nombre="";
        Telefono=0;
        ID=0;
    }

    public Propietario(String Nombre, int Telefono, int ID) {
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.ID = ID;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
   
}
