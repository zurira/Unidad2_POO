public class Inventario {
    private Producto [] stock;

    public Inventario(int tamano) {
        stock = new Producto [tamano];
    }

    public boolean agregarProducto (Producto p){
        for (int i=0; i<stock.length; i++){
            if (stock[i] == null){
                stock[i]=p;
                System.out.println("Producto agregado:" + p.getNombre());
                return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto (String codigo){
        for (int i=0; i<stock.length; i++){
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)){
                System.out.println("Producto eliminado: " +stock[i].getNombre());
                stock[i]=null;
                return true;
            }
        }
        return false;
    }

    public Producto buscar (String codigo){
        for (int i=0; i<stock.length; i++){
            if (stock[i] != null && stock[i].getCodigo().equals(codigo)){
                System.out.println("Producto encontrado: " + stock[i].getNombre());
            } 
        }
        return null;
    }

    public int totalItems(){
        int conteo=0;
        for (int i=0; i<stock.length; i++){
            if (stock[i] != null){
            conteo+= stock[i].getCantidad();
            }
        }
        
        return conteo;
    }


}
