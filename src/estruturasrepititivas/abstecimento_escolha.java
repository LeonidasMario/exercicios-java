package estruturasrepititivas;
import java.util.Locale;
import java.util.Scanner;
public class abstecimento_escolha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int quant1 = 0,quant2= 0,quant3=0,num1;
		 
		System.out.println("Digite qual quer abastecer: ");
		num1 = sc.nextInt();
		
		while(num1 != 4) {
			
			switch (num1) {
			
			case 1 :
		     	quant1 += 1;
		     	break;
		     	
			case 2:
				quant2 +=1;
				break;
				
			case 3:
				quant3 +=1 ;
				break;
				
		    
			}
			System.out.println("Digite qual quer abastecer :");
		    num1= sc.nextInt();
		}
		System.out.println("Muito Obrigado");
		System.out.println("Alcool: " + quant1);
		System.out.println("Gasolina : "+ quant2);
		System.out.println("Diesel : " +quant3);
		sc.close();
	}

}
