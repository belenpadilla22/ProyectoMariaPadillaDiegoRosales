
package proyectofinal_diegorosales_mariapadilla;
import java.io.*;
import javax.sound.sampled.*;

public class Sound extends Thread { //1.clase
    private Clip clip;
    private String inputFile;
    
    public Sound (String path  ){
        this.inputFile=path;
    
    }
    
    @Override // sobreescribir
    public void run (){
        try{
          File archivo=new File (inputFile);  
          AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(archivo);
          clip=AudioSystem.getClip();
          clip.open(audioInputStream);
          clip.start();
          
          while (!clip.isRunning()){
              Thread.sleep(10);
           
          }
          while (clip.isRunning()){
              Thread.sleep(10);
          
          }
          clip.stop();
          audioInputStream.close();
        
        
        }catch (Exception e){
            e.printStackTrace();
        
        
        }
        return;
        
        
    }
    
    
}
