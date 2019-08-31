/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialvectores;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {
    
    public static void mostrarVector(DeclaraVectores vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.getTamano() - 1; i++) {
            datosVector = datosVector + String.valueOf("ID: " + vec.getId(i) + " " + "NOMBRE: " + vec.getNombre(i) + " " + "CARGO: " + vec.getCargo(i) + " " + "DEPENDENCIA: " + vec.getDependencia(i)+" " + "SUELDO: "+vec.getSueldo(i)+"\n");
        }
        JOptionPane.showMessageDialog(null, "=========== DATOS REGISTRADOS EN EL VECTOR ===========" + "\n\n" + datosVector);
    }
    
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== SELECCIONE SELECCIONE UNA OPCIÓN DEL MENÚ =====\n\n" + "1. Registrar información a los vectores \n" + "2. Funcionarios que ganan mas de 2 millones \n" + "3. Mostrar los datos registrados \n"+"\n\n4.salir"+ "\n \n Seleccione una opción del 1 al 4"));
        } while (opcion <= 0 || opcion > 4);
        return opcion;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DeclaraVectores vec=new DeclaraVectores();
        
        int opcion;
        
        do {
            opcion = menu();
            
            // se utiliza switch case para el menu y realizar ciertas operaciones para cada caso 
            switch (opcion) {
                case 1:
                    int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Número de personas a Registrar:"));
                    vec.setTamano(numeroElementos);
                    vec.crearVectores();
                    // ingreso de datos a los vectores 
                    
                    for (int i = 0; i <= vec.getTamano() - 1; i++) {
                        // joption panel para digitar el codigo , nombre, precio, cantidad
                        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite Id de la persona " + i + ": "));
                        String nombre = JOptionPane.showInputDialog(null, "Digite el Nombre de la persona " + i + ": ");
                        String dependencia = JOptionPane.showInputDialog(null, "Digite la dependencia" + i + ": ");
                        String cargo = JOptionPane.showInputDialog(null, "Digite el cargo " + i + ": ");
                        float sueldo = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el sueldo " + i + ": "));
                        
                        //llamado de los metodos en los cuales se almacenaran los datos suministrados por el usuario 
                        vec.setId(i, id);
                        vec.setNombre(i, nombre);
                        vec.setDependencia(i, dependencia);
                        vec.setSueldo(i, sueldo);
                        vec.setCargo(i, cargo);
                          
                    }
                    JOptionPane.showMessageDialog(null, "Datos Registrados.... ");
                    break;
                case 2:
                                      for (int i = 0; i < vec.getTamano(); i++) {
                        if (vec.getSueldo(i)> 2000000 && vec.getCargo(i).equals("funcionario")||vec.getCargo(i).equals("Funcionario")) {
                            JOptionPane.showMessageDialog(null, "Los funcionarios que tienen sueldo mayor a 2millones son: "+"\n"+"Nombre: "+vec.getNombre(i));
                        }
                    }
                    break;
                case 3:
                    mostrarVector(vec);
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }
    
}
