package week1.day2.assignments.mandatory;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "We learn java basics as part of java sessions in java week1";
		//		String text = data.toLowerCase();
		int count = 0;
		String[] array1 = text.split(" ");
		for(int i=0; i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i].equalsIgnoreCase(array1[j])) {
					array1[j]="";
					count++;
                   
				}
			}

		}
		if(count>1) {
			for(int k=0; k<array1.length-1;k++) {
				System.out.print(array1[k]+" ");
			}
		}

	}

}




