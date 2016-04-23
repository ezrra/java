abstract public class Objeto3D {

	List<Vertice> vertice;
	List<Indices> indices;
	
	Textura textura;

	void crearGeometria () {


	}

	void texturizar () {


	}

	// Metodos abstractos

	abstract void renderizar ();

}

public class Cubo extends Objeto3D {

	void renderizar () {

		// Implementacion personalizada
	}

	
}