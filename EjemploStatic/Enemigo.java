public class Enemigo {

	private int vida;
    private int mana;
    private int ataque;

    private static int numeroDeEnemigos = 0;

    public Enemigo(int vida, int mana, int ataque) {

        this.vida 	= vida;
        this.mana 	= mana;
        this.ataque = ataque;

        // Incrementar la cantidad de enemigos
        numeroDeEnemigos++;
    }

    // o crear el metodo static

    public static int obtenerNumEnemigos ()
    {
    	return numeroDeEnemigos;
    	
	} // Enemigo.obtenerNumEnemigos();


}

// Enemigo.numeroDeEnemigos
