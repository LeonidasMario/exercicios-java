package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		 
		int c1,n1,c2,n2;
		double vt,v1,v2;
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1= sc.nextDouble();
		
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2= sc.nextDouble();
		
		vt = (n1*v1 + n2*v2);
		
		
		System.out.println("---------SAÍDA-------");
		System.out.printf("VALOR A PAGAR : R$ %.2f", vt);
		
		sc.close();
	}

}
