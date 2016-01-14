
public class longestpossiblesubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] checkarray={-2,-3,4,-1,-2,1,5,-3};

		int somethingmax=0;
		int sum=0;
		int previous=0;
		int minimumsofar=0;
		for(int i=0; i < checkarray.length;i++)
		{
		
		sum=sum+checkarray[i];
		if(sum < 0){
			sum=0;
		}
		
		if(sum > somethingmax){
			somethingmax=sum;
		}
//		System.out.println(sum);
			}
		
		System.out.println(somethingmax);
		
		
			}

}
