public class Main {
    public static void main (String [] args){

        Tienda tienda = new Tienda();

        Cliente cliente1 = new Cliente("Zuri");

        Animals gato1 = new Gato("Michi", 4);
        Animals perro1 = new Perro("Firulais", 3);

        tienda.reabastecer(gato1);
        tienda.reabastecer(perro1);

        tienda.venderAnimal(cliente1, perro1);
        tienda.venderAnimal(cliente1, gato1);
        tienda.venderAnimal(cliente1, gato1);
    }
}
