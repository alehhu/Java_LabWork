import java.util.Scanner;

public class Metodi{
  public static int[] creaArray() {
    int[] arrayCreato = new int[100];
    return arrayCreato;
  }

  public static boolean verificaEsistenza(int[] arrayDaModificare, int numeroElementi, int elemento) {
    boolean exist = false;
    for (int i = 0; i<numeroElementi && !exist; i++) {
      if (arrayDaModificare[i]==elemento) exist = true;
    }
    return exist;
  }

  public static void stampaConfigurazioneDiGioco(char[][] caselle) {
    for (int i = 0; i<caselle.length; i++) {
      for (int j = 0; j<caselle[i].length; j++) {
        System.out.print(caselle[i][j]);
        if (j!=2) System.out.print("|");
      }
      if (i!=2) System.out.println("\n-+-+-");
    }
  }

  public static char[][] creaNuovaConfigurazione() {
    char[][] tabellaVuota = new char[3][3];
    for (int i = 0; i<tabellaVuota.length; i++) {
      for (int j = 0; j<tabellaVuota.length; j++) {
        tabellaVuota[i][j] = ' ';
      }
    }
    return tabellaVuota;
  }

  public static char[][] mossaUtente(char[][] configurazioneAttuale) {
    Scanner tastiera = new Scanner(System.in);
    boolean inputValido = false;
    int riga = 0;
    int colonna = 0;
    do {
      System.out.println("Inserisci la posizione che si vuole occupare[riga-colonna]");
      String inserimento = tastiera.nextLine();
      riga = Integer.parseInt(inserimento.substring(0,1));
      colonna = Integer.parseInt(inserimento.substring(2));
    } while (!inputValido);
    configurazioneAttuale[riga][colonna] = 'O';
    return configurazioneAttuale;
  }

  public static void mossaComputer(char[][] configurazioneAttuale) {
    
  }

  public static int verificaVittoria(char[][] configurazione) {
    int conteggioElementiUtente = 0;
    int conteggioElementiAI = 0;
    boolean vittoriaUtente = false;
    boolean vittoriaAI = false;
    for (int i = 0; i<configurazione.length; i++) {
      for (int j = 0; j<configurazione.length && !vittoriaUtente; j++) {
        if (j==0) conteggioElementiUtente = 0;
        if (configurazione[i][j]=='O') conteggioElementiUtente++;
        if (conteggioElementiUtente==3) vittoriaUtente = true;
      }
    }
    for (int i = 0; i<configurazione.length; i++) {
      for (int j = 0; j<configurazione.length && !vittoriaUtente; j++) {
        if (j==0) conteggioElementiUtente = 0;
        if (configurazione[j][i]=='O') conteggioElementiUtente++;
        if (conteggioElementiUtente==3) vittoriaUtente = true;
      }
    }

    for (int i = 0; i<configurazione.length; i++) {
      for (int j = 0; j<configurazione.length && !vittoriaAI; j++) {
        if (j==0) conteggioElementiAI = 0;
        if (configurazione[i][j]=='O') conteggioElementiAI++;
        if (conteggioElementiAI==3) vittoriaAI = true;
      }
    }
    for (int i = 0; i<configurazione.length; i++) {
      for (int j = 0; j<configurazione.length && !vittoriaAI; j++) {
        if (j==0) conteggioElementiAI = 0;
        if (configurazione[j][i]=='O') conteggioElementiAI++;
        if (conteggioElementiAI==3) vittoriaAI = true;
      }
    }

    if (vittoriaUtente) return 1;
    else if (vittoriaAI) return -1;
    else return 0;
  }
}
