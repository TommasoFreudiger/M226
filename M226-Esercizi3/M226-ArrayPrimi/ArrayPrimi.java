import java.util.Scanner;
import java.util.Arrays;

/*
Leggere un array di interi con n numeri e dire quali e quanti di essi sono primi.

Esempio:
{2,4,4,5,6,7,8,9}

Output
2 5 7
Quantità primi: 3

Usare lo scanner per chiedere un input all'utente
*/

public class ArrayPrimi {
	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Quanti numeri vuoi inserire?");
	
		int numeroN = myObj.nextInt();
		

		int contaPrimi = 0;
		int[] numeriPrimi = new int[numeroN];
		
		for(int i = 0; i < numeroN; i++)
		{
			System.out.println("Inserisci il numero:");
			int n = myObj.nextInt();
		
			if(n == 2 || n == 1)
			{
				numeriPrimi[contaPrimi] = n;
				contaPrimi ++;		
			}	
			else
			{
				int divisore = 2;
				while(divisore <= n-1)
				{	
					if(n%divisore == 0)
					{
						divisore += 1;
						break;
					}
					else
					{
					divisore += 1;
					}
					if(divisore == n){
						numeriPrimi[contaPrimi] = n;
						contaPrimi ++;
					}
				}
			}
		}
		System.out.println("I numero di numeri primi è " + contaPrimi + " ovvero: " + Arrays.toString(numeriPrimi));
	}
}