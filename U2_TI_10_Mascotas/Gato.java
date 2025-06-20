public class Gato extends Animals {


    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public void maullar(){
        System.out.println("Hola soy " +getNombre() + "tengo" +getEdad() +"y maullo");
    }

}
