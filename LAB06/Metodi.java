public class Metodi{
  public static int sommaDueInteri(int interoNumero1, int interoNumero2){
    int somma = interoNumero1 + interoNumero2;
    return somma;
  }

  public static int divisioneIntera(int interoNumero1, int interoNumero2) {
    int quozienteIntero = interoNumero1/interoNumero2;
    return quozienteIntero;
  }

  public static int restoDivisioneIntera(int interoNumero1, int interoNumero2) {
    int restoDivisioneIntera = interoNumero1%interoNumero2;
    return restoDivisioneIntera;
  }

  public static double mediaTraDueDouble(double numero1, double numero2) {
    double mediaTraDueDouble = (numero1+numero2)/2;
    return mediaTraDueDouble;
  }

  public static int valoreAssolutoIntero(int numeroIntero) {
    int valoreAssolutoIntero = Math.abs(numeroIntero);
    return valoreAssolutoIntero;
  }

  public static int lunghezzaStringaIntero(int numeroIntero) {
    String stringaDelNumero = String.valueOf(numeroIntero);
    return stringaDelNumero.length();
  }

}
