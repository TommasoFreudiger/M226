/*
Scrivere un programma che genera la sequenza di Fibonacci per i valori minori di 100'000:
La sequenza di Fibonacci inizia con 0 e 1, e ogni numero successivo 
è la somma dei due precedenti.
*/

public class Fibonacci {
	public static void main(String[] args) {
		
		int x = 0;
		int y = 1;
		int risultato = 0;
		String risultatoStringa = "";
		
		while(risultato < 100000)
		{
			risultatoStringa += x + ", " + y + ", ";
			risultato += x + y;
			x += y;
			y += x;		
		}
		System.out.print(risultatoStringa);
	}	
}