import java.util.Scanner;

public class Programma{
  public static void main(String[] args) {

    System.out.println("a) somma di due numeri interi");
    System.out.println("b) divisione intera e resto tra due numeri interi");
    System.out.println("c) media tra due numeri double");
    System.out.println("d) valore assoluto di un numero intero");
    System.out.println("e) lunghezza della stringa che rappresenta un numero intero");
    System.out.println("t) termina il programma");
    System.out.println("Inserisci il comando da eseguire");
    Scanner tastiera = new Scanner(System.in);
    String stringaInserita = tastiera.next();
    char comandoInserito = stringaInserita.charAt(0);

    int intero1 = 0;
    int intero2 = 1;
    double double1 = 0;
    double double2 = 1;

    boolean secondoNumeroUgualeAZero = (intero2 == 0 | double2 == 0);

    switch (comandoInserito) {
      case 'a':
      intero1 = tastiera.nextInt();
      intero2 = tastiera.nextInt();
      System.out.println(Metodi.sommaDueInteri(intero1, intero2));
      break;
      case 'b':
      intero1 = tastiera.nextInt();
      intero2 = tastiera.nextInt();
        if (!secondoNumeroUgualeAZero) {
          System.out.println(Metodi.divisioneIntera(intero1, intero2));
        }
        else if (secondoNumeroUgualeAZero) {
          System.out.println("Errore");
          System.exit(0);
        }
      break;
      case 'c':
      intero1 = tastiera.nextInt();
      intero2 = tastiera.nextInt();
      if (!secondoNumeroUgualeAZero) {
        System.out.println(Metodi.restoDivisioneIntera(intero1, intero2));
      }
      else if (secondoNumeroUgualeAZero) {
        System.out.println("Errore");
        System.exit(0);
      }
      break;
      case 'd':
      double1 = tastiera.nextDouble();
      double2 = tastiera.nextDouble();
      System.out.println(Metodi.mediaTraDueDouble(double1, double2));
      break;
      case 'e':
      intero1 = tastiera.nextInt();
      System.out.println(Metodi.valoreAssolutoIntero(intero1));
      break;
      case 'f':
      intero1 = tastiera.nextInt();
      System.out.println(Metodi.lunghezzaStringaIntero(intero1));
    }
  }
}
