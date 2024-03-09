import java.util.Scanner;

public class LAB05ES07{
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
  //   int numeroTrattini;
    String n = tastiera.next();
    String m = tastiera.next();
    int potenzaDiDieci = 1;
    int decimale = 1;
    int prodottoFinale;

    System.out.println(n);
    System.out.println(m);
    System.out.println("------");
    boolean isMoreThanZeroCifraM = cifraM>=0;
    for (int cifraM = m.length()-1, prodottoFinale = 0; isMoreThanZeroCifraM; cifraM--, decimale++) {
      System.out.println(n.valueOf()*cifraM);
      for (int i = 1; i<decimale; i++) {
        potenzaDiDieci = potenzaDiDieci*10;
      }
      prodottoFinale = prodottoFinale + n.valueOf()*cifraM*decimale;
    }
    System.out.print(", "+prodottoFinale+".");

  }
}
