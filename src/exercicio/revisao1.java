package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class revisao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		System.out.println("DIgite o primeiro numero inteiro :");
		A = sc.nextInt();
		System.out.println("DIgite o segundo numero inteiro :");
		B = sc.nextInt();
	
		
		if (A % B ==0 ||  B % A ==0 ){
			System.out.println("Sao multiplos");
			
		}
		else {
			System.out.println("Não são multiplos");
		}
		sc.close();
			
	
	
	}

}
