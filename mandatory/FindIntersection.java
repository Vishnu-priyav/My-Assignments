package week1.day2.assignments.mandatory;

public class FindIntersection {

	public static void main(String[] args) {
		//		// TODO Auto-generated method stub
		int array1[] = {3,2,11,4,6,7};		
		int array2[] = {1,2,8,4,9,7};
		
//		int length1= array1.length;
//		int length2 = array2.length;		

		for(int i=0; i<array1.length;i++) {
			for(int j=0; j<array2.length;j++) {
				
				if(array1[i]==array2[j]) {
				System.out.println(array1[i]);	
				}
			}
	
		}

	}	
}





