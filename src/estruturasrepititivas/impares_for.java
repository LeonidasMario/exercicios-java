package estruturasrepititivas;
import java.util.Locale;
import java.util.Scanner;
public class impares_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int num,impar;
		 System.out.println("digite o numero");
		 num= sc.nextInt();
		 
		for (int x=1; x<= num; x++) {
			
			
			if (x % 2 !=0) {
				System.out.println(x);
			}
			
		}
	}

}
