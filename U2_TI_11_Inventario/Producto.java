public class Producto {
    
    private String codigo;
    private String nombre;
    private int cantidad;

    
    public Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo != null){
            System.out.println("El código no puede estar vacío");
        }
        this.codigo=codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    



}
