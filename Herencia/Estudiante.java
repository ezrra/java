public class Estudiante extends Persona {

    private float nota1, nota2, nota3;

    public Estudiante(String nombre, String telefono, float nota1, float nota2, float nota3) {

        super(nombre, telefono);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Sobrescribir método de la superclase
    public void obtenerInformacion() {
        
        super.obtenerInformacion();

        System.out.println("Notas: " + nota1 + "," + nota2 + "," + nota3);
    }
}