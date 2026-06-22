

package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class exercicio001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int num ;
		System.out.println("Digite qualquer numero :");
		num = sc.nextInt();
		
		if (num<0) {
		System.out.println("Negativo");
		}
		else {
			System.out.println("Não negativo");
		}
		sc.close();
	}

}
