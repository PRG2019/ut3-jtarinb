import java.util.Scanner;

public class MiNumero {

private int x;

	public MiNumero() {
		x=0;
		
	}
	
	public MiNumero(int x) {
		
		this.x=x;
		
	}
	
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
		
	public static void main(String []args) {
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingresa nº:");
		int x=teclado.nextInt();
		
		MiNumero num=new MiNumero(x);
		
		System.out.println("El doble es "+num.doble());
		System.out.println("El triple es "+num.triple());
		System.out.println("El cuadruple es "+num.cuadruple());
		
	}
}
