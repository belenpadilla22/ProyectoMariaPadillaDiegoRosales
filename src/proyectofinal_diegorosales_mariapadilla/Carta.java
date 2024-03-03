package proyectofinal_diegorosales_mariapadilla;


public class Carta {
    private String nombre;
    private int hp;
    private int damage;
    private int speed;
    private int count;
    private boolean targetcard;
    private int elixir;

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isTargetcard() {
        return targetcard;
    }

    public void setTargetcard(boolean targetcard) {
        this.targetcard = targetcard;
    }

    @Override
    public String toString() {
        
        return nombre;
        
    }
    
    
    
    
}
