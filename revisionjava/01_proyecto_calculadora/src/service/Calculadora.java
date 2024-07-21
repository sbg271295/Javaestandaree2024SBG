package service;

public class Calculadora {
	
	private int x,y;
	
	public Calculadora(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	public int sumar() {
		
		return x+y;
	}
	
	public int resta() {
		
		return x-y;
	}
	
public int multiplicar() {
		
		return x*y;
	}

public int dividir() {
	
	return x/y;
}

public static int factorial(int a) {
	
	int res=1;
	for(int i=2;i<=a;i++) {
		res=res*i;
	                      }
	return res;
	                       }


}

