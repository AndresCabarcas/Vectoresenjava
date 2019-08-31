/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacioni;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Main {
   
    
    public static void mostrarVector(VectorCarro vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.Tam- 1; i++) {
            datosVector = datosVector + String.valueOf("MODELO: " + vec.getVectorEstudiante(i).getModelo() + "\n " + "PLACA: " + vec.getVectorEstudiante(i).getPlaca() + "\n " + "PRECIO: " + vec.getVectorEstudiante(i).getPrecioCarro() + "\n " + "CILINDRAJE: " + vec.getVectorEstudiante(i).getCilindraje() + "\n\n"
             +"---------DATOS PROPIETARIO------\n\n"+"NOMBRE: "+vec.getVectorEstudiante(i).getNombre()+"\n"+"ID: "+vec.getVectorEstudiante(i).getID()+"\nTelefono: "+vec.getVectorEstudiante(i).getTelefono());
        }
        JOptionPane.showMessageDialog(null, "=========== CARROS REGISTRADOS EN EL VECTOR ===========" + "\n\n" + datosVector);
    }
    
        
    
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== SELECCIONE SELECCIONE UNA OPCIÓN DEL MENÚ =====\n\n" +
                    "1. Mostrar Elementos del vector \n" + 
                    "2. Buscar por placa \n"
                    + "3. Tabla de Tarifas Impuesto \n"
                    + "4. informe " 
                    +"\n\n5.salir"
                    + "\n \n Seleccione una opción del 1 al 4"));
        } while (opcion <= 0 || opcion > 4);
        return opcion;
        
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic int opcion;
        
        
        VectorCarro obj=new VectorCarro();
        Carro obj2=new Carro();
        
        int opcion;
        
        do {
            opcion = menu();
            
            // se utiliza switch case para el menu y realizar ciertas operaciones para cada caso 
            switch (opcion) {
                case 1:
                    obj.CrearVector();
                    obj2.LlenarVector();
                    mostrarVector(obj);
                    break;
                case 2:
                   
                    break;
                case 3:
             
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }    
}
