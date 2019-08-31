/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package declaravector;



public class DeclaraVector {
     static final int numeroElementos = 5;   
     private int vectorNumeros[];   
     
  public void DeclararVector(){  
      
      vectorNumeros = null;
  
  }
    
   public void crearVector(){        
       
       vectorNumeros = new int[numeroElementos]; 
       
   } 
    
     public void setVectorNumeros(int p, int dato){       
         vectorNumeros[p] = dato;    
     
     } 
     
      public int getVectorNumeros(int p){         
          return vectorNumeros[p];    
      
      }
      
       public int sumaVector(){      
           int suma = 0;        
           for (int i=0; i<=numeroElementos-1; i++){     
               suma = suma + getVectorNumeros(i);   
           }        
           return suma;
       }  
 
        public double promedioVector(){        
            int contador = 0;        
            double suma = 0;      
            for (int i=0; i<=numeroElementos-1; i++){  
                suma = suma + getVectorNumeros(i);       
                contador = contador + 1;       
            }       
            if(contador > 0){ 
                return (suma/contador); 
            }else{  
                return 0;  
            }   
        }
        
         public int mayorElemento(){ 
         int mayor = getVectorNumeros(0);  
         for (int i=0; i<=numeroElementos-1; i++){ 
             if (getVectorNumeros(i) > mayor){     
                 mayor = getVectorNumeros(i);  
             } 
         }
         return mayor;
         }
         
           public int menorElemento(){     
               int menor = getVectorNumeros(0);   
               for (int i=0; i<=numeroElementos-1; i++){
                   if (getVectorNumeros(i) < menor){    
                       menor = getVectorNumeros(i);   
                   }
               }
               return menor;
           }
           
} 
 
 
       



