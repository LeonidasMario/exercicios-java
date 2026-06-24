package estruturasrepititivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N;
		double a, b,div;
		N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			if( b==0) {
				System.out.println("DIVISÃO IMPOSSIVEL");
			}else {
				div= a/b;
				System.out.printf("%.1f\n",div);
			}
			
		}
	}

}
