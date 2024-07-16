import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class GuardarLista {

	public static void main(String[] args) {
		
	 List<Integer> numeros=List.of(4,11,8,2);
	 //guardar cada número en una línea de un fichero
	 PrintStream out;
	try {
		out = new PrintStream("numeros.txt");
		 for(Integer n:numeros) {
			 out.println(n);
		 }
	} catch (IOException ex) {
		System.out.println("Ha dado error");
	}
	
	}

}
