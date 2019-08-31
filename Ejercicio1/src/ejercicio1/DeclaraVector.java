/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author ANDACAMES
 */
public class DeclaraVector {

    private int tamaño;
    private Empleados[] VecEmpleados;

    public DeclaraVector() {

        tamaño = 0;

    }


    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        VecEmpleados = new Empleados[tamaño];
    }

    public Empleados getVecEmpleados(int p) {
        return VecEmpleados[p];
    }

   public void setVecEmpleados(int p, Empleados val){
        VecEmpleados[p]=val;
    }

    public float CalcularSaldo(int Lugar) {
        float[] Calcular = new float[tamaño];

        int Valor;
        for (int i = 0; i < getTamaño(); i++) {
            if (VecEmpleados[i].getHoras() > 160) {
                Valor = VecEmpleados[i].getHoras() - 160;
                Calcular[i] = (VecEmpleados[i].getHoras() * 12000) + (Valor * 15000);
            } else {
                Calcular[i] = (VecEmpleados[i].getHoras() * 12000);
            }

        }
        return Calcular[Lugar];
    }

     public int Lugar()
    {
        int pos=-1;
        float Valor=0;
        for(int i=0; i<getTamaño(); i++)
        {
            if(CalcularSaldo(i)>Valor)
            {
                pos=i;
                Valor=CalcularSaldo(i);
            }
        }
        return pos;
    }

    
}
