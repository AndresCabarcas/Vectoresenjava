package vparalelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Wilmer
 */
public class Productos {

    // declaracion de vectores y variable de tamaño
    private int codigoProducto[];
    private String nombreProducto[];
    private float precioProducto[];
    private int cantida[];
    private int tamano;
    int buscar;

    //metodo para inicializar la cantidad de productoso,nombre... y tamaño del vector
    public void Productos() {
        codigoProducto = null;
        nombreProducto = null;
        precioProducto = null;
        cantida = null;
        tamano = 0;
    }

    // metodo para asignar valor a variable tamaño la cual sera usada para asignar la longitud del vector
    
    public void setTamano(int n) {
        tamano = n;
    }

    public int getTamano() {
        return tamano;
    }
    
    //metodo para crear vectores con el tamaño asignado

    public void crearVectores() {
        codigoProducto = new int[tamano];
        nombreProducto = new String[tamano];
        precioProducto = new float[tamano];
        cantida = new int[tamano];
    }
    
    //metodo para llenar vector codigoProducto con los valores que indique el usuario almacenado en la variablel dato en la poscicion p del vector

    public void setCodigoProducto(int p, int dato) {
        codigoProducto[p] = dato;
    }

    //metodo para llenar vector nombreproducto con los valores que indique el usuario
    public void setNombreProducto(int p, String dato) {
        nombreProducto[p] = dato;
    }
//metodo para llenar vector precioProducto con los valores que indique el usuario
    public void setPrecioProducto(int p, float dato) {
        precioProducto[p] = dato;
    }
//metodo para asignar el tamaño del vector con el dato digitador por el usuario
    public void setCantidad(int p, int dato) {
        cantida[p] = dato;
    }
    
   
// metodos get para obtener los valores 
    //Método selector del vector para obtener un elemento del vector que este almacenado en alguna 
//posición, se pasa como parámetro la posición (p) del elemento que se desea obtener del vector
    
    public int getCodigoProducto(int p) {
        return codigoProducto[p];
    }

    public String getNombreProducto(int p) {
        return nombreProducto[p];
    }

    public float getPrecioProducto(int p) {
        return precioProducto[p];
    }

    public int getCantidad(int p) {
        return cantida[p];
    }


    
    //metodo que recorre el vector para buscar el mayor precio 
    // el ciclo for nos dice que desde la poscicion 0 hasta la poscicion final asginada por el usuario el vector sera recorrido 
    // y en proceso primero tomara el primer numero y los comparara uno a uno y al final tomara el de mayor valor y quedara asigano a la variable mayor tipo float
    
    public float mayorPrecio() {
        float mayor = getPrecioProducto(0);
        for (int i = 0; i <= getTamano() - 1; i++) {
            if (getPrecioProducto(i) > mayor) {
                mayor = getPrecioProducto(i);
            }
        }
        return mayor;
    }
}
    
    
            

