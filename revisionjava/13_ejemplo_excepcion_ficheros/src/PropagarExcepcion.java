import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PropagarExcepcion {

	public static void main(String[] args) {
		
		try {
			System.out.println("La suma es: " + calcularSuma());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//metodo que devuelve la suma de los numeros
	//guardados ne el fichero numeros.txt
	static int calcularSuma() throws IOException {
		return Files.lines(Path.of("numeros.txt"))
		       .mapToInt(x->Integer.parseInt(x))
		       .sum();
	}

}
