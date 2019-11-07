import java.util.Scanner;

public class Numero {

private int numero;
	
	public Numero() {
		numero=0;
	}
	
	public Numero(int n) {
		
		numero=n;
	}
	
	public int aniade(int n) {
		numero=numero+n;
		return numero;
	}
	
	public int resta(int n) {
		numero=numero-n;
		return numero;
	}
	
	public int getValor() {
		return numero;
	}
	
	public int getDoble() {
		return numero*2;
	}
	
	public int getTriple() {
		return numero*3;
	}
	
	public void setNumero(int n) {
		numero=n;
		
	}
	
	public static void main(String[]args) {
		
		Numero n1 = new Numero();
		
		System.out.println("Valor actual: " + n1.getValor());
		
		System.out.println("Ingresa valor: ");
		Scanner teclado=new Scanner(System.in);
		int x=teclado.nextInt();
		
		n1.aniade(x);
		System.out.println("Suma: " +n1.getValor());
		
		n1.resta(x);
		System.out.println("Resta: " +n1.getValor());
		
		System.out.println("Ingresa otro valor: ");
		int z=teclado.nextInt();
		
		Numero n2 = new Numero(z);		
		
		System.out.println("Doble: " +n2.getDoble());
		System.out.println("Triple: " +n2.getTriple());
		
		
		System.out.println("Ingresa otro valor: ");
		int o=teclado.nextInt();
		
		Numero n3 = new Numero();
						
		n3.setNumero(o);
		
		System.out.println("Nuevo valor actual: " +n3.getValor());		
		
	}
}
