package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class condicional1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		
		int num1,num2;
		
		Double rest;
		System.out.println("Digite os numeros em ordem crescente ou decrescente");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		rest = (double)num1 % (double)num2;
		
		if(rest ==0) {
			System.out.println("Sao Multiplos");
		}
		else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
