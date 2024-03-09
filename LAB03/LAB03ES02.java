package uni.LAB03;

import java.util.Scanner;

public class LAB03ES02 {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci una frase (inizia e concludi senza spazi, "
				+ "e spazia le parole di 1 spazio tra loro)");
		String frase = tastiera.next();
		
		String empty = " ";
		int conteggio = 0;
		for (int i = 0 ; i<frase.length() ; i++) {
			if (frase.charAt(i)==empty.charAt(0))
				conteggio++;
				
			}
		
		/*presupposto che la frase non inizi e non finisca con 
		degli spazi, e che ogni parola sia separata dalla successiva 
		usando un solo spazio*/
		if (conteggio>=1) {
			
			System.out.println("La frase contiene 2 o più parole");
		
			String primaParola = frase.substring(0, frase.indexOf(empty));
			System.out.println(primaParola);
			System.out.println("lunghezza = "+(primaParola.length() -1) );
			
			String ultimaParola = frase.substring(frase.lastIndexOf(empty));
			System.out.println(ultimaParola);
			System.out.println("lunghezza = "+ultimaParola.length());
			
		}
		
		if (conteggio==0) {
			System.out.println("La frase contiene 1 parola");
			
			String primaParola = frase.substring(0, frase.indexOf(empty));
			System.out.println(primaParola);
			System.out.println("lunghezza = "+(primaParola.length() -1) );
			
			String ultimaParola = frase.substring(frase.lastIndexOf(empty));
			System.out.println(ultimaParola);
			System.out.println("lunghezza = "+ultimaParola.length());
		}
	}

}
