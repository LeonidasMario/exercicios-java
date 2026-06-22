package exercicio;
import java.util.Locale;
import java.util.Scanner;
public class quadrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
			Double x,y,q1,q2,q3,q4;
			
			System.out.println("Digite o valor de x : ");
			x = sc.nextDouble();
			System.out.println("Digite o valor de y : ");
			y = sc.nextDouble();
			
			
			if(x  >0 && y >0) {
				System.out.println("Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("Q2");
			}
			else if(x < 0 && y < 0) {
				System.out.println("Q3");
				
			}else if(x > 0 && y < 0) {
				System.out.println("Q4");
			}
			else{
				System.out.println("Origem");
			}
			}

}
