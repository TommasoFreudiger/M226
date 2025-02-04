/*
Scrivere un programma che data una parola, inserita come argomento, 
restituisce una parola in codice con la seguente regola:
1. Prima lettera +Terza lettera + Ultima lettera + Penultima Lettera

Esempio: vascello -->vsol
*/

public class Codice {
	public static void main(String[] args) {
		
		String parola = args[0];

		char let1 = parola.charAt(0);
		char let2 = parola.charAt(2);
		char let3 = parola.charAt(parola.length()-1);
		char let4 = parola.charAt(parola.length()-2);
		
		System.out.println("" + "Nuova parola con 4 lettere: " + let1 + let2 + let3 + let4);
	}
}