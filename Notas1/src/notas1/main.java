package notas1;
import javax.swing.JOptionPane;

public class main {

   public static void mostrarVector(VectorNotas vec) {
        String datosVector = "";
        for (int i = 0; i <= vec.tamaño-1; i++) {
            datosVector = datosVector + String.valueOf("Estudiante " + i + ": " + vec.getvectornotas(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, "============ Notas de estudiantes ============" + "\n" + datosVector);
    }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        VectorNotas vec=new VectorNotas();
vec.llenar();

int cont1=0, cont2=0, cont3=0,suma,perdidos;
float promedio;



        for (int i = 0; i <=vec.tamaño-1; i++) {
            
            float dato = Float.parseFloat(JOptionPane.showInputDialog(null,"Nota: las notas se deben digitar de 1 a 5\n\n"+"Digitar nota para estudiante "+i+":"));
            vec.ingresardatos(i, dato);
            
            if (dato>=4) {
                
                cont1++;
                
                
                JOptionPane.showMessageDialog(null, "el estudiante   "+" "+i+" "+"es superior\n\n"+" la cantidad de estudiantes superioes es : "+cont1);
                
            } else {
                
                if (dato<3) {
                    
                    cont2++;
                    
                    JOptionPane.showMessageDialog(null, "el estudiante"+" "+i+" "+" reprobo\n\n"+"la cantidad de reprobados es: "+cont2);
                    
                } else {
                    if (dato>=3) {
                        
                        cont3++;
                        
                        JOptionPane.showMessageDialog(null, "el estudiante "+" "+i+" "+"Regular\n\n"+"cantidad de estudiantes entre 3 y 4: "+cont3);
                        
                    } else {
                        
                        JOptionPane.showMessageDialog(null, "Entre 3.0 y 4.0 regular");
                    }
                }
                
            }
            
        }

  JOptionPane.showMessageDialog(null, "Notas registradas...");
        mostrarVector(vec);
        
        suma=cont1+cont2+cont3;
        perdidos=cont2;
        promedio=suma/perdidos;
        
           JOptionPane.showMessageDialog(null,"======Resultados======\n\n"+ "los estudiantes sobre 4.0 son : "+cont1+"\n"+"los estudiantes reprobados son: "+cont2+"\n"+"los estudiantes entre 3 y 4 son:  "+cont3+"\n"+
                   "El total de estudiantes es: "+suma+"\n"+"El promedio de reprobados es: "+promedio+"%");
        
    }
    
}

