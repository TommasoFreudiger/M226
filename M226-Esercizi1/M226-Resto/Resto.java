/* 
This is 
a multiple 
line  comment
*/

public class Resto {
	public static void main(String[] args) {
		
		int nominatore = Integer.parseInt(args[0]);
		int denominatore = Integer.parseInt(args[1]);
		
		double totale = nominatore % denominatore;
		
		System.out.println("Il resto della divisione è: " + totale);
	}
}