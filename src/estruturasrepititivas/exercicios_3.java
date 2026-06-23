package estruturasrepititivas;
import java.util.Locale;
import java.util.Scanner;
public class exercicios_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		int n;
		Double n1,n2,n3,md1 = 0.0 ,md2= 0.0,md3=0.0;
		n=sc.nextInt();
		
		for (int i=0; i< n; i++) {
			
			if  (i == 0) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();
				md1 = ((n1*2)+(n2*3)+(n3+5))/10;
				
			}else if (i ==1) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();
				md2 = ((n1*2)+(n2*3)+(n3+5))/10;
			}else {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				n3 = sc.nextDouble();
				md3 = ((n1*2)+(n2*3)+(n3+5))/10;
			}
			System.out.println(md1);
			System.out.println(md2);
			System.out.println(md3);
			
		}
		sc.close();
	}

}
