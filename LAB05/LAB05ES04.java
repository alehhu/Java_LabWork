package uni.LAB05;
import java.util.Scanner;

public class LAB05ES04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		
		//Inserimento valori e relativo ce
		System.out.println("Inserisci un intero positivo");
		int n = tastiera.nextInt();
		if (n<=0) {
			System.out.println("Valore non valido");
			System.exit(0);
		}
		System.out.println("Inserisci un altro intero positivo");
		int m = tastiera.nextInt();
		if (m<=0) {
			System.out.println("Valore non valido");
			System.exit(0);
		}
		
		
		int somma = n+m;
		
		while ((n)<somma) {
			n++;
		}
		
		System.out.println("La somma è: " + n);
		
		
	}

}
