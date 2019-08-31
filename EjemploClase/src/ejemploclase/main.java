/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclase;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {

    public static void mostrarVector(DeclararVectorObjetos obj) {
        String datosVector = "";
        for (int i = 0; i <= obj.getTamano() - 1; i++) {
            datosVector = datosVector + String.valueOf("CODIGO: " + obj.getVectorEstudiantes(i).getCodigo() + " NOMBRE: " + obj.getVectorEstudiantes(i).getNombre() + " NOTA: " + obj.getVectorEstudiantes(i).getNota() + "\n");
        }
        JOptionPane.showMessageDialog(null, "======= ELEMENTOS DEL VECTOR DE OBJETOS =======" + "\n" + datosVector);
    }

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("====== MENÚ DE OPCIONES - VECTOR DE OBJETOS ======\n\n" + "1. Registrar la información de los estudiantes\n" + "2. Mostrar la información de los estudiantes\n" + "3. Promedio de los estudiantes que reprobaron\n" + "4. Listado de los estudiantes que reprobaron\n" + "5. Salir" + "\n" + "Seleccione una opción del 1 al 5:"));
        } while (opcion <= 0 || opcion > 5);
        return opcion;
    }

    public static void llenar(Estudiantes est) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del Estudiante: "));
        est.setCodigo(cod);
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del Estudiante: ");
        est.setNombre(nom);
        float note = Float.parseFloat(JOptionPane.showInputDialog("Digite La NOTA del Estudiante:"));
        est.setNota(note);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        DeclararVectorObjetos obj = new DeclararVectorObjetos();
        Estudiantes est;
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Número de Elementos del Vector:"));
                    obj.setTamano(numeroElementos);
                    obj.crearVector();
                    for (int i = 0; i <= obj.getTamano() - 1; i++) {
                        est = new Estudiantes();
                        JOptionPane.showMessageDialog(null, "============ ELEMENTOS DEL VECTOR ============" + "\n \n" + "Ingresar la Informacón del estudiante ---- " + (i + 1));
                        llenar(est);
                        obj.setVectorEstudiantes(i, est);
                    }
                    mostrarVector(obj);
                    break;
                case 2:
                    mostrarVector(obj);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "======== PROMEDIO DE LOS ESTUDIANTES QUE REPROBARON ========" + "\n\n" + "Promedio Reprobados: " + obj.promedioRepobados());
                    break;
                case 4:
                    String datosVector = "";
                    for (int i = 0; i <= obj.getTamano() - 1; i++) {
                        if (obj.getVectorEstudiantes(i).getNota() < 3) {
                            datosVector = datosVector + String.valueOf("NOMBRE: " + obj.getVectorEstudiantes(i).getNombre() + "\n");
                        }
                    }
                    JOptionPane.showMessageDialog(null, "===== NOMBRE DE LOS ESTUDIANTES QUE REPROBARON =====" + "\n" + datosVector);
                    break;
                case 5:    
                    break;
            }
        } while (opcion != 5);

        }
        
    }
