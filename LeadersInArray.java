
public class leadersinarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] check={16,17,4,3,5,2};
		int max_candidate=0;
		int current_max=0;
		for(int i=check.length-1;i > 0 ; i --){
		
		if (check[i] > current_max)
			{System.out.println(check[i]);
				current_max=check[i];
			}	else
			System.out.println();;
			
		}

	}

}
