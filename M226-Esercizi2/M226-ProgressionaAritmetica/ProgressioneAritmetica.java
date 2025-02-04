/*
Sviluppa un programma che chiede all'utente di inserire tre numeri come argomenti.

Il programma deve quindi determinare se i tre numeri possono essere considerati in progressione aritmetica; una progressione aritmetica è una serie di numeri in cui la differenza tra due numeri successivi è costante.

Esempio 1

Progressione 15 25 35

I tre numeri sono in progressione aritmetica (differenza costante di 10)
*/

public class ProgressioneAritmetica {
	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(args[0]);
		int numero2 = Integer.parseInt(args[1]);
		int numero3 = Integer.parseInt(args[2]);

		int diff = numero3 - numero2;

		if((numero3 - numero2) == (numero2 - numero1))
		{
			System.out.println("I tre numeri sono in progressione aritmetica (differenza costante di " + diff + ")");
		}
		else
		{
			System.out.println("I tre  numeri non sono i progressione aritmetica");
		}
	}
}