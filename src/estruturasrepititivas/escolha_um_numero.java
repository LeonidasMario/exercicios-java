package estruturasrepititivas;

import java.util.Locale;
import java.util.Scanner;

public class escolha_um_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int numero;
		numero = sc.nextInt();

		while ( numero != 2002) {
			
			System.out.println("senha invalida");
			numero = sc.nextInt();
			}
		
		System.out.println("Acesso permitido");
	}

}
