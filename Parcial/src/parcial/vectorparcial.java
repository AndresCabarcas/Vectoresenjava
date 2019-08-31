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
public class vectorparcial {

    float Nota[];
    String Alumnos[];
    int Identificacion[];
    int Edad[];
    int tamaño;

    float suma = 0;
    float promedio = 0;

    public void Settamaño() {

        tamaño = Integer.parseInt(JOptionPane.showInputDialog("Digite tamaño del vector"));
        Alumnos = new String[tamaño];
        Identificacion = new int[tamaño];
        Edad = new int[tamaño];
        Nota = new float[tamaño];

    }

    public void SetAlumnos(int x, String b) {

        Alumnos[x] = b;

    }

    public void SetIdentificacion(int x, int b) {

        Identificacion[x] = b;

    }

    public void SetEdad(int x, int b) {

        Edad[x] = b;

    }

    public void SetNota(int x, float b) {

        Nota[x] = b;

    }

    public String getAlumnos(int p) {
        return Alumnos[p];
    }

    public int getIdentificacion(int p) {
        return Identificacion[p];
    }

    public int getEdad(int p) {
        return Edad[p];
    }

    public float getNota(int p) {
        return Nota[p];
    }

    public float NotaMayor() {
        float mayor = getNota(0);
        for (int i = 0; i <= tamaño - 1; i++) {
            if (getNota(i) > mayor) {
                mayor = getNota(i);
            }
        }
        return mayor;
    }

    public float menorNota() {

        float menor = getNota(0);
        for (int i = 0; i <= tamaño - 1; i++) {
            if (getNota(i) < menor) {
                menor = getNota(i);
            }
        }

        return menor;

    }

    public void PromedioNotas() {

        for (int i = 0; i < tamaño; i++) {

            suma +=Nota[i];

            promedio = suma/tamaño;

        }
       
        JOptionPane.showMessageDialog(null, "PROMEDIO DE NOTAS DEL CURSO ES :  "+promedio);
       
    }
    
}
