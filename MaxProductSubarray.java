
public class MaximumProductSubarray extends binarysearch{

	/**
	 * @param args
	 */
	
	public static void multiplicationprocedure(int arr[],int startindex,int lastindex){
	
		int product=1;
		int maxnegativenumber=Integer.MIN_VALUE;
		for(int i=startindex; i < lastindex ;i++){
			if(arr[i]<0 && arr[i]>maxnegativenumber){
				maxnegativenumber=arr[i];	
			}
		}
		
		System.out.println("Maxnegative"+maxnegativenumber);
		
		for(int j=startindex ; j < lastindex ; j++){
			product*=arr[j];
	//		System.out.println(arr[j]);
			
		}
		if(product < 0){
			product=product/maxnegativenumber;

		}
		else{
		}
		System.out.println("Answer:"+product);
		
	
		}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaximumProductSubarray mb=new MaximumProductSubarray();
		
		
		int arr[]={-1, -3, -10, 0,-10,6,7,8,0,3,4,1};
		int maxnegativenumber=Integer.MIN_VALUE;
		int product=1;
		
		int startindex=0;
		int lastindex=arr.length;
		
	/*int zeroindex=mb.binarysearch(arr, 0, arr.length, 0);	
	System.out.println("Zeroindex"+zeroindex);
	
	if(zeroindex!=-1){
		
		startindex=0;
		lastindex=zeroindex;
		mb.multiplicationprocedure(arr,startindex,lastindex);
	
		startindex=zeroindex+1;
		lastindex=arr.length-1;
	
	//	System.out.println(startindex);
	//	System.out.println(lastindex);
		mb.multiplicationprocedure(arr,startindex,lastindex);
	
	
	
	}
	else{
		mb.multiplicationprocedure(arr,startindex,lastindex);		
		}
		
*/		
	}
	
		
		
		
		
	}


