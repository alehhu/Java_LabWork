package uni.LAB03;
import java.util.Scanner;

public class LAB03ES06 {
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    boolean again = true;
    do {

    System.out.println("Operazioni disponibili:");
    System.out.println("+ per sommare");
    System.out.println("- per sottrarre");
    System.out.println("* per moltiplicare");
    System.out.println("/ per dividere");
    System.out.println("u per uscire dal programma");

    System.out.println("\nChe tipo di operazione si vuole effettuare?");
    String risposta = tastiera.next();

    if(!(risposta.equals("+") | risposta.equals("-") | risposta.equals("*") | risposta.equals("/") | risposta.equals("u")))
    System.out.println("Errore, operazione non valida");

    else {

      if (risposta.equals("u")) {
          again = false;
        }

      else{

      System.out.println("Inserisci allora 2 interi");
      System.out.print("Intero 1------>");
      int x = tastiera.nextInt();
      System.out.print("Intero 2------>");
      int y = tastiera.nextInt();
      System.out.print("\n");

      int risultato = 99;
          if (risposta.equals("+")) {
              risultato = x+y;
              System.out.println(risultato);
          }

          else if (risposta.equals("-")) {
              risultato = x-y;
              System.out.println(risultato);
          }

          else if (risposta.equals("*")) {
              risultato = x*y;
              System.out.println(risultato);
          }

          else if (risposta.equals("/")) {

              if (y!=0){
              risultato = x/y;
              System.out.println(risultato);
              }
              if (y==0)
              System.out.println("Errore, il secondo intero non può essere 0");
          }
        }
    }

} while(again);


  }
}
