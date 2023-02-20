package Programmes1;

public class Maximum_Number_In_Array {

	public static void main(String[] args) {
		
		int [] arr = {13 , 36 , 56, 89, 98, 16 , 70};
		
		int max = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			
			for (int j = i+1; j <arr.length; j++) {
				
				if (arr[i]>arr[j])
				
					max = arr[i];
					}
		}
		
		System.out.println(max);
	}
	
	}
	


