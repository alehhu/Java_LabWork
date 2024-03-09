package uni.LAB03;

import java.util.Scanner;

public class LAB03ES01 {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("Inserire un mese in formato numero (intero)");
		int mese = tastiera.nextInt();
		System.out.println("Inserire un anno compreso tra 1900 e 2099 (es.1987)");
		int anno = tastiera.nextInt();
		
		if (!(mese>0 & mese<=12 & anno>1900 & anno<2099)) {
			System.out.println("ERRORE");
			System.exit(0);
		}
		
		boolean bisestile;
		if (anno%4==0 & anno%100!=0)
			bisestile = true;
		else if (anno%400==0)
			bisestile = true;
		else
			bisestile = false;
		
		if (mese==1 | mese==3 | mese==5 | mese==7 | mese==8 | mese==10 | mese==12)
			System.out.println("Il mese da lei scelto ha 31 giorni");
		if (mese==4 | mese==6 | mese==9 | mese==11)
			System.out.println("Il mese da lei scelto ha 30 giorni");
		if (mese==2) {
			if (bisestile==true) 
				System.out.println("Il mese da lei scelto ha 29 giorni");
			else if (bisestile==false)
				System.out.println("Il mese da lei scelto ha 28 giorni");
			
		}
			
			
	}
}
