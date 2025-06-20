public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);
          Producto pro1 = new Producto("s001", "jabon", 1);
          Producto pro2 = new Producto("s002", "shampoo", 3);
          Producto pro3 = new Producto("s003", "crema", 2);
          Producto pro4 = new Producto("s004", "perfume", 1);

         inventario.agregarProducto(pro1);
         inventario.agregarProducto(pro2);
         inventario.agregarProducto(pro3);
         inventario.agregarProducto(pro4);

         inventario.buscar("s001");
         inventario.buscar("s005");

         inventario.eliminarProducto("s002");

         inventario.agregarProducto(pro4);

         System.out.println("Total de productos: " + inventario.totalItems());


        
    
}
}