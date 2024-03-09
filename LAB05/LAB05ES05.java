package uni.LAB05;
import java.util.Scanner;

public class LAB05ES05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		
		//inserimento n e relativo ce
		System.out.println("Inserisci un intero positivo n");
		int n = tastiera.nextInt();
		if (n<0) {
			System.out.println("Valore non valido");
			System.exit(0);
		}
		
		System.out.print(n);
		//3 casistiche
		if (n==1) {
			//niente, è già 1
		}
		else if (n%2==0) {
			while (n!=1) {
				if (n%2==0) {
					n=n/2;
					System.out.print(", "+n);
				}
				else {
					n=3*n+1;
					System.out.print(", "+n);
				}
				
			}
		}
		else {
			while (n!=1) {
				if (n%2==0) {
					n=n/2;
					System.out.print(", "+n);
				}
				else {
					n=3*n+1;
					System.out.print(", "+n);
				}
			}
			
			
		}
		
		
		
		System.out.println(".");
		
		
		
		
	}

}
