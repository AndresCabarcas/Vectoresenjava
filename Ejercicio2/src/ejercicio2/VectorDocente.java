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
public class VectorDocente {
    
    private int Tamaño;
    private Docente [] VecDocente;
    
    public VectorDocente()
    {
        Tamaño=0;
    }
    
    public void setTamaño(int val)
    {
        Tamaño=val;
        VecDocente=new Docente[Tamaño];
    }
    public int getTamaño()
    {
        return Tamaño;
    }
    public void setValor(int pos, Docente val)
    {
        VecDocente[pos]=val;
    }
    public Docente getValor(int pos)
    {
        return VecDocente[pos];
    }
    
    public float SueldoNombrados(int pos)
    {
        float [] sueldo=new float[getTamaño()];
        
        for(int i=0; i<getTamaño(); i++)
        {
            sueldo[i]=getValor(i).getPuntos()* 12500;
        }
        return sueldo[pos];
    }
    
    public float SueldoCatedraticosAuxiliar(int pos)
    {
        float [] sueldo=new float[getTamaño()];
        
        for(int i=0; i<getTamaño(); i++)
        {
            sueldo[i]=getValor(i).getHorasAsignadas()* 22150;
        }
        return sueldo[pos];
    }
    
    public float SueldoCatedraticosAsistente(int pos)
    {
        float [] sueldo=new float[getTamaño()];
        
        for(int i=0; i<getTamaño(); i++)
        {
            sueldo[i]=getValor(i).getHorasAsignadas()* 30100;
        }
        return sueldo[pos];
    }
}
