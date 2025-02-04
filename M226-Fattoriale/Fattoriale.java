/*
Crea un programma che chiede all'utente di inserire (come argomento) un numero intero positivo maggiore di 0. Il programma dovrà quindi calcolare il fattoriale di quel numero.

Esempio

Fattoriale  7

Fattoriale di 7:     7 * 6 * 5 * 4 * 3 * 2 * 1 = 5040
*/

public class Fattoriale {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);
		int risultato = numero;
		String moltiplicazione = "";

		for(int i = numero - 1; i > 0 ;i--)
		{
			risultato = risultato * i;
			
			moltiplicazione += "*" + i;	
		}
		System.out.println("Fattoriale di " + numero + ": " + numero + moltiplicazione + " = " + risultato);
	}
}