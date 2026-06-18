package exercicio;

import java.util.Locale;

public class somaDeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		double r,pi,area;
		r = 2.00;
		pi = 3.14159;
		
		area= pi*Math.pow(r, 2);
		Locale.setDefault(Locale.US);
		System.out.printf("A = %.4f", area);
	}

}
