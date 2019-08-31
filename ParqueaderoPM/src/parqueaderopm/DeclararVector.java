/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueaderopm;

/**
 *
 * @author ANDACAMES
 */
public class DeclararVector {

    private int tamaño;
    private PetitaMoi VectorParqueadero[];
    private float valor;

    public void CrearVector() {

        VectorParqueadero = new PetitaMoi[tamaño];
        valor = 0;

    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public PetitaMoi getVectorParqueadero(int p) {
        return VectorParqueadero[p];
    }

    public void setVectorParqueadero(int p, PetitaMoi ve) {
        this.VectorParqueadero[p] = ve;
    }

    public float getValor() {

        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void calcular() {

        float promedio;

        for (int i = 0; i <= getTamaño() - 1; i++) {
            if (getVectorParqueadero(i).getTipo().equals("Auto")) {

                promedio = (getVectorParqueadero(i).getHoras() * 20000);
                setValor(promedio);

            } else {
                if (getVectorParqueadero(i).getTipo().equals("Camioneta")) {
                    promedio = (getVectorParqueadero(i).getHoras() * 25000);
                    setValor(promedio);
                } else {
                    if (getVectorParqueadero(i).getTipo().equals("Bus")) {
                        promedio = (getVectorParqueadero(i).getHoras() * 15000);
                        setValor(promedio);

                    }
                }
            }
        }

    }

    public void cambiar(int p1, int p2) {
        PetitaMoi temp;
        temp = getVectorParqueadero(p1);
        setVectorParqueadero(p1, getVectorParqueadero(p2));
        setVectorParqueadero(p2, temp);
    }

    public void ordenarBurbuja() {

        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = 0; j <= (getTamaño() - i) - 2; j++) {

                if (getVectorParqueadero(j).getHoras() > getVectorParqueadero(j + 1).getHoras()) {
                    cambiar(j, j + 1);

                }
            }
        }
    }

    public void ordenarIntercambio() {

        int i, j;
        for (i = 0; i <= getTamaño() - 1; i++) {
            for (j = i + 1; j <= getTamaño() - 1; j++) {

                if (getVectorParqueadero(i).getHoras() > getVectorParqueadero(j).getHoras()) {
                    cambiar(i, j);
                }
            }
        }
    }

}
