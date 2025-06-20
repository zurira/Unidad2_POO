public class Perro extends Animals {
     public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void ladrar(){
        System.out.println("Hola soy " +getNombre() + "tengo" +getEdad() +"y ladro");
    }

}
