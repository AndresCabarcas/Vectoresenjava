/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialvectores;

/**
 *
 * @author ANDACAMES
 */
public class DeclaraVectores {
    int id[];
    String nombre[];
    String cargo[];
    String dependencia[];
    float sueldo[];
    int tamano;
    
    public void Productos() {
        id=null;
        nombre = null;
        cargo = null;
        dependencia = null;
        sueldo = null;
        tamano = 0;
    }
    
     public void setTamano(int n) {
        tamano = n;
    }

    public int getTamano() {
        return tamano;
    }
    
    public void crearVectores() {
        id = new int[tamano];
        nombre = new String[tamano];
        dependencia = new String[tamano];
        sueldo = new float[tamano];
        cargo = new String[tamano];
    }
    
    public void setNombre(int p, String dato){
      this.nombre[p]=dato;
    }
    
    public void setId(int p, int dato){
      this.id[p]=dato;
    }
    
    public void setDependencia(int p, String dato){
      this.dependencia[p]=dato;
    }
    
    public void setSueldo(int p, float dato){
      this.sueldo[p]=dato;
    }
    
    public void setCargo(int p, String dato){
      this.cargo[p]=dato;
    }

    public int getId(int p) {
        return id[p];
    }

    public String getNombre(int p) {
        return nombre[p];
    }

    public String getCargo(int p) {
        return cargo[p];
    }

    public String getDependencia(int p) {
        return dependencia[p];
    }

    public float getSueldo(int p) {
        return sueldo[p];
    }
    
    
    
}
