import java.util.Scanner;

public class MiNumero {

private int x;
	
	public int doble() {
		
		int a=x*2;
		return a;
	}
	
	public int triple() {
	
		int b=x*3;
		return b;
	}
	
	public int cuadruple() {
		
		int c=4*x;
		return c;
	}
	
	public void cargar() {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa nº:");
		x=teclado.nextInt();
				
	}
	public static void main(String []args) {
		
		MiNumero num=new MiNumero();
		
		num.cargar();
		
		System.out.println("El doble es "+num.doble());
		System.out.println("El triple es "+num.triple());
		System.out.println("El cuadruple es "+num.cuadruple());
		
	}
}
