
public class maxdifferencebetweentwolements {

	/**
	 * http://www.geeksforgeeks.org/maximum-difference-between-two-elements/
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]={ 7, 9, 5, 6, 3, 2};
		
		int minindex=Integer.MAX_VALUE;
		int maxindex=0;
		
		int minvalue=arr[0];
		int maxvalue=arr[0];
		int difference=0;
		int maybeminvalue=minvalue;
		for(int i=0 ; i < arr.length;i++){

				if(arr[i] > maxvalue){
				maxvalue=arr[i];
				maxindex=i;
			}
				
				/*	if the index of current max number is greater than index of actual minimum number
				then we are free to assign the number holding the minimumindex as minimum value*/
				if(maxindex > minindex){
					minvalue=maybeminvalue;
				}	

				
			/*
			 * Tricky part: If you know that arr[i] is less than minvalue, then save it somewhere
			 * and give the minindex to it
			 * */
			if(arr[i]<maybeminvalue){
				maybeminvalue=arr[i];
	
				minindex=i;
			}
			
	
		}
		
		if(maxvalue==minvalue){
			System.out.println("No such element found");
		}else{
		System.out.println(maxvalue-minvalue);		
		}
	}

}
