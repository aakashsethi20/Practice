/*  CSI2114 Lab 3 - lab3.java
 *  
 *  Class to check balanced brackets in math expressions  
 *
 *  Usage: java bracketsBalance <exp>
 *  
 *  by Jeff Souza
 *
 */

class bracketsBalance {

	private boolean bBalance (String exp){ 

		// INCLUDE YOUR CODE HERE

		if(exp.isEmpty())
			return true;
		System.out.println("Expression is: " + exp);

		ArrayStack stack = new ArrayStack(50);

		//will work as to legend of the brackets
		String legend = "{}[]()";

		char bracket =' ';

		for (int i = 0; i < exp.length(); i++) {

			bracket = exp.charAt(i);
			System.out.println("Loop " + (i+1) + " bracket: " + bracket);
			int bracketIndex = legend.indexOf(bracket);
			
			if(bracketIndex % 2 == 0) {
				stack.push(bracket);
				System.out.println("Open Bracket index: " + bracketIndex);
			}
			
			else if(bracketIndex != -1) {
				if(stack.isEmpty())
					return false;
				
				char openBracket = ((Character) stack.pop()).charValue();
				System.out.println("close bracket index : " + legend.indexOf(bracket));
				if(bracketIndex-1 != legend.indexOf(openBracket))
					return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		bracketsBalance b = new bracketsBalance();
		boolean result = b.bBalance(args[0]);

		if (result) System.out.println("The expression is balanced."); 
		else        System.out.println("The expression is NOT balanced."); 
	}
}