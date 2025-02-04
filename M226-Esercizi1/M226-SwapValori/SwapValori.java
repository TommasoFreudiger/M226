/* 
This is 
a multiple 
line  comment
*/

public class SwapValori {
	public static void main(String[] args) {
		
	String varA = args[0];
	String varB = args[1];
	String varC = varA;
	String varD = varB;
	varA = varD;
	varB = varC;
		
		System.out.println("Valore A: " + varA + " - Valore B : " + varB);
	}
}