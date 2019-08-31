/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author ANDACAMES
 */
public class main {

    public static int menu() {
        int opcion = 0;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("====== MENÚ DE OPCIONES - VECTOR DE OBJETOS ======\n\n" + "1. Cantidad de empleados\n" + "2. Registrar informacion de empleados\n" + "3. Mostrar la nómina total de la empresa\n" + "4. Mostrar la nómina de quienes laboraron horas extras\n" + "5. Mostrar Persona que ganó más dinero\n" + "6.Salir" + "\n" + "Seleccione una opción del 1 al 6:"));
        } while (opcion <= 0 || opcion > 6);
        return opcion;
    }

    public static void llenar(Empleados empl) {

        String nombre = JOptionPane.showInputDialog("Nombre del empleado:");
        empl.setNombre(nombre);

        String apellido = JOptionPane.showInputDialog("Apellido del empleado:");
        empl.setApellido(apellido);

        String Tipo = JOptionPane.showInputDialog("Digite Genero--> Masculino ó Femenino");
        empl.setSexo(Tipo);

        if (Tipo.compareTo("Masculino") == 0) {

            empl.setSexo("Masculino");

        } else {
            if (Tipo.compareTo("Femenino") == 0) {

                empl.setSexo("Femenino");

            }

        }

        int ident = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de ID:"));
        empl.setID(ident);

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad:"));
        empl.setEdad(edad);

        int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas:"));
        empl.setHoras(hora);

    }

    public static void Nomina(DeclaraVector vec) {
        String datos = "";
        for (int i = 0; i < vec.getTamaño(); i++) {
            datos += "\n\nNombre Empleado: " + vec.getVecEmpleados(i).getNombre() + "\nApellido Emmpleado: " + vec.getVecEmpleados(i).getApellido() + "\nGenero Empleado: " + vec.getVecEmpleados(i).getSexo()+ "\nIDempleado: " + vec.getVecEmpleados(i).getID()+ "\nEdad Empleado: " + vec.getVecEmpleados(i).getEdad()
                    + "\nNumero de horas trabajadas: " + vec.getVecEmpleados(i).getHoras()+ "\nSaldo: " + vec.CalcularSaldo(i);
        }
        JOptionPane.showMessageDialog(null, datos);
    }
    
     public static void NominaHorasExtras(DeclaraVector vec)
    {
        String datos = "";
        for (int i = 0; i < vec.getTamaño(); i++)
        {
            if(vec.getVecEmpleados(i).getHoras()>160)
            {
                datos += "\n\nNombre: " + vec.getVecEmpleados(i).getNombre()+ "\nApellido: " + vec.getVecEmpleados(i).getApellido() + "\nSexo: " + vec.getVecEmpleados(i).getSexo() +
                         "\nIdentificacion: " + vec.getVecEmpleados(i).getID() + "\nedad: " + vec.getVecEmpleados(i).getEdad() + "\nHoras trabajadas: " + vec.getVecEmpleados(i).getHoras() +  "\nSaldo: " + vec.CalcularSaldo(i);
            }
        }
        JOptionPane.showMessageDialog(null, datos);
    }
     
     public static void EmpleadoMayor(DeclaraVector vec)
    {
        if(vec.Lugar()==-1)
        {
           JOptionPane.showMessageDialog(null, "Dato inexistente");
        }
        else
        {
        String datos = "";
                        datos += "\nNombre: " + vec.getVecEmpleados(vec.Lugar()).getNombre()+ "\nApellido: " + vec.getVecEmpleados(vec.Lugar()).getApellido() + "\nSexo: " + vec.getVecEmpleados(vec.Lugar()).getSexo() +"\nIdentificacion: " + vec.getVecEmpleados(vec.Lugar()).getID() +
                         "\nedad: " + vec.getVecEmpleados(vec.Lugar()).getEdad() + "\nHoras trabajadas: " + vec.getVecEmpleados(vec.Lugar()).getHoras() + "\nSaldo: " + vec.CalcularSaldo(vec.Lugar());
            
        JOptionPane.showMessageDialog(null, datos);
        }
    }
     
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DeclaraVector obj=new DeclaraVector();
        Empleados empl;
        int opcion;
         do
        {
            opcion = menu();
            switch(opcion) 
            {
                case 1:
                    int Tamaño=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Cantidad de Empleados"));
                    obj.setTamaño(Tamaño);
                    break;
                case 2:
                    for (int i = 0; i < obj.getTamaño(); i++)
                        {
                            empl = new Empleados();
                            JOptionPane.showMessageDialog(null, "===DATOS===" + (i+1));
                            llenar(empl);
                            obj.setVecEmpleados(i, empl);
                        }
                        
                    break;
                case 3:
                    Nomina(obj);
                    break;
                case 4:
                    NominaHorasExtras(obj);
                    break;
                case 5:
                    EmpleadoMayor(obj);
                    break;
                case 6:
                    break;
                    
            }
        }
        while (opcion != 6);
    }
        
}
