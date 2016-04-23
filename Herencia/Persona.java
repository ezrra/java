public class Persona {

    String nombre;
    String telefono;

    public Persona(String nombre, String telefono) {
        this.nombre     = nombre;
        this.telefono   = telefono;
    }

    public void obtenerInformacion() {
        System.out.println("Nombre: "   + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}