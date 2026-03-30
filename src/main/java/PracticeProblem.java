public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int fun){
		String posititron;
		if (fun == 0){
			posititron = "Zero";
		}
		else if (fun % 2 == 0){
			posititron = "Even";
		}
		else{
			posititron = "Odd";
		}
		return posititron;
	}

	public static String positiveOrNegative(int num){
		String positron;
		if (num > 0){
			positron = "Positive";
		}
		else if (num < 0){
			positron = "Negative";
		}
		else{
			positron = "Zero";
		}

		return positron;
	}

	public static String pluralize(String duh){
		String uhhuh;
		duh = duh.toLowerCase();
		if (duh.endsWith("ey")){
			uhhuh = "eys";
		}

		else if (duh.endsWith("y")){
			uhhuh = "ies";
		}

		else if (duh.endsWith("ife")){
			uhhuh = "ives";
		}
		else {uhhuh = "s";}

		return uhhuh;}}

	


