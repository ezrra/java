import java.util.ArrayList;
import java.util.List;

public class PruebaArrayList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();

		lista.add("Draven");
		lista.add("Sion");
		lista.add("Teemo");
		lista.add("Yasou");
		lista.add("Jax");

		for (String elemento : lista ) {
			
			System.out.println(elemento);
		}
	}
}