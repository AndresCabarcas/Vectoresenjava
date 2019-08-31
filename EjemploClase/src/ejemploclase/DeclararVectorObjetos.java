/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class DeclararVectorObjetos {

    private int tamano;
    private Estudiantes vectorEstudiantes[];

    public DeclararVectorObjetos() {
        tamano = 0;
        vectorEstudiantes = null;
    }

    public void crearVector() {
        vectorEstudiantes = new Estudiantes[tamano];
    }

    public void setTamano(int N) {
        tamano = N;
    }

    public int getTamano() {
        return tamano;
    }

    public void setVectorEstudiantes(int p, Estudiantes ve) {
        vectorEstudiantes[p] = ve;
    }

    public Estudiantes getVectorEstudiantes(int p) {
        return vectorEstudiantes[p];
    }

    public float promedioRepobados() {
        float suma = 0;
        int contador = 0;
        for (int i = 0; i <= getTamano() - 1; i++) {
            if (getVectorEstudiantes(i).getNota() < 3) {
                suma = suma + getVectorEstudiantes(i).getNota();
                contador = contador + 1;
            }
        }
        if (contador > 0) {
            return (suma / contador);
        } else {
            return 0;
        }
    }
   
   
   

}


