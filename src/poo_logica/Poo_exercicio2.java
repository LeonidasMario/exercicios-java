package poo_logica;

import java.util.Locale;
import java.util.Scanner;

public class Poo_exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		exercicio2_classe r  = new exercicio2_classe();
		
		System.out.println("Digite um nome : ");
		r.name = sc.nextLine();
		System.out.println("Digite salário bruto : ");
		r.grossSalary= sc.nextDouble();
		System.out.println("Digite uma taxa : ");
		r.tax =sc.nextDouble();
		
		System.out.println();
		System.out.println(r.name + ", $ " +r.NetSalary());
		
		System.out.println( "Digite a percentagem : ");
		double percentage = sc.nextDouble();
		r.increaseSalary(percentage);
		
		System.out.println();
		System.out.println(r);
	}

}
