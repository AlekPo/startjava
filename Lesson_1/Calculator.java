public class Calculator {
	public static void main(String[] args) {
		int numOne = 3; //number one
		int numTwo = 1; //number two
		char action = '^'; //arithmetic action
		
		int answer = 0;
		double answerFractional = 0.0;
		double numTwoDb = numTwo;
		if (action == '+') {
			answer = numOne + numTwo;
		} else if (action == '-') {
			answer = numOne - numTwo;
		} else if (action == '*') {
			answer = numOne * numTwo;
		} else if (action == '/') {
			answerFractional = numOne / numTwoDb;
		} else if (action == '^') {
			if (numTwo == 0) {
				answer = numOne;
			} else {
			answer = numOne;
				for (int i = 2; i <= numTwo; i++) {
					answer = answer * numOne;
				}
			}
		} else if (action == '%') {
			answer = numOne % numTwo;
		} else {
		 	System.out.println("Action not defined correctly");
		 	return;
		}
		if (action == '/') {
		System.out.println(numOne + " " + action + " " + numTwo + " = " + answerFractional);	
		} else {
			System.out.println(numOne + " " + action + " " + numTwo + " = " + answer);
		}
	}
}