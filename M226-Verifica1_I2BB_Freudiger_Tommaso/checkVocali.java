/*
Autore: Tommaso Freudiger
Classe: I2BB

Scrivere un programma che partendo da una stringa passata come argomento sia in grado di verificare se questa contiene o meno le 5 le vocali (a,e,i,o,u).
     - Trasformare la stringa in minuscolo usando "args[0].toLowerCase()"
     - Se si vuole trasformare la parola in un'array di caratteri (non strettamente necessario) usare parola.toCharArray()

Esempio1: java checkVocali "muoio" Risultato: false
Esempio2: java checkVocali "muoioLaSera" Risultato: true
*/

public class checkVocali{
    public static void main(String[] args) {
		
		int lunghezza = args[0].length();
		String parola = args[0].toLowerCase();
		
		for(int i = 0;  lunghezza >= i; i++)
		{
			int la = 0;
			int le = 0;
			int li = 0;
			int lo = 0;
			int lu = 0;
			
			if (parola.charAt(i)=='q' || parola.charAt(i)=='w' || parola.charAt(i)=='r' || parola.charAt(i)=='t' || parola.charAt(i)=='z' || parola.charAt(i)=='p' || parola.charAt(i)=='s' || parola.charAt(i)=='d' || parola.charAt(i)=='f' || parola.charAt(i)=='g' || parola.charAt(i)=='h' || parola.charAt(i)=='j' || parola.charAt(i)=='k' || parola.charAt(i)=='l' || parola.charAt(i)=='m' || parola.charAt(i)=='n' || parola.charAt(i)=='b' || parola.charAt(i)=='v' || parola.charAt(i)=='c' || parola.charAt(i)=='x' || parola.charAt(i)=='y')
			{
				continue;
			}
			else if (parola.charAt(i)=='a')
			{
				la ++;
			}
			else if (parola.charAt(i)=='e')
			{
				le ++;
			}
			else if (parola.charAt(i)=='i')
			{
				li ++;
			}
			else if (parola.charAt(i)=='o')
			{
				lo ++;
			}
			else if (parola.charAt(i)=='u')
			{
				lu++;
			}
			if(la >= 1 && le >= 1 && li >= 1 && lo >= 1 && lu >= 1)
			{
				System.out.println("Risultato: true" + la + le + li + lo + lu);
				break;
			}
			else
			{
				System.out.println("Risultato: false");
				continue;
			}
		}
	}
}