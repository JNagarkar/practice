
public class mooresvoting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] checkarray={2,2,2,2,7,7,7,7,7,7};
		
		int count=0;
		int candidate=0;
		
		
		for(int i=0; i < checkarray.length;i++){
			
	
			if(count==0)
			{
				
				candidate=checkarray[i];
				count++;
			}
			else{
				
			int b=(candidate==checkarray[i])? count++ : count-- ;
								
			}
			
		}
		System.out.println(count);
		if(count == 0){
			System.out.println("none");
			
		}
		int k=0;
		for(int i=0; i < checkarray.length;i++){
			
			if(candidate==checkarray[i]){k++;}
		}
		
		if(k > checkarray.length/2){
			
			System.out.println("this"+candidate);
		}
		
		
		
		
		
		
	}

}
