/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderopm;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {

    public static void mostrarVector(DeclararVector obj) {
        String datosVector = "";
        obj.calcular();
        for (int i = 0; i <= obj.getTamaño() - 1; i++) {
            datosVector = datosVector + String.valueOf("Codigo: " + obj.getVectorParqueadero(i).getCodigo() + " " + " Cliente: " + obj.getVectorParqueadero(i).getCliente() + " " + " Horas: " + obj.getVectorParqueadero(i).getHoras() + " " + "Tipo: " + obj.getVectorParqueadero(i).getTipo() + "Valor: " + obj.getValor() + "\n");
        }
        JOptionPane.showMessageDialog(null, "======= ELEMENTOS DEL VECTOR DE OBJETOS =======" + "\n" + datosVector);
    }

    public static void llenar(PetitaMoi est) {
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite codigo del cliente: "));
        est.setCodigo(cod);
        String cli = JOptionPane.showInputDialog("Digite NOMBRE del cliente: ");
        est.setCliente(cli);
        String cat = JOptionPane.showInputDialog("Digite Tipo de vehiculo: ");
        est.setTipo(cat);
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Digite La cantidad de horas:"));
        est.setHoras(hora);
    }

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("====== MENÚ DE OPCIONES - VECTOR DE OBJETOS ======\n\n" + "1. Factura \n" + "2.Mostrar Factura(s)\n" + "3.Ordenar Burbuja\n" + "4.Ordenar intercambio\n" + "5.Salir" + "\n" + "Seleccione una opción del 1 al 5:"));
        } while (opcion <= 0 || opcion > 5);
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DeclararVector obj = new DeclararVector();

        PetitaMoi est;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {

                case 1:
                    int tamaño = 2;
                    obj.setTamaño(tamaño);
                    obj.CrearVector();
                    for (int i = 0; i <= obj.getTamaño() - 1; i++) {

                        est = new PetitaMoi();

                        JOptionPane.showMessageDialog(null, "============ ELEMENTOS DEL VECTOR ============" + "\n \n" + "Ingresar la Informacón ---- " + (i + 1));
                        llenar(est);
                        obj.setVectorParqueadero(i, est);

                    }
                    mostrarVector(obj);
                    break;
                case 2:
                    mostrarVector(obj);
                    break;
                case 3:
                    obj.ordenarBurbuja();
                    mostrarVector(obj);
                    break;
                case 4:
                    obj.ordenarIntercambio();
                    mostrarVector(obj);
                    break;
                case 5:
                    break;
            }

        } while (opcion != 5);

    }
}
