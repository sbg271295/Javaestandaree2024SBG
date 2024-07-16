package geometria;

public class Circulo extends Figura{

	private int radio;

	public Circulo(String color,int radio) {
		super(color);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double superficie() {
		return Math.PI*radio;
	}

}
