public class Main {

	public static void main(String args[]) {

		Persona persona = new Persona("Carlos", "123456");
		persona.obtenerInformacion();

		persona = new Estudiante("Juan", "12345", 3.4, 5.5, 6.8);
		persona.obtenerInformacion();

	}
}