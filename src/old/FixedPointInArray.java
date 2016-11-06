/*	http://www.geeksforgeeks.org/find-a-fixed-point-in-a-given-array/
*/

public class FixedPointInArray {

	public static int binarysearch(int arr[],int low,int high){
		
//		int x=elementtobesearched;
		if(high >=low){
		
		//int mid=low + (high-low)/2 ;
		int mid=(high+low)/2;
//		System.out.println(mid);
		   if ( (mid == 0 || mid > arr[mid-1]) && (arr[mid] == (mid+1)) )
	           return mid;
	       else if (mid > arr[mid])
	           return binarysearch(arr, (mid + 1), high);
	       else
	           return binarysearch(arr, low, (mid -1));
	   }
		return -1;}

	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] = {-10, -5, 0, 2, 5};
		int mid=binarysearch(arr, 0, arr.length);
	mid++;
	if(mid==0){
	System.out.println("doesnt exist");
	}
	else{
		System.out.println(mid+"rd location");	
		
	}
	}

}
