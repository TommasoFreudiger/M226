/*
Scrivi un programma che, dato un numero inserito dall'utente come argomento, stampa a terminale: “N è multiplo di 3” oppure “N non è multiplo di 3”.

Esempio:
>java Multiplo 7
7 non è multiplo di 3
*/

public class Multipli {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);

		if(numero % 3 == 0)
		{
			System.out.println(numero + " è multiplo di 3.");
		}
		else
		{
			System.out.println(numero + " non è multiplo di 3.");
		}
	}
}