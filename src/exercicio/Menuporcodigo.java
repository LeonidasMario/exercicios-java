package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class Menuporcodigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc  = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double cod, quant,total;
		System.out.println("Digite o código do produto");
		cod = sc.nextDouble();
		System.out.println("Digite o código do produto");
		quant= sc.nextDouble();
		
		if(cod ==1) {
			total = quant*4.0;
			System.out.printf("Total Rs: %.2f%n ",total );
		}else if(cod ==2) {
			total=quant*4.50;
			System.out.printf("Total Rs: %.2f%n ",total);
		}else if(cod ==3) {
			total=quant*5.00;
			System.out.printf("Total Rs: %.2f%n ", total);
		}else if(cod ==4) {
			total=quant*2.00;
			System.out.printf("Total Rs: %.2f%n ",total);
		}else{
			total=quant*1.50;
			System.out.printf("Total Rs: %.2f%n ",total);
		}
	}

}
