
public class segregratexeroandones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int arr[]={0,1,0,1,0,1,0,1,0,1,0,1};
	
	int current=arr[0];
	int next=arr[1];
	int temp=0;
	for(int i=0; i < (arr.length-1);i++){
		
		if(arr[i+1]==1 && arr[i]==0){
			continue;
		}
		else{
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
		}
	}	
	for(int k:arr){
		System.out.println(k);
	}
	
	}


}
