
public class EjemploPolimorfismo {

	public static void main(String[] args) {
		

	}
	//Hacer un metodo que devuelva el cuadrado del número recibido como parametro;
	//el número podra ser de cualquier tipo; El resultado se entregara como int
	public static int Dame_numero(Number numero) {		
		return numero.intValue()* numero.intValue();
	}
	
	//hacer un metodo que devuelva, aleatoriamente,
	//un double, un integer, o un Long en 1 y 500
	
	public static Number Dame_Aleatorio() {
		Double r=Math.random()*500+1;
		int n=(int) (Math.random()*3+1);
		return switch(n) {
		        case 1-> Double.valueOf(r) ;
		        case 2->(int)n;
		        default -> (long)n;
		};
	}

}
