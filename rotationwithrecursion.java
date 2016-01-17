
public class rotationwithrecursion {

	/**
	 * @param args
	 */
	
	
	public void rotate(int[] arr,int pivot){

		reverse(arr,0,pivot-1);
		reverse(arr,pivot,arr.length-1);
		reverse(arr,0,arr.length-1);	
		for(int i=0; i < arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	
	
	private void reverse(int[] arr, int i, int pivot) {
		// TODO Auto-generated method stub

		int temp=0;
		while(i < pivot){
			
		temp=arr[i];
		arr[i]=arr[pivot];
		arr[pivot]=temp;
		i++;
		pivot--;		
		}
		
		
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] check={1,2,3,4,5,6,7,8,9};

		rotationwithrecursion rw=new rotationwithrecursion();
		rw.rotate(check,2);
		
	}

}
