import java.util.Scanner;

public class LAB06ES03{

  public static boolean cercaCarattere(String stringaInserita, char carattereInserito) {
    boolean characterExistInsideOfString = stringaInserita.contains(""+carattereInserito);
    return characterExistInsideOfString;
  }

  public static String rimuoviCarattere(String stringaInserita, char carattereInserito) {
    int indiceCarattereDaRimuovere = 0;
    String stringaConCaratteriInRimozione = stringaInserita;
    do {
      indiceCarattereDaRimuovere = stringaConCaratteriInRimozione.indexOf(carattereInserito);
      stringaConCaratteriInRimozione = stringaConCaratteriInRimozione.substring(0, indiceCarattereDaRimuovere) + stringaConCaratteriInRimozione.substring(indiceCarattereDaRimuovere+1);
    } while (cercaCarattere(stringaConCaratteriInRimozione, carattereInserito));
    String stringaConCaratteriRimossi = stringaConCaratteriInRimozione;
    return stringaConCaratteriRimossi;
  }

  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserisci la stringa");
    String stringaInserita = tastiera.nextLine();
    System.out.println("Inserisci il carattere da eliminare");
    String carattereInseritoFormatoStringa = tastiera.nextLine();
    char carattereInserito = carattereInseritoFormatoStringa.charAt(0);

    String stringaConCaratteriRimossi = "";
    if (cercaCarattere(stringaInserita, carattereInserito)) {
      stringaConCaratteriRimossi = rimuoviCarattere(stringaInserita, carattereInserito);
    }
    System.out.println(stringaConCaratteriRimossi);

  }
}
