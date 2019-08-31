/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import javax.swing.JOptionPane;

/**
 *
 * @author YeinisEspinosa
 */
public class main {

    public static void mostrarArray(vectorparcial obj) {
        String datosVector = "";

        for (int i = 0; i <= obj.tamaño - 1; i++) {

            datosVector = datosVector + String.valueOf("ALUMNO " + i + ": " + obj.Alumnos[i] + "  ID: " + obj.Identificacion[i] + "  " + "EDAD: " + obj.Edad[i] + "  " + "NOTA : " + obj.Nota[i] + "\n");

        }

        JOptionPane.showMessageDialog(null, "-----     ALUMNOS DEL CURSO PROGRAMACION I   -------" + "\n" + datosVector);

    }

    public static void MayorNota(vectorparcial obj) {

        String datosVector = "";
        for (int i = 0; i <= obj.tamaño - 1; i++) {
            if (obj.getNota(i) == obj.NotaMayor()) {
                datosVector = datosVector + String.valueOf("->NOMBRE: " + obj.getAlumnos(i) + "------ " + "->EDAD: " + obj.getEdad(i));
            }

        }

        JOptionPane.showMessageDialog(null, "----   LA MAYOR NOTA CORREZPONDE A -------" + "\n" + datosVector);

    }

    public static void MenorNota(vectorparcial obj) {
        String datosVector = "";
        for (int i = 0; i <= obj.tamaño - 1; i++) {
            if (obj.getNota(i) == obj.menorNota()) {
                datosVector = datosVector + String.valueOf("IDENTIFICACION: " + obj.getIdentificacion(i));
            }

        }

        JOptionPane.showMessageDialog(null, "----  EL ID DEL ALUMNO DE MENOR NOTA ES  ------" + "\n" +"----"+ datosVector+"----");

    }
    
    public static void PromedioNotas(vectorparcial obj){
    
obj.PromedioNotas();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        vectorparcial obj = new vectorparcial();

        obj.Settamaño();

        for (int i = 0; i <= obj.tamaño - 1; i++) {

            String alumno = JOptionPane.showInputDialog(null, "-->NOMBRE DEL ALUMNO:  " + i + ": ");

            float Nota = Float.parseFloat(JOptionPane.showInputDialog(null, "-->INGRESE NOTA DEL ALUMNO:  " + i + ": "));

            int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "-->INGRESE LA EDAD DEL ALMUNO:  " + i + ": "));

            int ID = Integer.parseInt(JOptionPane.showInputDialog(null, "-->INGRESE EL ID DEL AMUNO: " + i + ": "));

            obj.SetAlumnos(i, alumno);
            obj.SetEdad(i, edad);
            obj.SetIdentificacion(i, ID);
            obj.SetNota(i, Nota);

        }

    mostrarArray(obj);
    PromedioNotas(obj);
    MayorNota(obj);
    MenorNota(obj);
        
        
    }
    

}
