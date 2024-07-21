package view;

import java.util.Scanner;
import service.TemperaturaService;

public class principal {
	private static TemperaturaService service=new TemperaturaService();
    private static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				guardar();
				break;
			case 2:
				maxima();
				break;
			case 3:
				minima();
				break;
			case 4:
				media();
				break;
			case 5:
				System.out.println("Adios!");
				break;
			               }
		   }while(opcion!=5);

	}
	
	
  public static void guardar() {
	  

		System.out.println("Introduce número: ");
		double a=sc.nextDouble();
		service.guardar(a);
		System.out.println("Agregado");
	}

  public static void maxima() {
	 System.out.println("El maximo es: "+ service.getMaxima());
	}

  public static void minima() {
	 System.out.println("El minimo es: "+ service.getMinima());
	}

  public static void media() {
		 System.out.println("La media es: "+ service.getMedia());
	}

  public static void menu() {
	  
	  System.out.println("Guardar");
	  System.out.println("Maxima");
	  System.out.println("Minima");
	  System.out.println("Media");
	  System.out.println("Salir");
		
		
	}

}
