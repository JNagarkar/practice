/*http://www.geeksforgeeks.org/find-a-pair-with-the-given-difference/
*/public class FindPairWithGivenDifference extends mergesort{

	/**
	 * @param args
	 */
	
	   public static boolean findPairWithDifference(int[] input, int diff) {
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < input.length; i++) {
	            max = Math.max(input[i], max);
	        }
	        // b - a = c
	        // b = a + c
	        // a = b - c
	        int[] bin = new int[max+1];
	        for (int i = 0; i < input.length; i++) {
	            int ts = Math.abs(input[i] + diff);
	            int td = Math.abs(input[i] - diff);
	            
	            if (ts < bin.length && bin[ts] == 1) {
	                
	            	return true;
	            } else if (td < bin.length && bin[td] == 1) {
	                return true;
	            }
	            bin[input[i]] = 1;
	            
	        }
	        return false;
	    }
	
	
	
	
	
	
	
	public static int binarysearch(int arr[],int low,int high,int elementtobesearched){
		
		int x=elementtobesearched;
		if(high >=low){
		
		//int mid=low + (high-low)/2 ;
		int mid=(high+low)/2;
//		System.out.println(mid);
		   if ( (mid == 0 || x > arr[mid-1]) && (arr[mid] == x) )
	           return mid;
	       else if (x > arr[mid])
	           return binarysearch(arr, (mid + 1), high, x);
	       else
	           return binarysearch(arr, low, (mid -1), x);
	   }
		return -1;}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPairWithGivenDifference fm=new FindPairWithGivenDifference();

        int arr[] = {5, 20, 3, 2, 50, 65};
        int n = 15;
	
        fm.sort(arr);
	
	for(int i:arr){
		System.out.print(""+i+":");
	}
	
for(int counter=0; counter < arr.length;counter++){

	int index=binarysearch(arr, counter, arr.length-1, arr[counter]+n);
if(index!=-1){
	System.out.println("Numbers are "+arr[counter]+" &:"+arr[index]);
	
}
	
}	
	

boolean r=findPairWithDifference(arr,15);
System.out.println(r);











	}

}
