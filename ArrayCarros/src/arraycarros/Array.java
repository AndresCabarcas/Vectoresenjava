/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraycarros;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class Array {

    ArrayList<Carro> VectorCarro = new ArrayList<Carro>();


    public void Agregar() {

        Carro obj1 = new Carro("Renault", 50000000, 2800, "HSD-345", "Andres Cabarcas", 317388922, 1242533);
        Carro obj2 = new Carro("Logan", 80000000, 5800, "FFF-675", "Jesus Moreno", 318767892, 989878);
        Carro obj3 = new Carro("BMW", 90000000, 8800, "HDF-777", "Yeinis Espinosa", 305895922, 1245553);
        Carro obj4 = new Carro("Chevrolet", 50000000, 4800, "WWE-787", "Andres Mestra", 3564922, 1999533);
        Carro obj5 = new Carro("Aveo", 60000000, 4900, "HFF-788", "Deivis Sanches", 388922, 888833);
        Carro obj6 = new Carro("Renault", 45000000, 3800, "HCC-999", "Anderson Oviedo", 313922, 7777733);
        Carro obj7 = new Carro("Campero", 80000000, 5000, "QQQ-535", "David Soto", 8888822, 17777733);

        if (VectorCarro.size() < 7) {
            VectorCarro.add(obj1);
            VectorCarro.add(obj2);
            VectorCarro.add(obj3);
            VectorCarro.add(obj4);
            VectorCarro.add(obj5);
            VectorCarro.add(obj6);
            VectorCarro.add(obj7);
        } else {
            JOptionPane.showMessageDialog(null, "!Lo sentimos¡:  el vector esta lleno");
        }
    }

    public int Contador() {
        return VectorCarro.size();
    }

    public void VaciarFila() {
        VectorCarro.clear();
    }

    public Carro qCarro(int i) {
        //metodo para obtener dato de la pila en una poscion i
        Carro h;
        h = VectorCarro.get(i);
        return h;
    }

    public void BuscarPlaca(String Placa) {
        for (int i = 0; i <= Contador(); i++) {
            if (VectorCarro.get(i).getPlaca().equals(Placa)) {
                JOptionPane.showMessageDialog(null, "----Datos del auto-----" + "\n" + "Marca: " + qCarro(i).getModelo() + "\n Placa : " + qCarro(i).getPlaca() + "\n " + "Cilindraje:  " + qCarro(i).getCilindraje() + "\n" + "Precio:  " + qCarro(i).getPrecioCarro()
                        + "\n" + "-----Datos del Propietario-----" + "\n" + "Nombre:  " + qCarro(i).getNombre() + "\n" + "ID:  " + qCarro(i).getID() + "\nTelefono: " + qCarro(i).getTelefono() + "\n");
            }
        }
    }

}
