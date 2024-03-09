import java.util.Scanner;

public class Programma{
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    //Esercizio 1
  /*
    char comando = '0';
    boolean siVuoleContinuare = true, inputValido = false;
    int numeroElementi = 0;
    boolean exist = false;

    do {
      do {
        System.out.println("Scegliere l'operazione da eseguire:");
        System.out.println("a. creaArray");
        System.out.println("b. aggiungi elemento");
        System.out.println("c. rimuovi elemento");
        System.out.println("q. terminare il programma");

        inputLetto = tastiera.nextLine().toLowerCase();
        if (inputLetto.length()==1){
          comando = inputLetto.charAt(0);
          if (comando=='a'|comando=='b'|comando=='c'|comando=='q') inputValido=true;
        }
        if (!inputValido) System.out.println("Comando non valido, riprova!");
      } while (!inputValido);

      switch (comando) {
        case a:
        int[] array = Metodi.creaArray();
        break;
        case b:
        System.out.println("Digitare l'intero da voler aggiungere nell'array");
        int elementoDaAggiungere = tastiera.nextInt();
        tastiera.nextLine();

        exist = Metodi.verificaEsistenza();
        if (exist) System.out.println("L'elemento è già presente");
        if (!exist) {
          array[numeroElementi] = elementoDaAggiungere;
          numeroElementi++;
        }
        break;
        case c:
        System.out.println("Digitare l'intero da voler rimuovere dall'array");
        int elementoDaRimuovere = tastiera.nextInt();
        tastiera.nextLine();

        exist = Metodi.verificaEsistenza();
        if (!exist) System.out.println("L'elemento non è presente");
        if (exist) {
          array[numeroElementi] = elementoDaAggiungere;
          numeroElementi++;
        }

      }
    } while (siVuoleContinuare);
  */

    //Esercizio 6
    boolean qualcunoHaVinto = false;
    char[][] tabella = Metodi.creaNuovaConfigurazione();
    Metodi.stampaConfigurazioneDiGioco(tabella);
    System.out.println("Vuoi fare la prima mossa?[sì/no]");
    String inserimento = tastiera.nextLine().toLowerCase();
    if (inserimento.equals("sì")) {
      Metodi.mossaUtente(tabella);
    }


    do {
    } while (!qualcunoHaVinto);
  }
}
