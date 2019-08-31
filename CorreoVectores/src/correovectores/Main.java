/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correovectores;


import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Jose Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
         //codigo look and feel para asignar el diseño Nimbus para la interface Jframe
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (InstantiationException ex) {
            System.out.println("Error de instancia"+ex);
        } catch (IllegalAccessException ex) {
            System.out.println("Error: al acceder a biblioteca"+ex);
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println("Error: Diseño no soportado"+ex);
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no encontrada"+ex);
        }
       //hacemos visible el Jframe
        new SingUp().setVisible(true);
    }
    
}
