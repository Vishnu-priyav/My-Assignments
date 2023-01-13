package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {


	public static void main(String[] args) {
		String test = "changeme";
	   
		char[] testArray = test.toCharArray();
		for(int i=0; i< testArray.length; i++) {
			if(i%2!=0) {
				testArray[i] = Character.toUpperCase(testArray[i]);
			}
			System.out.print(testArray[i]);
				 
			}

		}


	}


