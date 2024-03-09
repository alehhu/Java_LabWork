import java.util.Scanner;

public class LAB06ES05{
  public static int menu() {
    Scanner tastiera = new Scanner(System.in);

    System.out.println("1)Decimale -> Binario");
    System.out.println("2)Binario -> Decimale");
    System.out.println("3)Uscita");
    System.out.println("Inserire il numero corrispondente all'operazione da eseguire");

    int sceltaEffettuata = tastiera.nextInt();
    return sceltaEffettuata;

  }

  public static String convertiDecInBin(int numeroInseritoEspressoInDecimale) {
    int numeroDaDividere = numeroInseritoEspressoInDecimale;
    int restoDaAggiungereASinistra = 0;
    String numeroInseritoEspressoInBinario = "";
    while (numeroDaDividere>=1) {
      restoDaAggiungereASinistra = numeroDaDividere%2;
      System.out.println(restoDaAggiungereASinistra);
      numeroDaDividere = numeroDaDividere/2;
      numeroInseritoEspressoInBinario = String.valueOf(restoDaAggiungereASinistra)+numeroInseritoEspressoInBinario;
    }

    return numeroInseritoEspressoInBinario;
  }

  public static int convertiBinInDec(int numeroInseritoEspressoInBinario) {
      String numeroBinarioInStringa = String.valueOf(numeroInseritoEspressoInBinario);
      int esponente = numeroBinarioInStringa.length()-1;
      int numeroInseritoEspressoInDecimale = 0;
      boolean cifraNonNulla;
      for (int i = 0; i<numeroBinarioInStringa.length(); i++) {
        cifraNonNulla = (numeroBinarioInStringa.charAt(i)== '1');
        if (cifraNonNulla) {
          numeroInseritoEspressoInDecimale = numeroInseritoEspressoInDecimale + (int) Math.pow(2, esponente);
        }
        esponente--;
      }
      return numeroInseritoEspressoInDecimale;
  }

  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    int sceltaEffettuata = 0;
    while (sceltaEffettuata!=1 & sceltaEffettuata!=2 & sceltaEffettuata!=3) {
      sceltaEffettuata = menu();
      if (sceltaEffettuata!=1 & sceltaEffettuata!=2 & sceltaEffettuata!=3) {
        System.out.println("L'istruzione inserita non è valida!");
      }
    }

    switch (sceltaEffettuata) {
      case 1:
      System.out.println("Inserire un numero in base decimale");
      int numeroInseritoEspressoInDecimale = tastiera.nextInt();
      System.out.println("Il numero in base binaria equivale a");
      System.out.println(convertiDecInBin(numeroInseritoEspressoInDecimale));
      break;
      case 2:
      System.out.println("Inserire un numero in base binaria");
      int numeroInseritoEspressoInBinario = tastiera.nextInt();
      System.out.println("Il numero in base decimale equivale a");
      System.out.println(convertiBinInDec(numeroInseritoEspressoInBinario));
      break;
      case 3:
      System.exit(0);
      break;
    }

  }
}
