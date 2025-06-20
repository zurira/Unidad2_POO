import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    List<Animals> mascotas;

    
    public Cliente(String nombre) {
        this.nombre = nombre;
        this.mascotas = new  ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Animals> getMascotas() {
        return mascotas;
    }
    public void setMascotas(List<Animals> mascotas) {
        this.mascotas = mascotas;
    }
}
