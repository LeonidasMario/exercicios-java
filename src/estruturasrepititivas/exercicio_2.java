package estruturasrepititivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num, quant1 = 0, quant2 = 0,N;
		System.out.println("digite o numero");
		num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			N = sc.nextInt();
			if (N >= 10 && N <= 20) {
				quant1 += 1;
			}else {
				quant2 += 1;
			}
			
		}
		System.out.println(quant1 +" in");
		System.out.println(quant2 +" out");
		sc.close();
	}

}
