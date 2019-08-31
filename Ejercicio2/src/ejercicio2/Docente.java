/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author ANDACAMES
 */
public class Docente {
     String Nombre;
     int Nombrados;
     int Catedraicos;
     int Puntos;
     int HorasAsignadas;
     
     public Docente(){
         
        Nombre="";
        Nombrados=0;
        Catedraicos=0;
        Puntos=0;
        HorasAsignadas=0;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNombrados() {
        return Nombrados;
    }

    public void setNombrados(int Nombrados) {
        this.Nombrados = Nombrados;
    }

    public int getCatedraicos() {
        return Catedraicos;
    }

    public void setCatedraicos(int Catedraicos) {
        this.Catedraicos = Catedraicos;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public int getHorasAsignadas() {
        return HorasAsignadas;
    }

    public void setHorasAsignadas(int HorasAsignadas) {
        this.HorasAsignadas = HorasAsignadas;
    }
    
     
     
}
