
package proyectofinal_diegorosales_mariapadilla;

import java.io.Serializable;

public class User implements Serializable{// segunda clase
    private String usuario,password;
    private int cofres,cartas;
    private static final long SerialVersionUID=777L;
    
    // constructores
    public User(String usuario) {
        this.usuario = usuario;
        
    }

    public User(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public User(String usuario, String password, int cofres, int cartas) {
        this.usuario = usuario;
        this.password = password;
        this.cofres = cofres;
        this.cartas = cartas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCofres() {
        return cofres;
    }

    public void setCofres(int cofres) {// validacion de cofres, el usuario tiene maximo 4
        if (cofres<=4){
            this.cofres = cofres;
        }
        
    }

    public int getCartas() {
        return cartas;
    }

    public void setCartas(int cartas) {// el usuario inicia con 5 
        if (cartas==5){
           this.cartas = cartas;
        }
       
    }

    @Override
    public String toString() {
        return "User{" + "usuario=" + usuario + ", password=" + password + ", cofres=" + cofres + ", cartas=" + cartas + '}';
    }
    
    
    
    
}
