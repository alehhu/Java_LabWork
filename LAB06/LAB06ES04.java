import java.util.Scanner;
public class LAB06ES04{

  public static int menu() {
    Scanner tastiera = new Scanner(System.in);
    System.out.println("1) Fahrenheit-->Celsius");
    System.out.println("2) Celsius-->Fahrenheit");
    System.out.println("3) Uscita");
    System.out.println("Cosa si vuole eseguire?");
    int istruzioneDaEseguire = tastiera.nextInt();
    return istruzioneDaEseguire;
  }

  public static double convertiFinC(double temperaturaInFahrenheit) {
    double temperaturaInCelsius = (temperaturaInFahrenheit-32)/1.8;
    return temperaturaInCelsius;
  }

  public static double convertiCinF(double temperaturaInCelsius) {
    double temperaturaInFahrenheit = 1.8*temperaturaInCelsius+32;
    return temperaturaInFahrenheit;
  }

  public static void main(String[] args) {
    int comandoInserito = menu();
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserire la temperatura");
    double temperaturaInserita = tastiera.nextDouble();
    switch (comandoInserito) {
      case 1:
      System.out.println("La temperatura corrispondente in Celsius equivale a "+convertiFinC(temperaturaInserita));
      break;
      case 2:
      System.out.println("La temperatura corrispondente in Fahrenheit equivale a "+convertiCinF(temperaturaInserita));
      break;
      case 3:
      System.exit(0);
      break;
      default:
      System.out.println("ERRORE, comando non accettabile");
      System.exit(0);
    }
  }
}
