package uni.LAB05;
import java.util.Scanner;

public class LAB05ES06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tastiera = new Scanner(System.in);
		int posizione, posizioniTrovate;
		boolean stringheCombaciano;
		boolean stringaValida;
		posizioniTrovate = 0;



		 //Inserimento e verifica
		 char verifica = 'a';
		 String genoma = tastiera.next();
		 for (int index = 0; index < genoma.length(); index++) {
			verifica = genoma.charAt(index);
			if (verifica != 'A' & verifica != 'C' & verifica != 'G' & verifica != 'T') {
				System.out.println("ERRORE CARATTERI NON VALIDI");
				System.exit(0);
			}
		 }

		 String proteina = tastiera.next();
		 for (int index = 0; index < proteina.length(); index++) {
			verifica = proteina.charAt(index);
			if (verifica != 'A' & verifica != 'C' & verifica != 'G' & verifica != 'T') {
				System.out.println("ERRORE CARATTERI NON VALIDI");
				System.exit(0);
			}
		 }

		 System.out.print("La proteina " + proteina + " compare nel genoma " + genoma+ " nelle seguenti posizioni:");
		 if (proteina.length()>genoma.length()) {
			 	System.out.print(" nessuna");
		 }
		 else {

			 for (posizione=0; posizione<genoma.length()-proteina.length(); posizione++) {
				 stringheCombaciano = true;
				 for (int i = 0; i<proteina.length() && stringheCombaciano; i++) {
				 	if (proteina.charAt(i)!=genoma.charAt(posizione+i)) {
				 		stringheCombaciano = false;
				 	}
				 }
				 if (stringheCombaciano) {
					 if (posizioniTrovate==0) {
						 System.out.print(posizione);
					 }
					 else
					 System.out.print(", " + posizione);
					 posizioniTrovate++;
				 }
			}
		 }
		 if (posizioniTrovate==0) {
		 	System.out.print(" nessuna");
		 }

	}

}
