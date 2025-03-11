import java.util.Random;
import java.util.Scanner;

/*
Autore: Tommaso Freudiger
Classe: I2BB

Simulare il gioco "Guess the number": Il computer genera un numero casuale tra 1 e 30 e l'utente deve indovinarlo, con suggerimenti (più grande, più piccolo, indovinato)

Esempio: "java GuessTheNumber"
Risultato:
Indovina il numero che ho generato tra 1 e 30
10
più grande
15
più piccolo
12
indovinato
*/

public class GuessTheNumber{
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroCasuale = random.nextInt(30) + 1;
        int tentativo;
        
        System.out.println("Indovina il numero che ho generato tra 1 e 30");
        
        while (true) 
		{		
            System.out.print("Inserisci un numero: ");
            try {
                tentativo = Integer.parseInt(scanner.nextLine());
                
                if (tentativo == numeroCasuale) 
				{
                    System.out.println("indovinato");
                    break;
                } 
				else if (tentativo < numeroCasuale) 
				{
                    System.out.println("più grande");
                } 
				else 
				{
                    System.out.println("più piccolo");
                }
            } 
			catch (NumberFormatException e) {
                System.out.println("ERROR: numero non valido. Inserire un numero intero!");
            }
        }
    }
}