import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Animals> inventario;

    public Tienda() {
        this.inventario = new ArrayList<>();
    }

    public boolean venderAnimal(Cliente c, Animals a){
        for (int i=0; i<inventario.size(); i++){
            if (inventario.contains(a)){
                if(!c.getMascotas().contains(a)){
                    inventario.remove(a);
                    c.mascotas.add(a);
                    System.out.println("Se vendio una mascota");
                    return true;
                }else {
                System.out.println("Ya tiene mascota");
            }
            } else {
                System.out.println("Inventario vacío");
            }

        }
        return false;
    }

    public void reabastecer(Animals a){
        inventario.add(a);
    }

}
