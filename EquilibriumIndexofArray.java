/*http://www.geeksforgeeks.org/equilibrium-index-of-an-array/
*/public class EquilibriumIndexOfArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int arr[] = {-7, 1, 5, 2, -4, 3, 0};
	
	int leftarray[]=new int[arr.length];
	int rightarray[]=new int[arr.length];
	
	int sum=0;
for(int i=0; i < arr.length;i++){
	sum+=arr[i];
	leftarray[i]=sum;
}
for(int o:leftarray){
	System.out.print(":"+o);
}

System.out.println("\n");

sum=0;
for(int i=arr.length-1 ; i > 0 ; i--){
	sum+=arr[i];
	rightarray[i]=sum;
}

for(int o:rightarray){
	System.out.print(":"+o);
}


for(int k=0 ; k < arr.length ; k++){

	if(k==0){
		continue;
	}
	else if(k==arr.length-1){
		continue;
	}
	else{
		if(leftarray[k-1]==rightarray[k+1]  ){
			System.out.println("index:"+k);
		}
		
	}
	
}

	
	}

}
	
