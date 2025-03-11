/*
Creare un programma che stampa a video tutte le vocali presenti in una parola passata come argomento

Esempio:
StampoaVocali doraemon

o a e o 
*/

public class TrovaVocali {
	public static void main(String[] args) {
		
		String parola = args[0];
		String text = "";
		
		for(int i = 0; parola.length() >= i; i++)
		{
			if (parola.charAt(i)=='a')
			{
				text += "a ";
			}
			if (parola.charAt(i)=='e')
			{
				text += "e ";
			}
			if (parola.charAt(i)=='i')
			{
				text += "i ";
			}
			if (parola.charAt(i)=='o')
			{
				text += "o ";
			}
			if (parola.charAt(i)=='u')
			{
				text += "u ";
			}
		}
		System.out.print(text);
	}	
}