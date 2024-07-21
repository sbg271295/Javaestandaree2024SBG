import java.util.ArrayList;
import java.util.List;

public class EjemploLambdas {


	public static void main(String[] args) {
		List<Integer> lista=new ArrayList<>();
		lista.add(-2);lista.add(11);lista.add(5);
		lista.add(-4);lista.add(3);
		//eliminar los negativos
		lista.removeIf(n->n<0);
		for(int i=0;i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
	}

}