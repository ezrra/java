public interface Mamifero {

	void amamantar();
}

public interface Carnivora {

	void desgarrar();
}

public class Leon implements Mamifero, Carnivora {

	// Otras acciones dignas de un leon

	public void amamantar() {

		// Acciones y condiciones
	}

	@Override
	public void desgarrar() {

		// Acciones y condiciones
	}
}