import java.util.Scanner;

public class Millas {

    public double millasAMetros (double x) {
        
        return x*1852;
    }

    public double millasAKilometros (double x) {
        
        return x*1852/1000;
    }
  
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor en millas");
        
        double x=teclado.nextDouble();
        
        Millas m=new Millas();

        System.out.println(m.millasAMetros(x)+" m");
        System.out.println(m.millasAKilometros(x)+" km");
    }
		
}




