public class PruebaExcepciones {

	int valor;

	public static void main(String args[]) {

		for (int i = 1; i < 9 ; i++) {

			PruebaExcepciones ejemplo = new PruebaExcepciones();

			if (i != 7) {
				
				try	{

					ejemplo.asignarValor(i);
				
				} catch (Exception e) {

					e.printStackTrace();
				}

			} else {

				try	{

					ejemplo.asignarValor(i * -1);

				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
	}

	public void asignarValor(int numero) throws Exception {

		if (numero > 0) {
			
			valor = numero;
		
		} else {

			throw new Exception("No es posible asignar el número negativo" + numero);
		}
	}
}