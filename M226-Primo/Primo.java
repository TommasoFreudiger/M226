/*
Scrivere un programma che riceve come argomento un numero intero e verifica se è primo.
Controllare anche che l'argomento sia valido

Ad esempio:
n = 7

7 è un numero primo!
*/

public class Primo {
	public static void main(String[] args) {
		
		int numero = Integer.parseInt(args[0]);
		
		if(numero > 0)
		{
			for(int i = 2; i < numero/2; i++)
			{
			if(numero % i == 0)
			{
				System.out.print(numero + " non è un numero primo!");
			}
			else
			{
				System.out.print(numero + " è un numero primo!");
			}
			}
		}
		else
		{
			System.out.print("Errore");
		}
	}	
}