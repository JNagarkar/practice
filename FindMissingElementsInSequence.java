
public class findmissingelementinasequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arrayl={7,2,3,4,5,6,1,8,10};
		
		int max=0;
		int min=arrayl[0];
		
		
		for(int i=0; i < arrayl.length ;i++)
		{
		if(arrayl[i] > max){
			max=arrayl[i];
		}
		if(arrayl[i] < min){
			min=arrayl[i];
			}
		}
		
		int firstxoredinput=0;
		for(int i=0; i < arrayl.length ;i++)
		{
		
		firstxoredinput=firstxoredinput ^ arrayl[i];
		}
		int secondxoredinput=0;
		for(int i=min; i < max ;i++)
		{
		
		secondxoredinput=secondxoredinput ^ i;
		}
		
		
		System.out.println(secondxoredinput^firstxoredinput);
		
		
		
		
		
		
		
	}

}
