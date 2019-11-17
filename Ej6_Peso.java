import java.util.Scanner;

public class Peso {

	private double peso;
	private double pesokg;
	private String medida;
		
	public Peso(double peso, String medida) {
			 
		this.peso = peso;
		this.medida = medida;
		switch(medida) {
		case "Lb": 
			pesokg = 0.453 * peso;
		break;
		case "Li":
			pesokg = 14.59 * peso;
		break;
		case "Oz":
			pesokg = 0.02835 * peso;
		break;
		case "P":
			pesokg = 0.00155 * peso;
		break;
		case "K":
			pesokg = peso;
		break;
		case "G":
			pesokg = 0.001 * peso;
		break;
		case "Q":
			pesokg = 43.3 * peso;
		break;
			
		}
	}
	   public double getLb() {

		double Lb = 0.453;
		return Lb/pesokg;
				
	}

	public double getLi() {

		double Li = 14.59;
		return Li/pesokg;
				
	}
			
	public double getOz() {

		double Oz = 0.022835;
		return Oz/pesokg;
			
	}
			
	public double getP() {

		double P = 0.00155;
		return P/pesokg;
			
	}
			
	public double getK() {

		double K = peso;
		return K/pesokg;
			
	}
			
	public double getG() {

		double G = 0.001;
		return G/pesokg;
			
	}
			
	public double getQ() {

		double Oz = 43.3;
		return Oz/pesokg;
			
	}
			
	public static void main(String[] args) {

		Peso p1 = new Peso(790, "Q");

		System.out.println(p1.getLb());
			
	}

}