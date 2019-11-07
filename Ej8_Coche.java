import java.util.Scanner;

public class Coche {

	private String marca;
	private String modelo;
	
	public Coche() {
		
		marca="ford";
		modelo="focus";
	}
	
	public Coche(String ma,String mo) {
		
		marca =ma;
		modelo=mo;
	}
	
	public void cargar() {
		
		System.out.println(marca+" "+modelo);
	}
	
	public static void main(String[]args) {
		
		Coche c=new Coche();
		c.cargar();
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Escribe marca y modelo");
		String ma=teclado.nextLine();
		String mo=teclado.nextLine();
		
		c=new Coche(ma,mo);
		c.cargar();
	}
}
