/*http://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
*/public class maxminusingminimumcomparisons {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int[] arr={3,4,5,6,-20,89,45,34,23,12,22,100};		
		System.out.println(arr.length);
int max=Math.max(arr[0], arr[1]);
int min=Math.min(arr[0], arr[1]);
		int comparison=0;
	
for(int i=2; i < arr.length;i++){
	comparison+=2;
	
	if(arr[i]>max){
		max=arr[i];
	}
	if(arr[i]< min){
		min=arr[i];
	}
	
	}
	
System.out.println("MAX:"+max+" MIN"+min+":Compa"+comparison);

}
		
		
		
		
		
	}


