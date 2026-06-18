package exercicio;
import java.util.Locale;
import java.util.Scanner;
public class problemaexem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double min, custo ,soma;
		
		 custo = 50.00;
		 System.out.print("DIgite quantos minutos quer falar: ");
		 min = sc.nextDouble();
		 
		 if (min < 100) {
			 System.out.printf("Valor a pagar : R$ %.2f%n" ,custo);
		 }
		 else {
			 soma = (min-100)* 2;
			 custo +=soma;
			 System.out.printf("Valor a pagar : R$ %.2f%n", custo);
		 }
		
	}

}
