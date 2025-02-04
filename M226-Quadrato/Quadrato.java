/*
Scrivere un programma che riceve in ingresso (come argomento) un numero positivo e stampa un quadrato di asterischi.
(Restituire un errore se vengono inseriti più argomenti o se l'argomento è negativo)

Ad esempio con argomento 3 devo ottenere 
* * * 
* * * 
* * * 
*/

public class Quadrato {
	public static void main(String[] args) {
		
		int lato = Integer.parseInt(args[0]);
		
		if(args.length > 1 || lato < 0)
		{
			System.out.print("Errore");
			
		}
		
		else {
		for(int i = lato; i > 0; i--) {
			for(int j = lato; j > 0; j--) {
			System.out.print(" * ");
		}
			System.out.println();
		}
	}
}	
}