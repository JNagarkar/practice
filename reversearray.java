import java.lang.reflect.Array;


public class reversearray {

	/**
	 * @param args
	 */
	
	
	public void reverse(int[] arr, int start,int end){
		
		int temp=0;
		
	
		if(start >= end){
			for(Integer items: arr){
				System.out.println(items);
			}
			return;}
		
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		reverse(arr, start+1, end-1);
		
		
		
		
		
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	
	int[] check={1,2,3,4,5,6,7,8,9};
	for(Integer items: check){
		System.out.println(items);
	}
	System.out.println("---------------------------------- \n");
	reversearray re=new reversearray();
	
	re.reverse(check,0,check.length-1);
	
	
	
	}

}
