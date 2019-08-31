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
public class main {
     public static void mostrarVector(Vector obj) {
        String datosVector = "";
        for (int i = 0; i <= obj.getTamaño()- 1; i++) {
            datosVector = datosVector + String.valueOf("Identificacion: " + obj.getVectorEstudiante(i).getCodigo() +" "+ " NOMBRE: " + obj.getVectorEstudiante(i).getNombre() + " "+" NOTA: " + obj.getVectorEstudiante(i).getNota() +" "+"Carrera: "+obj.getVectorEstudiante(i).getCarrera()+ "\n");
        }
        JOptionPane.showMessageDialog(null, "======= ELEMENTOS DEL VECTOR DE OBJETOS =======" + "\n" + datosVector);
    }
     
     public static void llenar(Estudiante est) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite Identificacion del Estudiante: "));
        est.setCodigo(cod);
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante: ");
        est.setNombre(nom);
        String carr = JOptionPane.showInputDialog("Digite Carrera del Estudiante: ");
        est.setCarrera(carr);
        float note = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA del Estudiante:"));
        est.setNota(note);
    }
     
     public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("====== MENÚ DE OPCIONES - VECTOR DE OBJETOS ======\n\n" + "1. Registrar la información de los estudiantes\n" + "2. Mostrar la información de los estudiantes\n" + "3. Realizar busqueda\n" + "4.Ordenar por intercambio\n" + "5. ordenar por seleccion\n"+"6.ordenar por burbuja\n"+"7.promedio notas\n"+"8.Desviacion estandar\n"+"9.cuartil 1\n"+"10.cuartil 3\n"+"11.salir" + "\n" + "Seleccione una opción del 1 al 9:"));
        } while (opcion <= 0 || opcion > 11);
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Vector obj=new Vector();
        
        Estudiante est;
        int opcion;
        
        do {
            
            opcion=menu();
            
            switch  (opcion){
            
                case 1:
                    
                    int tamaño = 15;
                    obj.setTamaño(tamaño);
                    obj.CrearVector();
                    for (int i = 0; i <= obj.getTamaño()-1; i++) {
                        
                      est = new Estudiante();
                      
                      JOptionPane.showMessageDialog(null, "============ ELEMENTOS DEL VECTOR ============" + "\n \n" + "Ingresar la Informacón del estudiante ---- " + (i + 1));
                        llenar(est);
                        obj.setVectorEstudiante(i, est);
                        
                    }
             mostrarVector(obj);
             break;
             
                case 2:
                    mostrarVector(obj);
                    break;
                case 3:
                    float datoBuscar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el dato que desea buscar:"));
                    int posicionDato = obj.busquedaLineal(datoBuscar);
                    if (posicionDato != -1) {
                        JOptionPane.showMessageDialog(null, "El elemento" + obj.getVectorEstudiante(posicionDato).getNombre() + " se encuentra en la posicion " + posicionDato + " del vector"
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "El Elemento No se encuentra en el vector");
                    }
                    
                    break;
                case 4:
                   
                   obj.ordenarIntercambio();
                   mostrarVector(obj);
                    break;
                case 5:
                    
                    obj.ordenarSeleccion();
                    mostrarVector(obj);
                    break;
                case 6: 
                    
                    obj.ordenarBurbuja();
                    mostrarVector(obj);
                    break;
                case 7:
                    obj.PromedioNotas();
                    break;
                case 8:
                    obj.DesviacionEstandar();
                    break;
                case 9:
                    obj.Cuartil1();
                    break;
                case 10:
                    obj.Cuartil3();
                    break;
                case 11:
                    break;
            }
            
        } while (opcion !=11);
        
        
        
        
    }
   
    
}
