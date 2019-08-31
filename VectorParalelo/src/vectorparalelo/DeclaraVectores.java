/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorparalelo;

/**
 *
 * @author ANDACAMES
 */
public class DeclaraVectores {

    String Nombre[];
    String Materia[];
    float Nota[];
    int tam;
     private int casignatura, cestudiante=0, chorario, cmatricula;

    public DeclaraVectores() {
        Nombre = new String[5];
        Materia = new String[5];
        Nota = new float[5];
        tam = 5;
        casignatura=cestudiante=chorario=cmatricula=0;
    }

    public int getTam() {
        return tam;
    }

    public void SetNombre(int p,String dato) {
        this.Nombre[p] = dato;
    }

    public void SetMateria(int p,String dato) {
        this.Materia[p] = dato;
    }

    public void SetNota(int p,float dato) {
        this.Nota[p] = dato;
    }

    public String GetNombre(int p) {
        return Nombre[p];
    }

    public String GetMateria(int p) {
        return Materia[p];
    }

    public float GetNota(int p) {
        return Nota[p];
    }

    public int getCasignatura() {
        return casignatura;
    }

    public void setCasignatura(int casignatura) {
        this.casignatura = casignatura;
    }

    public int getCestudiante() {
        return cestudiante;
    }

    public void setCestudiante(int cestudiante) {
        this.cestudiante = cestudiante;
    }

    public int getChorario() {
        return chorario;
    }

    public void setChorario(int chorario) {
        this.chorario = chorario;
    }

    public int getCmatricula() {
        return cmatricula;
    }

    public void setCmatricula(int cmatricula) {
        this.cmatricula = cmatricula;
    }
    
    

    public float mayorNota() {
        float mayor = GetNota(0);
        for (int i = 0; i <= tam - 1; i++) {
            if (GetNota(i) > mayor) {
                mayor = GetNota(i);
            }
        }
        return mayor;
    }

    public float menorNota() {

        float menor = GetNota(0);
        for (int i = 0; i <= tam - 1; i++) {
            if (GetNota(i) < menor) {
                menor = GetNota(i);
            }
        }

        return menor;

    }
}
