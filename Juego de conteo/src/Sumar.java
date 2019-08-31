
import java.util.Random;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Deivis Sanchez
 */
public class Sumar {
    int nivel=1,nivelActual=5;
    int a, segundos=3000;    
    int num=4;
    int[]vect;
    private static JOptionPane option = new JOptionPane("",JOptionPane.INFORMATION_MESSAGE);
    private static JDialog dialogo = null;
      
    public void m(){  
       int j=0,SEG=1;
        while(j!=SEG){ 
            vect =new int[num];
            int i=0;
            while(i<4){         
                Random rnd = new Random(); 
                a=0;
                a = (int) (rnd.nextFloat()* nivelActual+nivel);  
                vect[i]= a ;
                i++;           
            } 
            int sumaA=0;   
            String val="";
            for(int n=0;n<4;n++){           
                val=val+String.valueOf("[" +vect[n] + "]  +  ");
                sumaA=sumaA+vect[n];
            }         
         // showMessageDialog(null,"  CUANTO CREES QUE SUMEN \n "+  val+" = ??");
            visualizaDialogo("  CUANTO CREES QUE SUMEN \n "+  val+" = ??",segundos);
            segundos+=3500;
            int opc=Integer.parseInt(JOptionPane.showInputDialog(null," El total es??: "));          
            if(sumaA==opc){
               nivel=nivelActual; 
               nivelActual+=5;
               vect=null;
               val="";
               visualizaDialogo(" ¡¡¡BIEN!!! Continue el reto ",5000);
               //JOptionPane.showMessageDialog(null," ¡¡¡BIEN!!! Continue el reto ");
               
            }else{
             visualizaDialogo("¡¡¡¡hhho NO!!! LOS SUMA ERA "+ sumaA,5000);
            //JOptionPane.showMessageDialog(null,"¡¡¡¡hhho NO!!! LOS SUMA ERA "+ sumaA);
                vect=null;
               val="";
            }
              SEG=Integer.parseInt(JOptionPane.showInputDialog(null," 1. PARA SEGUIR EN LA PARTIDA \n"+" 0. SALIR \n"));
              if(SEG==0){
                  System.exit(0);
              }
        }     
    }
    
    
    public static void visualizaDialogo(  String texto, final long timeout){
        option.setMessage(texto);
        if ( null == dialogo )
        {
            dialogo = option.createDialog("");
        }
        else
        {
            dialogo.setTitle("");
        }
    
        Thread hilo = new Thread(){
            public void run(){
                try{
                    Thread.sleep(timeout);
                    if ( dialogo.isVisible() ){
                        dialogo.setVisible(false);
                    }
                }
                catch ( InterruptedException e ){
                    e.printStackTrace();
                }
            }
        };
        hilo.start();
        dialogo.setVisible(true);
    }
}
