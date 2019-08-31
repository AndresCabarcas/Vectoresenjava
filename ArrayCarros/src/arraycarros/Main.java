/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycarros;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {
    
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== SELECCIONE SELECCIONE UNA OPCIÓN DEL MENÚ =====\n\n"
                    + "1. Mostrar Elementos del vector \n"
                    + "2. Buscar por placa \n"
                    + "\n\n3.salir"
                    + "\n \n Seleccione una opción del 1 al 3"));
        } while (opcion <= 0 || opcion > 3);
        return opcion;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        
        Array m = new Array();
        
        do {
            opcion = menu();

            // se utiliza switch case para el menu y realizar ciertas operaciones para cada caso 
            switch (opcion) {
                case 1:
                    m.Agregar();
                    int impuesto=0;
                    for (int i = 0; i < m.Contador(); i++) {
                        if (m.qCarro(i).getPrecioCarro() <= 45272000) {
                            impuesto = (int) (m.qCarro(i).getPrecioCarro() * 0.015);
                        } else {
                            if (m.qCarro(i).getPrecioCarro() > 45272000 && m.qCarro(i).getPrecioCarro() < 101860000) {
                                impuesto = (int) (m.qCarro(i).getPrecioCarro() * 0.025);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "----Datos del auto-----" + "\n" + "Marca: " + m.qCarro(i).getModelo() + "\n Placa : " + m.qCarro(i).getPlaca() + "\n " + "Cilindraje:  " + m.qCarro(i).getCilindraje() + "\n" + "Precio:  " + m.qCarro(i).getPrecioCarro()
                                + "\nImpuesto: " + impuesto + "\n\n" + "-----Datos del Propietario-----" + "\n" + "Nombre:  " + m.qCarro(i).getNombre() + "\n" + "ID:  " + m.qCarro(i).getID() + "\nTelefono: " + m.qCarro(i).getTelefono() + "\n");                       
                    }
                    break;
                case 2:
                    m.Agregar();
                    String Placa = JOptionPane.showInputDialog("Digite la placa del auto");
                    m.BuscarPlaca(Placa);
                    break;
                case 3:                    
                    break;
                
            }
        } while (opcion != 3);
        
    }
    
}
