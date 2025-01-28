/* 
This is 
a multiple 
line comment
*/

public class Pitagora {
	public static void main(String[] args) {
		
		double cateto1 = Integer.parseInt(args[0]);
		double cateto2 = Integer.parseInt(args[1]);
		
		double ipotenusa = (double)Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		System.out.println("La lunghezza dell'ipotenusa è: " + ipotenusa);
	}
}