import java.util.Scanner;

public class Finanzas {
	
	private float cambio;
	
	public Finanzas() {
		
		cambio=1.36F;
	}
	
	public Finanzas(float c) {
		
		cambio=c;
	}
	
	public float dolaresToEuros(float d) {
		
		return d/cambio;
	}
	
	public float eurosToDolares(float e) {
		
		return e*cambio;
	}
	
	public static void main(String[]args) {
		
		Scanner teclado=new Scanner(System.in);
		
		float valor;
		int boton;
		Finanzas f=new Finanzas();
		
		do {
			
			System.out.println("1 para dolares a euros");
			System.out.println("2 para euros a dolares");
			System.out.println("0 para cerrar");
			System.out.println("elige una opcion");
			boton=teclado.nextInt();
		
			switch(boton) {
		
			case 1: System.out.println("inserta valor:");
				valor=teclado.nextFloat();
				System.out.println(f.dolaresToEuros(valor)+" euros");
				break;
		
			case 2: System.out.println("inserta valor:");
				valor=teclado.nextFloat();
				System.out.println(f.eurosToDolares(valor)+" dolaress");
				break;
		
			}
		}
		
		while(boton!=0);
		
		System.out.println("fin del programa");
		
	}

}
