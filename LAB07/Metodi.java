import java.util.Scanner;

public class Metodi{

  public static int estraiNumeroCasuale() {
    return (int) (Math.random()*100);
  }

  public static int confrontaNumeri(int numeroInserito, int numeroDaIndovinare) {
    int esitoConfronto = 0;
    if (numeroInserito<numeroDaIndovinare) {
      esitoConfronto = -1;
    }
    else if (numeroInserito==numeroDaIndovinare) {
      esitoConfronto = 0;
    }
    else if (numeroInserito>numeroDaIndovinare) {
      esitoConfronto = +1;
    }
    return esitoConfronto;
  }

  public static String estraiStringaCasuale () {
    String[] parole = {"ciao", "automobile", "astuccio", "libro", "bottiglia", "cellulare", "bella"};
    int numeroEstratto = 10;
    while(numeroEstratto<0 |numeroEstratto>6){
       numeroEstratto = (int) (Math.random()*10);
    }
    return parole[numeroEstratto];
}

  public static char[] scopriLettera(char[] caratteriDellaParola, char[] caratteriIndovinati, char carattereInserito) {

  for (int i = 0; i<caratteriDellaParola.length; i++) {
    char carattereDaAnalizzare = caratteriDellaParola[i];
    if (carattereInserito==carattereDaAnalizzare) {
      caratteriIndovinati[i] = carattereInserito;
    }
  }
  return caratteriIndovinati;
}

  public static void stampaLettereIndovinate(char[] caratteriIndovinati) {
    for (int i = 0; i<caratteriIndovinati.length; i++) {
      System.out.print(caratteriIndovinati[i]);
    }
  }

  public static boolean controllaValiditaEspressioni(char[] elementiDellEspressione) {
    boolean validitaEspressione = true;
    for (int i = 0; i<elementiDellEspressione.length & validitaEspressione==true; i++) {
      boolean validitaCaratteri = (elementiDellEspressione[i]>='0' & elementiDellEspressione[i]<='9') | elementiDellEspressione[i]=='+' | elementiDellEspressione[i]=='-' | elementiDellEspressione[i]==' ';
      if (validitaCaratteri==true) {
        validitaEspressione = true;
      }
      else {
        System.out.println("Espressione non valida");
        validitaEspressione = false;
      }
    }
    return validitaEspressione;
  }

  public static int valutaOperando(char carattereDaConvertire) {
    String stringa = "" +carattereDaConvertire;
    return Integer.valueOf(stringa);
  }

  public static int valutaEspressione(char[] elementiDellEspressione) {
    int risultato = 0;
    for (int i = 0; i<elementiDellEspressione.length; i++) {
      if (elementiDellEspressione[i]>='0' & elementiDellEspressione[i]<='9' & i==0) {
        risultato = +valutaOperando(elementiDellEspressione[i]);
        System.out.println(risultato);
      }
      else if (elementiDellEspressione[i]=='+') {
        risultato = risultato +valutaOperando(elementiDellEspressione[i+1]);
      }
      else if (elementiDellEspressione[i]=='-') {
        risultato = risultato -valutaOperando(elementiDellEspressione[i+1]);
      }
    }
    return risultato;
  }

  public static int[][] generaMatriceCasuale (int numeroDiRighe, int numeroDiColonne) {
    int[][] matriceGenerata = new int[numeroDiRighe][numeroDiColonne];
    for (int i = 0; i<numeroDiRighe; i++) {
      for (int m = 0; m<numeroDiColonne; m++) {
        matriceGenerata[i][m] = (int) (Math.random()*100);
      }
    }
    return matriceGenerata;

  }

  public static int[][] trasponiMatrice(int[][] matriceDaTrasporre) {
    int[][] matriceTrasposta = new int[matriceDaTrasporre[0].length][matriceDaTrasporre.length];
    for (int i = 0; i<matriceDaTrasporre.length; i++) {
      for (int m = 0; m<matriceDaTrasporre[0].length; m++) {
        matriceTrasposta[m][i] = matriceDaTrasporre[i][m];
      }
    }
    return matriceTrasposta;
  }

  public static void stampaMatrice(int[][] matrice) {
    for (int i = 0; i<matrice.length; i++) {
      for (int m = 0; m<matrice[0].length; m++) {
        System.out.print(matrice[i][m]+ " ");
      }
      System.out.println("");
    }
  }

  public static int menu () {
    Scanner tastiera = new Scanner(System.in);

    System.out.println("Scegliere l'operazione da eseguire[1/2/3/4]");
    System.out.println("1 – Inserisci/cambia la parola chiave");
    System.out.println("2 – Cifra un messaggio");
    System.out.println("3 – Decifra un messaggio");
    System.out.println("0 – Esci dal programma");

    return tastiera.nextInt();
  }
  public static char[][] creazioneMatrice() {
    char[][] matrice = new char[26][26];
    char lettera = 97;
    for (int i = 0; i<26; i++) {
      for (int j = 0; j<26; j++){
        matrice [i][j] = lettera;
        lettera++;
        if (lettera==123) {
          lettera = 97;
        }
        if (j==25) {
          lettera++;
        }
        //System.out.println(lettera);
        System.out.println(matrice[i][j]);
      }
    }
    return matrice;
  }

  public static String cambiaParolaChiave() {
    Scanner tastiera = new Scanner(System.in);
    boolean isOkay = false;
    String parolaChiave = "";
    while (isOkay==false) {
      System.out.println("Inserisci parola chiave");
      parolaChiave = parolaChiave + tastiera.next();
      isOkay=true;
      for (int i = 0; i<parolaChiave.length() && isOkay==true; i++) {
        char carattereDaVerificare = parolaChiave.charAt(i);
        if (carattereDaVerificare>122 || carattereDaVerificare<97) {
          isOkay = false;
        }
      }
      if (!isOkay) {
        System.out.println("Parola chiave non valida");
      }
    }
    return parolaChiave;
  }

  public static char cifraLettera(char letteraParolaDaCifrare, char letteraParolaChiave) {
    char[][] matrice = new char[26][26];
    matrice = creazioneMatrice();
    int riga = letteraParolaDaCifrare-97;
    int colonna = letteraParolaChiave-97;
    System.out.println(riga);
    char carattereCifrato = matrice[riga][colonna];
    return carattereCifrato;
  }

  public static String cifraMessaggio(String parolaDaCifrare, String parolaChiave) {
    String parolaCifrata = "";
    for (int i = 0, j = 0; i<parolaDaCifrare.length(); i++) {
      System.out.println(j);
      if (j==parolaChiave.length()) {
        j=0;
      }
      parolaCifrata = parolaCifrata + cifraLettera(parolaDaCifrare.charAt(i), parolaChiave.charAt(j));
      System.out.println(cifraLettera(parolaDaCifrare.charAt(i), parolaChiave.charAt(j)));
      j++;
    }
    return parolaCifrata;
  }
}
