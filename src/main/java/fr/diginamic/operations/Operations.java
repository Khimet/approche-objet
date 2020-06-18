package fr.diginamic.operations;

/** Classe stateless Operations
 * @author Khalil HIMET
 *
 */
public class Operations {

	/** Methode static qui permet de faire des calculs entre deux nombres
	 * @param a, double
	 * @param b, double
	 * @param operateur, char ('+', '-', '*', '/')
	 * @return un double
	 */
	public static double calcul(double a, double b, char operateur) {
		
		double operation = 0;
		
		if (operateur == '+') {
			
			operation = a + b;
		}
		
		if (operateur == '-') {
			
			operation = a - b;
		}
		
		if (operateur == '*') {
			
			operation = a * b;
			
		}
		
		if (operateur == '/') {
			
			operation = a / b;
		}
		
		return operation;
		
	}
	
}
