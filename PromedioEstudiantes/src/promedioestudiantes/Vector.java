/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioestudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Vector {

    private int tamaño;
    private Estudiante VectorEstudiante[];

    public void CrearVector() {

        VectorEstudiante = new Estudiante[tamaño];

    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public Estudiante getVectorEstudiante(int p) {
        return VectorEstudiante[p];
    }

    public void setVectorEstudiante(int p, Estudiante ve) {
        this.VectorEstudiante[p] = ve;
    }

    public void cambiar(int p1, int p2) {
        Estudiante temp;
        temp = getVectorEstudiante(p1);
        setVectorEstudiante(p1, getVectorEstudiante(p2));
        setVectorEstudiante(p2, temp);
    }

    public void ordenarBurbuja() {

        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = 0; j <= (getTamaño() - i) - 2; j++) {

                if (getVectorEstudiante(j).getNota() > getVectorEstudiante(j + 1).getNota()) {
                    cambiar(j, j + 1);

                }
            }
        }
    }

    public void ordenarIntercambio() {

        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = i + 1; j <= getTamaño() - 1; j++) {

                if (getVectorEstudiante(i).getNota() > getVectorEstudiante(j).getNota()) {
                    cambiar(i, j);
                }
            }
        }
    }

    public int busquedaLineal(float dato) {
        int i;
        int posicion;
        posicion = -1;
        i = 0;

        while ((i <= getTamaño() - 1) && (posicion == -1)) {
            if (getVectorEstudiante(i).getNota() == dato) {
                posicion = i;
            } else {
                i = i + 1;
            }
        }
        return posicion;
    }

    public int posicionMenor(int inicio) {
        int i;
        int posMenor;
        float menorElemento;
        posMenor = inicio;

        menorElemento = getVectorEstudiante(inicio).getNota();
        for (i = inicio + 1; i <= getTamaño() - 1; i++) {

            if (getVectorEstudiante(i).getNota() < menorElemento) {
                menorElemento = getVectorEstudiante(i).getNota();
                posMenor = i;
            }
        }

        return posMenor;
    }

    public void ordenarSeleccion() {
        for (int i = 0; i <= getTamaño() - 1; i++) {
            cambiar(i, posicionMenor(i));
        }
    }

    public void PromedioNotas() {

        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < getTamaño(); i++) {

            suma += getVectorEstudiante(i).getNota();

            promedio = suma / getTamaño();

        }
        JOptionPane.showMessageDialog(null, "PROMEDIO DE NOTAS DEL CURSO ES :  " + promedio);
    }

    public void DesviacionEstandar() {
        int suma = 0;
        float promedio = 0;
        double varianza = 0.0;
        double sumatoria;
        double desviacion;
        for (int i = 0; i < getTamaño(); i++) {

            suma += getVectorEstudiante(i).getNota();

            promedio = suma / getTamaño();

            sumatoria = Math.pow(getVectorEstudiante(i).getNota() - promedio, 2);
            varianza += sumatoria;
        }
        varianza /= getTamaño();

        desviacion = Math.sqrt(varianza);
        double redondeo = Math.rint(desviacion * 100) / 100;
        JOptionPane.showMessageDialog(null, "la desviacion estandar es :  " + redondeo);

    }

    public void Cuartil1() {
        double cuartil = 0.25 * getTamaño();
        double residuo = cuartil % 1;
        double total = 0;
        if (residuo > 0) {
            double entero = (cuartil / 1) - (cuartil % 1);
            total = (entero + 1) * 2;
            JOptionPane.showMessageDialog(null, "El cuartil 1 es :  " + total);
        }
        if (residuo == 0) {
            double entero = (cuartil / 1) - (cuartil % 1);
            total = (entero + 1) / 2;
            JOptionPane.showMessageDialog(null, "El cuartil 1 es:  " + total);
        }
    }

    public void Cuartil3() {
        double cuartil = 0.75 *getTamaño();
        double residuo = cuartil % 1;
        double total = 0;
        if (residuo > 0) {
            double entero = (cuartil / 1) - (cuartil % 1);
            total = (entero + 1) * 2;
            JOptionPane.showMessageDialog(null,"El cuartil 3 es:  "+total);
        }
        if (residuo == 0) {
            double entero = (cuartil / 1) - (cuartil % 1);
            total = (entero + 1) / 2;
            JOptionPane.showMessageDialog(null,"El cuartil 3 es:  "+total);
        }
    }

}
