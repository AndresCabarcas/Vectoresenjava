/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

/**
 *
 * @author ANDACAMES
 */
public class Estudiantes {

    int codigo;
    String nombre;
    float nota;

    public Estudiantes() {
        codigo = 0;
        String nombre = "";
        float nota = 0;
    }

    public void setCodigo(int cod) {
        codigo = cod;
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public void setNota(float n) {
        nota = n;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota() {
        return nota;
    }

    
}
