/*
Autore: Tommaso Freudiger
Classe: I2BB

Dato un array di numeri interi, passato come argomento, calcolare la differenza tra la somma dei numeri pari e la somma dei numeri dispari.

Esempio: "java Differenza 4 1 3 2"
Risultato: 6 - 4 = 2
*/

public class Differenza {
	public static void main(String[] args) {
		
		int sommaPari = 0;
		int sommaDispari = 0;
        
        for (String arg : args) {
			
            try {				
                int numero = Integer.parseInt(arg);
                if (numero % 2 == 0) 
				{
                    sommaPari += numero;					
                }
				else
				{
					sommaDispari += numero;
				}
				int risultato = sommaPari - sommaDispari;
				System.out.println("Somma dei numeri pari: " + sommaPari);
				System.out.println("Somma dei numeri dispari: " + sommaDispari);
				System.out.println("Risultato: " + sommaPari + " - " + sommaDispari + " = " + risultato);
            } 			
			catch (NumberFormatException e) {
                System.out.println("ERROR: numero non valido. Inserire un numero intero!");
            }
        }       
	}	
}