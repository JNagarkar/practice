import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class mergingoftwoarrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int none=-1;
		int[] mplusn={1,2,none,4,none,8,none,10,11,none,14};
		
		int[] n={3,7,9,13};

		int j=mplusn.length-1;
		System.out.println(j);
		for(int i=(mplusn.length-1); i >=0  ; i-- ){

		if(mplusn[i]!=none){
			mplusn[j]=mplusn[i];
			j--;
							}	
			
		}
		
		for(Integer items: mplusn){			System.out.println(items);
}
		
	
		
		for(int i=0; i < mplusn.length  ; i++ ){
	
		
		}	
		
		
		
		
	}

}
