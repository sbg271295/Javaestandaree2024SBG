package geometria;

public class Test {

	public static void main(String[] args) {
		//crear un triangulo y un circulo con datos cualquiera
		//y despues muestra el color y superficie de cada uno
		Triangulo tr= new Triangulo("verde",2,7);
		Circulo cr=new Circulo("azul",6);
		
		System.out.println("Color" + tr.getColor());
		System.out.println("Super" + tr.superficie());
		System.out.println("Color" + cr.getColor());
		System.out.println("Super" + cr.superficie());
		mostrarDatos(tr);
		mostrarDatos(cr);
	                                       }
	
	static void mostrarDatos(Figura f) {
		System.out.println("Color: " + f.getColor());
		System.out.println("Color: " + f.superficie());
		
	}
                  }
