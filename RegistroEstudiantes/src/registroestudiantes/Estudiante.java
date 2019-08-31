/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroestudiantes;

/**
 *
 * @author Luna Escudero
 */
public class Estudiante {
    
    int ID;
    String Nombre;
    String Direccion;
    String Genero;
    String Fecha;
    String Carrera;

    public Estudiante(int ID, String Nombre, String Direccion, String Genero, String Fecha, String Carrera) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Genero = Genero;
        this.Fecha = Fecha;
        this.Carrera = Carrera;
    }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
    
}
