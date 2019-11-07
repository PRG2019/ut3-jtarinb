import java.util.Scanner;

public class Temperatura {
	
	public double celsiusToFarenheit(double a) {
		
		double f=a*1.8+32;
		
		return f;
	}
	
	public double farenheitToCelsius(double a) {
		
		double c=(a-32)/1.8;
		
		return c;
	}
	
	public static void main(String[]args) {
	
	Temperatura tmp=new Temperatura();
		
	Scanner teclado=new Scanner(System.in);
		System.out.println("Pulsa 1 para poner celsius o 2 para poner farenheit:");
		int boton=teclado.nextInt();
		System.out.println("Inserte temperatura:");
		double temperatura=teclado.nextDouble();
		
		switch(boton) {
			
		case 1:
			
			temperatura=tmp.celsiusToFarenheit(temperatura);
			System.out.println(temperatura+"F");
			break;
		
		case 2:
			
			temperatura=tmp.farenheitToCelsius(temperatura);
			System.out.println(temperatura+"Cº");
			break;
		
		}

	}

}
