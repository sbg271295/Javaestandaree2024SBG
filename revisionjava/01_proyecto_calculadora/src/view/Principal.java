package view;

import java.util.Scanner;

import service.Calculadora;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int opcion;
		do {
			menu();
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				sumar();
				break;
			case 2:
				restar();
				break;
			case 3:
				multiplicar();
				break;
			case 4:
				dividir();
				break;
			case 5:
				factorial();
				break;
			case 6:
				System.out.println("Adios,");
				break;
			               }
		   }while(opcion!=6);

	}
	
	static Calculadora getCalculadora() {
		 Scanner sc= new Scanner(System.in);
			System.out.println("Introduce número: ");
			int a=sc.nextInt();
			System.out.println("Introduce otro número: ");
			int b=sc.nextInt();
			Calculadora cal=new Calculadora(a,b);
			return cal;
			
		}

  public static void factorial() {
	  
	    Scanner sc= new Scanner(System.in);
		System.out.println("Introduce número: ");
		int a=sc.nextInt();
		System.out.println("El factorial es: "+ Calculadora.factorial(a));
		
	}

  public static void dividir() {
		Calculadora cal=getCalculadora();
		System.out.println("La division es: "+ cal.dividir());
		
	}

  public static void multiplicar() {
		Calculadora cal=getCalculadora();
		System.out.println("La multiplicacion es: "+ cal.multiplicar());
	}

  public static void restar() {
		Calculadora cal=getCalculadora();
		System.out.println("La resta es: "+ cal.resta());
		
	}

  public static void sumar() {
		Calculadora cal=getCalculadora();
		System.out.println("La suma es: "+ cal.sumar());
	}

  public static void menu() {
	  
	  System.out.println("Sumar");
	  System.out.println("Restar");
	  System.out.println("Multiplicar");
	  System.out.println("Dividir ");
	  System.out.println("Factorial");
		
		
	}

}
