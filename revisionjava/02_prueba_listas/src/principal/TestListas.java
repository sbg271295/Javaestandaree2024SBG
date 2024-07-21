package principal;

import java.util.ArrayList;

public class TestListas {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<>();
		lista.add(300);
		lista.add(150);
		lista.add(1, 200);
		System.out.println("Total de elementos: "+lista.size());
		for(Integer n:lista) {
			System.out.println(n);
		}
	}

}
