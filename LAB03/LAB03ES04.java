package uni.LAB03;

import java.util.Scanner;

public class LAB03ES04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tastiera = new Scanner(System.in);

	//Comando do e while per rifare nuova partita con altri giocatori
		String yesOrNoNewPlayers;
		do {
	//Inserimento nomi giocatori
			System.out.println("Inserisci il nome del primo giocatore");
			String giocatore1 = tastiera.next();
			System.out.println("Inserisci il nome del secondo giocatore");
			String giocatore2 = tastiera.next();


		//Comando do e while per continuare a giocare con gli stessi giocatori
			String yesOrNoSamePlayers;
			do {

		//Inserimento di giocate
				System.out.println(giocatore1+", inserisci una parola tra forbice, carta, sasso");
				String giocataPL1Mixed = tastiera.next();
				String giocataPL1 = giocataPL1Mixed.toLowerCase();

				System.out.println(giocatore2+", inserisci una parola tra forbice, carta, sasso");
				String giocataPL2Mixed = tastiera.next();
				String giocataPL2 = giocataPL2Mixed.toLowerCase();

				if (!(giocataPL1.equals("forbice")||giocataPL1.equals("carta")||giocataPL1.equals("sasso")))
				{System.out.println(giocatore1+" ha inserito un comando erroneo");
				}
				if (!(giocataPL2.equals("forbice")||giocataPL2.equals("carta")||giocataPL2.equals("sasso")))
					{System.out.println(giocatore2+" ha inserito un comando erroneo");
					}



				if (giocataPL1.equals("forbice")) {
						if (giocataPL2.equals("forbice")) {
						System.out.println("La giocata è pari");
						}
						else if (giocataPL2.equals("carta")) {
							System.out.println("Vince "+giocatore1);
						}
						else if (giocataPL2.equals("sasso")){
							System.out.println("Vince "+giocatore2);
						}
						else
							System.out.println(giocatore2+" ha inserito un comando erroneo");

					}

				else if (giocataPL1.equals("carta")) {
						if (giocataPL2.equals("carta")) {
						System.out.println("La giocata è pari");
						}
						else if (giocataPL2.equals("sasso")) {
							System.out.println("Vince "+giocatore1);
						}
						else if (giocataPL2.equals("forbice")){
							System.out.println("Vince "+giocatore2);
						}
						else
							System.out.println(giocatore2+" ha inserito un comando erroneo");
					}


				else if (giocataPL1.equals("sasso")) {
						if (giocataPL2.equals("sasso")) {
						System.out.println("La giocata è pari");
						}
						else if (giocataPL2.equals("forbice")) {
							System.out.println("Vince "+giocatore1);
						}
						else if (giocataPL2.equals("carta")){
							System.out.println("Vince "+giocatore2);
						}
						else
							System.out.println(giocatore2+" ha inserito un comando erroneo");
						}

				else {
						System.out.println(giocatore1+" ha inserito un comando erroneo");

					}

				System.out.println("Riproviamo ancora?");
				System.out.print("Inserisci 'Sì' per giocare ancora con gli stessi giocatori oppure "
						+ "digita qualsiasi altro comando------> ");
				yesOrNoSamePlayers = tastiera.next();

				} while(yesOrNoSamePlayers.equals("Sì"));

				System.out.println("Inserisci 'Sì' per rifare una nuova partita con nuovi giocatori "
						+ "oppure digita qualsiasi altro comando------> ");
				yesOrNoNewPlayers = tastiera.next();
		} while(yesOrNoNewPlayers.equals("Sì"));
		}
	}
