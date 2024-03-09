import java.util.Scanner;

class Esercitazione06{

  public static int lettura(){
    Scanner tastiera = new Scanner(System.in);
    int n;
    do {
      System.out.println("Inserisci il valore di n: ");
      n = tastiera.nextInt();
      if (n<=1) {
        System.out.println("Devi inserire un intero maggiore di 1");
      }
    } while (n<=1);

    return n;
  }

  public static int fib(int n){
    int numPrec, numPrecPrec, numCorr;
    numPrecPrec = 0; //F_0
    numPrec = 1; //F_1
    numCorr = numPrec + numPrecPrec;

    for (int i=3; i<=n; i++) {
      numPrecPrec = numPrec;
      numPrec = numCorr;
      numCorr = numPrec + numPrecPrec;
    }

    return n = numCorr;
  }

  public static void implicazioni(boolean a, boolean b, boolean c){
    System.out.println("il valore di A--> B è: "+(!a || b));

    System.out.println("il valore di non(a-->b))---> c è: " + (!a || b || c));
  }

  public static int prodottoIAndJ(int min1, int min2, int max1, int max2){
    int i = min1;
    int j = min2;
    int prodotto = 1;
    boolean areValuesAcceptable = i>=min1 & i<=max1 & j>=min2 & j<=max2;
    while (areValuesAcceptable) {
      while (areValuesAcceptable) {
        prodotto = prodotto * (i+j);
        j++;
      }
      i++;
    }
    return prodotto;
  }

  public static int letturaValori (){
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserisci il valore");
    int valore = tastiera.nextInt();
    return valore;
  }

  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    System.out.println("Esercitazione 6");

    //creare 2 metodi lettura e fib()
    int n = lettura();
    int fibonacciNumeroCorrente = fib(n);
    System.out.println("L'n-esimo numero di Fibonacci è: " + fibonacciNumeroCorrente);

    System.out.println("Inserisci il valore intero min1");
    int min1 = letturaValori();
    System.out.println("Inserisci il valore intero min2");
    int min2 = letturaValori();
    System.out.println("Inserisci il valore intero max1");
    int max1 = letturaValori();
    System.out.println("Inserisci il valore intero max2");
    int max2 = letturaValori();

    int prodotto = prodottoIAndJ(min1, min2, max1, max2);
    System.out.println("Il prodotto equivale a "+prodotto);

    //esercizio 3



  }


}
