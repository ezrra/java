class EjemploSincronizacion {

	private int i = 0;

	public synchronized int metodoSincronizado () {

		return i++;
	}

	public int variacionMetodoSincronizado () {

		synchronized (this) {

			return i++;
		}
	}
}