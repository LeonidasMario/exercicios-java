package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		  int num1, num2,resto;
		  
		  System.out.println("digite o primeiro número: ");
		  num1= sc.nextInt();
		  System.out.println("digite o segundo número: ");
		  num2 = sc.nextInt();
		  
		  
		  if((num1 %num2==0 ) || (num2% num1==0)) {
			  System.out.println("São Multiplos ");
		  }
		  else {
			  System.out.println("Não são Multiplos ");
		  }
		  
		  sc.close();
		  
	}

}
