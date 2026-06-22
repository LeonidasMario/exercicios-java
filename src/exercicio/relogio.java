package exercicio;
import java.util.Scanner;
import java.util.Locale;
public class relogio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
	int hincial,hofinal,dura;
	System.out.print("DIgite a hora que você começou a Jogar :");
	  hincial = sc.nextInt();
	  System.out.print("DIgite a hora que você terminour de Jogar :");
	  hofinal = sc.nextInt();
	  
	if (hincial >=hofinal) {
		dura= (24-hincial)+hofinal;
		System.out.print("O JOGO DUROU " + dura+ " HORAS(S)");
	}
	else {
		dura = hofinal -hincial;
		System.out.print("O JOGO DUROU " + dura+ " HORAS(S)");
	}
		
	}

}
