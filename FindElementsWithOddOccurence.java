import java.util.HashMap;


public class findelementwithoddoccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] checkarray={300,300,300,300};
		
		System.out.println("this:"+(328^300));
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();

		int result=0;
		for(int i=0 ; i < checkarray.length; i++){

			int temp=result;
			
	//	System.out.println(Integer.toBinaryString(""+checkarray[i]));
	//	System.out.println(Integer.toBinaryString(result));
	//	System.out.println("\n");
		result=result ^ checkarray[i];
		System.out.println(""+checkarray[i]+" XORED with:"+temp+" gives : "+result);
		}

		System.out.println(result);

	
	for (int i=0; i < checkarray.length ; i++){
			if(!hm.containsKey(checkarray[i])){
				hm.put(checkarray[i], 1);
			}
	
			else{
				int count=hm.get(checkarray[i]);
				hm.put(checkarray[i], count+1);
				
			}
			
	}
	
	
	for(int i=0; i < checkarray.length; i++){
		if(hm.containsKey(checkarray[i]) && hm.get(checkarray[i]) % 2 !=0){
	//		System.out.println(checkarray[i]);
		}
		
	}
	
	
	
	
	
	
	
	}
}
