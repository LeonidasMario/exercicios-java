package poo_logica;

import java.util.Locale;
import java.util.Scanner;

public class Poo_exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo w = new retangulo();
		
		
		System.out.println("Digite a Altura :");
		w.width= sc.nextDouble();
		System.out.println("Digite a Largura :");
		w.height = sc.nextDouble();
		double area =  w.area();
		double peri = w.perimeter();
		double dia = w.diagonal();
	    System.out.printf("AREA : %.2f\n", area);
	    System.out.printf("Perimeter : %.2f\n", peri);
	    System.out.printf("Diagonal : %.2f\n", dia);
	}

}
