import java.util.Scanner;

public class Temperatura {
	
	private double temperatura;
	private int boton;
	
	public void cargar() {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Pulsa 1 para poner celsius o 2 para poner farenheit:");
		boton=teclado.nextInt();
		System.out.println("Inserte temperatura:");
		temperatura=teclado.nextDouble();
		
		switch(boton) {
			
		case 1:
			
			temperatura=celsiusToFarenheit(temperatura);
			System.out.println(temperatura+"F");
			break;
		
		
		case 2:
			
			temperatura=farenheitToCelsius(temperatura);
			System.out.println(temperatura+"Cº");
			break;
		
		}
	}
	
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
	tmp.cargar();

	}

}
