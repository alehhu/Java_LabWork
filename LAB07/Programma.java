import java.util.Scanner;

public class Programma{


  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    //Esercizio 1
    /*
    int numeroInserito = -30;
    int minimoMaggiorante = 100;
    int massimoMinorante = 0;
    int tentativi = 0;
    boolean isNumberCorrect = false;
    int numeroDaIndovinare = 0;

    int[] numeriDaIndovinare = new int[5];
    boolean[] indovinato = new boolean[5];
    int[] numeroTentativi = new int[5];

    String risposta = "sì";

    while (risposta.equalsIgnoreCase("sì")) {
      tentativi = 0;
      numeroInserito = -30;
      minimoMaggiorante = 100;
      massimoMinorante = 0;
      isNumberCorrect = false;
      numeroDaIndovinare = Metodi.estraiNumeroCasuale();

      while (numeroInserito!=numeroDaIndovinare && tentativi<10) {
        System.out.println("Inserisci un numero");
        numeroInserito = tastiera.nextInt();
        int esito = Metodi.confrontaNumeri(numeroInserito, numeroDaIndovinare);
        switch (esito) {
          case -1:
          if (numeroInserito>=massimoMinorante) {
            System.out.println("Il numero " +numeroInserito+ " è più piccolo di quello da indovinare");
            massimoMinorante = numeroInserito;
          }
          else if (numeroInserito<massimoMinorante) {
            System.out.print("Hai inserito " +numeroInserito+ " ma ti avevo già detto che il numero da indovinare è più ");
            System.out.println("grande di " +massimoMinorante);
          }
          break;
          case 0:
          System.out.println("Hai indovinato!");
          isNumberCorrect = true;
          break;
          case 1:
          if (numeroInserito<=minimoMaggiorante) {
            System.out.println("Il numero " +numeroInserito+ " è più grande di quello da indovinare");
            minimoMaggiorante = numeroInserito;
          }
          else if (numeroInserito>minimoMaggiorante) {
            System.out.print("Hai inserito " +numeroInserito+ " ma ti avevo già detto che il numero da indovinare è più ");
            System.out.println("piccolo di " +minimoMaggiorante);
          }
          break;
        }
        tentativi++;
      }
      for (int i = 0; i<4; i++) {
        numeriDaIndovinare[i] = numeriDaIndovinare[i+1];
        indovinato[i] = indovinato[i+1];
        numeroTentativi[i] = numeroTentativi[i+1];
      }
      numeriDaIndovinare[4] = numeroDaIndovinare;
      indovinato[4] = isNumberCorrect;
      numeroTentativi[4] = tentativi;

      for (int i = 0; i<=4; i++) {
        System.out.println("Partita " +(i+1));
        System.out.println("Il numero da indovinare era "+numeriDaIndovinare[i]);
        if (indovinato[i]==false) {
          System.out.println("Il numero non è stato indovinato");
        }
        else if (indovinato[i]==true) {
          System.out.println("Il numero è stato indovinato");
        }
        System.out.println("Numero tentativi " +numeroTentativi[i]);
      }
      System.out.println("Vuoi fare un'altra partita?[sì/no]");
      risposta = tastiera.next();

    }
    */

    /*
    //Esercizio 2 - "Indovina la Parola"

    String parolaEstratta = Metodi.estraiStringaCasuale();
    char[] caratteriDellaParola = new char[parolaEstratta.length()];
    char[] caratteriIndovinati = new char[parolaEstratta.length()];
    for (int i = 0; i<parolaEstratta.length(); i++) {
      caratteriDellaParola[i] = parolaEstratta.charAt(i);
      caratteriIndovinati[i] = '-';
    }
    int tentativi = 0;
    boolean arrayUguagliati = false;
    boolean laPartitaContinua = tentativi<20 && !arrayUguagliati;
    while (laPartitaContinua) {
      System.out.println("Inserisci un carattere[0 per terminare la partita]");
      String stringaInserita = tastiera.next();
      char carattereInserito = stringaInserita.charAt(0);
      if (carattereInserito=='0') {
        System.exit(0);
      }
      caratteriIndovinati = Metodi.scopriLettera(caratteriDellaParola, caratteriIndovinati, carattereInserito);
      Metodi.stampaLettereIndovinate(caratteriIndovinati);

      arrayUguagliati = true;
      for (int i = 0; i<caratteriIndovinati.length & arrayUguagliati==true; i++) {
        if (caratteriDellaParola[i]==caratteriIndovinati[i]) {
          arrayUguagliati = true;
        }
        else arrayUguagliati = false;
        if (i==caratteriIndovinati.length-1 && arrayUguagliati==true) {
          System.out.println("\nHai indovinato!");
        }
      }

      tentativi++;
      laPartitaContinua = tentativi<20 && !arrayUguagliati;
    }

    */
    /*
    //Esercizio 3
    boolean espressioneValida = true;
    System.out.println("Inserisci l'espressione");
    String espressioneInserita = tastiera.nextLine();
    char[] elementiDellEspressione = new char[espressioneInserita.length()];
    for (int i = 0; i<espressioneInserita.length(); i++) {
      elementiDellEspressione[i] = espressioneInserita.charAt(i);
      //System.out.println(elementiDellEspressione[i]);
    }
    espressioneValida = Metodi.controllaValiditaEspressioni(elementiDellEspressione);
    int risultato = Metodi.valutaEspressione(elementiDellEspressione);
    System.out.println(risultato);
    */
    /*
    //Esercizio 4
    int righe = tastiera.nextInt();
    int colonne = tastiera.nextInt();
    int[][] matriceIniziale = Metodi.generaMatriceCasuale(righe, colonne);
    Metodi.stampaMatrice(matriceIniziale);
    int[][] matriceTrasposta = Metodi.trasponiMatrice(matriceIniziale);
    Metodi.stampaMatrice(matriceTrasposta);
    */

    //Esercizio 5
    char[][] matrice = new char[26][26];
    int a = 'a'; //97
    int b = 'z'; //122
    matrice = Metodi.creazioneMatrice();
    String parolaChiave = "";
    String risposta = "sì";
    while (risposta.equalsIgnoreCase("sì")) {
      int operazioneScelta = Metodi.menu();
      switch (operazioneScelta) {
        case 1:
        parolaChiave = "" + Metodi.cambiaParolaChiave();
        break;
        case 2:
        System.out.println("Inserisci la parola da cifrare");
        String parolaDaCifrare = tastiera.next();
        String parolaCifrata = Metodi.cifraMessaggio(parolaDaCifrare, parolaChiave);
        System.out.println(parolaCifrata);
        break;
      }
      System.out.println("Vuoi continuare?[sì/no]");
      risposta = tastiera.next();
    }


    //System.out.println(matrice[7][12]);

  }
}
