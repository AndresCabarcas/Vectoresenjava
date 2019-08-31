/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vparalelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Wilmer
 */
public class Vparalelo {

    // metodo para mostrar en pantalla los datos del vector
    public static void mostrarVector(Productos vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.getTamano() - 1; i++) {
            datosVector = datosVector + String.valueOf("CODIGO: " + vec.getCodigoProducto(i) + " " + "NOMBRE: " + vec.getNombreProducto(i) + " " + "PRECIO: " + vec.getPrecioProducto(i) + " " + "CANTIDAD: " + vec.getCantidad(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, "=========== PRODUCTOS REGISTRADOS EN EL VECTOR ===========" + "\n\n" + datosVector);
    }

    // metodo para crear el menu y mostrarlo en pantalla
    
    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("===== SELECCIONE SELECCIONE UNA OPCIÓN DEL MENÚ =====\n\n" + "1. Registrar información de los productos \n" + "2. Mostar los productos más costosos \n" + "3. Mostrar los productos registrados \n" + "4. informe " +"\n\n5.salir"+ "\n \n Seleccione una opción del 1 al 4"));
        } while (opcion <= 0 || opcion > 4);
        return opcion;
        
    }

    // metodo para mostrar los productor de mayor precio  utilizando un ciclo for para recorrer el vector  y mostrar resultado si se cumple cierta condicion
    public static void productosMayorPrecio(Productos vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.getTamano() - 1; i++) {
            if (vec.getPrecioProducto(i) == vec.mayorPrecio()) {
                datosVector = datosVector + String.valueOf("NOMBRE: " + vec.getNombreProducto(i) + "\n");
            }
        }
        JOptionPane.showMessageDialog(null, "=========== PRODUCTOS MAS COSTOSOS EN EL VECTOR ===========" + "\n" + datosVector);
    
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //creacion del objeto 
        
        Productos vec = new Productos();
        
        //declaracion de variable opcion para el menu
        //Se implementa el método con el menú de opciones de la aplicación para las diferentes
        //operaciones sobre el vector.   
        
        int opcion;
        
        do {
            opcion = menu();
            
            // se utiliza switch case para el menu y realizar ciertas operaciones para cada caso 
            switch (opcion) {
                case 1:
                    int numeroElementos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Número de Productos a Registrar:"));
                    vec.setTamano(numeroElementos);
                    vec.crearVectores();
                    // ingreso de datos a los vectores 
                    
                    for (int i = 0; i <= vec.getTamano() - 1; i++) {
                        // joption panel para digitar el codigo , nombre, precio, cantidad
                        int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el Código del Producto " + i + ": "));
                        String nombre = JOptionPane.showInputDialog(null, "Digite el Nombre del Producto " + i + ": ");
                        float precio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite el Precio del Producto " + i + ": "));
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de Productos " + i + ": "));
                        
                        //llamado de los metodos en los cuales se almacenaran los datos suministrados por el usuario 
                        vec.setCodigoProducto(i, codigo);
                        vec.setNombreProducto(i, nombre);
                        vec.setPrecioProducto(i, precio);
                        vec.setCantidad(i, cantidad);
                        

                          
                    }

 
                    JOptionPane.showMessageDialog(null, "Productos Registrados.... ");
                    mostrarVector(vec);
                    break;
                case 2:
                    productosMayorPrecio(vec);
                    break;
                case 3:
                    mostrarVector(vec);
                    break;
                case 4:
                         //ciclo que busca en el vector los productos  los cuales su precio sean superior a 2500 y con una cantidad menor a 5
                    //mostrara en pantalla uno a uno los productos que cumplan estas caracteristicas
                                              for (int j = 0; j <= vec.getTamano()-1; j++) {
                              
                              if (vec.getPrecioProducto(j)>2500) {
                                  
                                  if (vec.getCantidad(j)<5) {
                                      
                                      JOptionPane.showMessageDialog(null, "=====Informe productos precio superior a 2500 cantidad menor a 5====\n\n"+"Nombre Producto:"+vec.getNombreProducto(j));
                                      
                                  }
                                  
                              }
                              
                        }
 
                    break;
                case 5:
                    break;
            }
        } while (opcion != 5);
    }

}


