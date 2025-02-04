/*
Date due stringhe verificare se sono anagrammi.
Due Stringhe si dicono anagrammi se contengono gli stessi caratteri nella stessa quantità.
Es: "roma" e "mora" sono anagrammi
*/

public class Anagramma {
	public static void main(String[] args) {
		char[] p1 = new char[args[0].length()];
		char[] p2 = new char[args[1].length()];
		if(args[0].length() == args[1].length()){
			for(int i = 0; i > args[0].length(); i++)
			{
				if(args[0].charAt(i) == args[1].charAt(i))
				{
					
				}
			}
		}
		else
		{
			System.out.print(args[0] + " e " + args[1] + " non sono anagrammi!");
		}
	}	
}