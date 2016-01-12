
public class findkmaximumelementsinarray extends mytoolbox{

	public static void bubblesort(int arr[],int k){
		
		int temp=0;
		for(int i=0 ; i < k;i++){
			for(int j=0; j < arr.length-1;j++){				
				int m=j+1;
				if(arr[j]>arr[m]){
					temp=arr[j];
					arr[j]=arr[m];
					arr[m]=temp;
						}
				}
			System.out.println(arr[(arr.length-1)-i]);	
		}	
		
	}
	
	/**
	 * http://www.geeksforgeeks.org/k-largestor-smallest-elements-in-an-array/
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,6,7,2,3,9,4,8,23,2};
		int k=4;
		
		findkmaximumelementsinarray fm=new findkmaximumelementsinarray();
		//fm.bubblesort(arr,k);
	
		
		fm.sort(arr);
		System.out.println("\n");
		for(int i=0;i<k;i++){
			
			System.out.println(arr[arr.length-1-i]);
			
		}
		
		
		
		
		
		
	}

}
