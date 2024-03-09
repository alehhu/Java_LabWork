package uni.LAB03;
import java.util.Scanner;

public class LAB03ES03 {
  public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);

    System.out.println("Inserisci il voto della parte di teoria (da -8 a +8)");
    double teoria = tastiera.nextDouble();
    System.out.println("Inserisci il voto della parte di pratica (da 0 a 24 punti)");
    double pratica = tastiera.nextDouble();

    if (teoria<=0 & (teoria+pratica)>=18){
      System.out.println("Bocciato, devi studiare di più la teoria");
    }
    else if (teoria<=0 & pratica<18) {
      System.out.println("Bocciato, devi studiare ed esercitarti di più");
    }
    else if (teoria>=0 & (teoria+pratica)<18) {
      System.out.println("Bocciato, devi esercitarti di più");
    }
    else if ( (teoria+pratica)==31 || (teoria+pratica)==32)
    System.out.println("Congratulazioni: 30 e lode!");
    else
    System.out.println("Il tuo voto è "+ (teoria+pratica));
  }
}
