
package proyectofinal_diegorosales_mariapadilla;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class AdministradorUsuarios {
    private ArrayList<User>usuarios=new ArrayList();
    private File archivo=null;

    public AdministradorUsuarios(String Path) {
        archivo=new File(Path);
    }

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<User> usuarios) {
        this.usuarios = usuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministradorUsuarios{" + "usuarios=" + usuarios + ", archivo=" + archivo + '}';
    }
    
     public void CargarArchivo (){
         try {
             usuarios=new ArrayList();
             User temp;// limpiar memoria RAM
             if (archivo.exists()){// si existe 
                 FileInputStream entrada=new FileInputStream(archivo);
                 ObjectInputStream objeto=new ObjectInputStream(entrada);
                 try {
                     while ((temp=(User)objeto.readObject())!=null){// leer de objeto a objeto
                          usuarios.add(temp);
                     }
                 } catch (EOFException e) {
                     //es una excepción que se lanza cuando se intenta 
                     //leer más allá del final de un archivo o secuencia de entrada
                  
                 }
                 objeto.close();
                 entrada.close();
             
             }
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     
     
     }
     public void EscribirArchivo (){
         FileOutputStream fw=null;
         ObjectOutputStream bw=null;
         try {
             fw=new FileOutputStream(archivo);
             bw=new ObjectOutputStream(fw);
             for (User t : usuarios) {
                 bw.writeObject(t);
             }
             bw.flush();
             
         } catch (Exception e) {
         }finally {
             try {
                 bw.close();
                 fw.close();
             } catch (Exception e) {
             }
         
         }
     
     
     }
    
    
}
