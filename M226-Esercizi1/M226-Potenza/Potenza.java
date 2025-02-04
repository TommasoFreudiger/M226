/* 
This is 
a multiple 
line  comment
*/

public class Potenza {
	public static void main(String[] args) {
		
		double numero = Integer.parseInt(args[0]);

		double potenza = numero*numero;
		
		System.out.println("La potenza di " + numero + " è " + potenza);
	}
}