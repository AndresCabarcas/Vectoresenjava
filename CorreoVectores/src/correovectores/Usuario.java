/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correovectores;

/**
 *
 * @author Jose Lopez
 */
public class Usuario {
    

    private String Nombre;
    private String Usuario;
    private String Password;
    private String Fecha;
    private String Genero;
    private String Pais;
    private int Celular;
    private String Mensaje;
    

    public Usuario() {
        Nombre = "";
        Usuario = "";
        Password = "";
        Fecha = "";
        Genero = "";
        Celular = 0;
        Pais = "";
        Mensaje="";
    }

    public Usuario(String Nombre, String Usuario, String Password, String Fecha, String Genero, String Pais, int Celular,String Mensaje) {
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Password = Password;
        this.Fecha = Fecha;
        this.Genero = Genero;
        this.Pais = Pais;
        this.Celular = Celular;
        this.Mensaje =  Mensaje;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }
    
}
