/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {
    
    public static void llenar(Docente empl)
    {
        String nombre = JOptionPane.showInputDialog("Digite nombre:");
        empl.setNombre(nombre);
        
        
        int Nombrados = Integer.parseInt(JOptionPane.showInputDialog(" Tipo de Docente \n 1.Nombrados\n 2.Catedratico"));
        empl.setNombrados(Nombrados);
        while(empl.getNombrados()<1 || empl.getNombrados()> 2 )
            {
                Nombrados = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Docente \n 1.Nombrados\n 2.Catedratico"));
                empl.setNombrados(Nombrados);                               
            }
        if(empl.getNombrados()==2)
        {
            int Catedraicos = Integer.parseInt(JOptionPane.showInputDialog("=== Docente Catedratico ===\n1.Auxiliar \n2.Asistente"));
            empl.setCatedraicos(Catedraicos);
            while(empl.getCatedraicos()<1 || empl.getCatedraicos()> 2 )
            {
                Catedraicos = Integer.parseInt(JOptionPane.showInputDialog("=== =/  Docente Catedratico ===\n1.Auxiliar \n2.Asistente"));
                empl.setCatedraicos(Catedraicos);                
            }
        }
        int puntos = Integer.parseInt(JOptionPane.showInputDialog("Digite puntos:"));
        empl.setPuntos(puntos);
        
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite Horas asignadas:"));
        empl.setHorasAsignadas(hora);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
