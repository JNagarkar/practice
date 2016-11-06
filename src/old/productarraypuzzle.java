
/*http://www.geeksforgeeks.org/a-product-array-puzzle/
*/
public class productarraypuzzle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[]={10,3,4,6,8,9};
		int leftarray[]=new int[arr.length];
		int rightarray[]=new int[arr.length];

		int leftproduct=1;
		for(int i=0; i < arr.length;i++){
		leftproduct=leftproduct*arr[i];
		leftarray[i]=leftproduct;
		}
		
		
		int rightproduct=1;
		for(int i=arr.length-1; i > 0;i--){
		rightproduct=rightproduct*arr[i];
		rightarray[i]=rightproduct;
		}
		if(arr.length==1){
			System.out.println("Not possible");
		
		}
		else{		
		for(int i=0; i < arr.length ; i++){
		
			
			if(i==0){
				System.out.println(rightarray[1]);
			}
			else if(i==arr.length-1){
				
				System.out.println(leftarray[arr.length-2]);
			}
			else{
				
				System.out.println(leftarray[i-1]*rightarray[i+1]);
			}
			
		} 
			
			
		}}
		
		
	}


