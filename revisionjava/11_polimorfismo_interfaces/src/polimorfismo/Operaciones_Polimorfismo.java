package polimorfismo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Operaciones_Polimorfismo {

	public static void main(String[] args) {
		ArrayList<Integer> nums1=new ArrayList<>();
		nums1.add(20);
		nums1.add(4);
		nums1.add(12);
		System.out.println(Sum(nums1));
		System.out.println(list(nums1));

	}
//Metodo que devuelva la suma de todos los numeros de la lista de enteros
//recibida como parametros;
	public static int Sum(List<Integer> lista) {
		int num=0;
		for(Integer n:lista) {
			
			num+=n;
			
		}
		return num;
	}
//realizar un metodo que reciba una collecion de Integer
//y devuelva una lista con todos los numeros positivos de la colleción
	
	public static List<Integer> list(Collection<Integer> collect) {
		List<Integer> numeros=new ArrayList<Integer>();
		for(Integer n:collect) {
			if(n>=0) {
				numeros.add(n);
			}
		}
		return numeros;
	}
}
