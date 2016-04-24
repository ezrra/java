public class PruebaHilos {

	public static void main(String[] args) {
		
		new Thread (
			new Runnable () {

				public void run () {

					System.out.println("Este método se ejecutó en un hilo");
				}
			}

		).start();
	}
}