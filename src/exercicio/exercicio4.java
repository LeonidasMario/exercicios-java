package exercicio;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c,at,ac,atr,aq,ar,pi;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		pi = 3.14159;
		
		at = (a*c)/2;
		ac = pi * Math.pow(c, 2);
		atr=  ((a+b)*c)/2;
		aq = Math.pow(b, 2);
		ar = a*b;
		
		System.out.println("-------Saída--------");
		System.out.printf("TRANGULO : %.3f%n" ,at);
		System.out.printf("CIRCULO : %.3f%n"  ,ac);
		System.out.printf("TRAPEZIO :%.3f%n", atr);
		System.out.printf("QUADRADO :%.3f%n", aq);
		System.out.printf("RETANGULO :%.3f%n", ar);
		
		
		sc.close();
		
	}

}
