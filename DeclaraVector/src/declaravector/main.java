
package declaravector;
import javax.swing.JOptionPane;

public class main {

     public static void mostrarVector(DeclaraVector vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.numeroElementos-1; i++) {
            datosVector = datosVector + String.valueOf("Posición " + i + ": " + vec.getVectorNumeros(i) + "\n");
        }
        
        JOptionPane.showMessageDialog(null, "============ ELEMENTOS DEL VECTOR ============" + "\n" + datosVector);
        
    }
    
   public static int menu(){      
       int opcion = 0;     
       do{           
           opcion = Integer.parseInt(JOptionPane.showInputDialog("====== SELECCIONE EL METODO DE BUSQUEDA ====== \n"+   
                   "1. LLenar Vector \n"+"2. Suma y Promedio de los Elementos \n"+"3. Elemento Mayor y Menor \n"+    
                   "4. Mostar Elementos de Vector \n"+"5. Salir \n"+"\n Nota: Debe llenar el vector para usar el resto de funciones"+ "\n \n Seleccione una opción del 1 al 5"));   
       }while(opcion <= 0 || opcion > 5);  
       return opcion;    
   }     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          DeclaraVector vec= new DeclaraVector();
          
          int opcion;       
          
          do{            
              opcion = menu();         
          switch(opcion){  
              
          
              case 1:     
                  
                  vec.crearVector();
                           for(int i=0; i<=vec.numeroElementos-1; i++){ 
                               
                           
              int dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Digitar Elemento de la Posición "+i+": "));
              vec.setVectorNumeros(i, dato);
          }
                           
          JOptionPane.showMessageDialog(null,"Vector Lleno.... ");    
          mostrarVector(vec);                
          break;  
          
          case 2:   
              
          JOptionPane.showMessageDialog(null, "========= SUMA Y PROMEDIO DE LOS ELEMENTOS ========= \n\n"+
          "Suma de los Elementos: "+vec.sumaVector()+"\n\n Promedio de los Elementos: "+vec.promedioVector()+
          "\n\n"                         + ""); 
          break;              
          case 3:                
          JOptionPane.showMessageDialog(null, "========= ELEMENTO MAYOR Y MENOR DEL VECTOR ========= \n\n"+
          "Elemento Mayor: "+vec.mayorElemento()+"\n\n Elemento Menor: "+vec.menorElemento()+"\n\n"+ "");  
          break;
          case 4:                  
          mostrarVector(vec);        
          break;               
          case 5:                 
          break;                
      }     
          }while(opcion != 5); 
    }   
} 

   

        
    
    

