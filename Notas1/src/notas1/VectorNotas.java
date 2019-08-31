
package notas1;

import javax.swing.JOptionPane;

/**
 *
 * @author AndrésCabarcas
 */
public class VectorNotas {
      

   float Notas[];
   int tamaño;
    
 
    
 public void llenar(){
    
tamaño=Integer.parseInt(JOptionPane.showInputDialog(null, "====SISTEMA DE NOTAS 2017====\n\n"+"Cantidad de estudiantes: "));
Notas= new float [tamaño];
      
    }
 
 public void ingresardatos(int p,float dato){
 
     Notas[p]=dato;
         
     }
 
 public float getvectornotas(int p){
 
 return Notas[p];
 
 }
 
 /*
public int menu(){


       do{           
           opcion = Integer.parseInt(JOptionPane.showInputDialog("====== HISTORIAL ACADEMICO ====== \n"+   
                   "1. Notas entre 3 y 4 \n"+"2. Notas sobre 4 \n"+"3. total de estudiantes reprobados \n"+    
                   "4. Promedio del curso \n"+"5. Salir \n"+"\n "+ "\n \n Seleccione una opción del 1 al 5"));   
       }while(opcion <= 0 || opcion > 5);
       return opcion;
       
}
*/
 
} 

