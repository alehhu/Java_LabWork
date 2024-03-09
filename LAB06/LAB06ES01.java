import java.util.Scanner;

public class LAB06ES01{

  public static String aggiornaStringa(int numeroDaAggiungereInFondo, String stringaAttuale){
    String stringaConValoreAggiunto = stringaAttuale + String.valueOf(numeroDaAggiungereInFondo) + " ";
    return stringaConValoreAggiunto;
  }

  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    String stringaDiNumeriDiPosizionePari = "";
    int numeroDaAggiungereInFondo = 1;
    int conteggioPariDispari = 0;
    boolean inputNumberIsNotZero = numeroDaAggiungereInFondo!=0;
    do {
      System.out.println("Inserisci un numero Positivo");
      numeroDaAggiungereInFondo = tastiera.nextInt();
      inputNumberIsNotZero = numeroDaAggiungereInFondo!=0;

      if (numeroDaAggiungereInFondo>0) {
        conteggioPariDispari++;
      }
      else if (numeroDaAggiungereInFondo<0){
        System.out.println("ERRORE, numero non valido, proseguire");
      }

      boolean numberIsOfEvenPosition = conteggioPariDispari%2==0 & conteggioPariDispari!=0 & numeroDaAggiungereInFondo!=0;
      if (numberIsOfEvenPosition) {
        stringaDiNumeriDiPosizionePari = aggiornaStringa(numeroDaAggiungereInFondo, stringaDiNumeriDiPosizionePari);
      }

    } while (inputNumberIsNotZero);
    System.out.println(stringaDiNumeriDiPosizionePari);

  }
}
