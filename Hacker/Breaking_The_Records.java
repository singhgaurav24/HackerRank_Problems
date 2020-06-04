
public class Breaking_The_Records {
	static int[] breakingRecords(int[] scores)
	{
		int maxScore = 0;
		int maxvalue = scores[0];
		int minScore = 0;
		int minvalue = scores[0];
		int[] arr = new int[2];
		for(int i = 1 ; i<=scores.length-1 ; i++)
		{
			
			if(scores[i]>maxvalue)
			{
				maxScore++;
			    maxvalue = scores[i];
			} 
			if(scores[i]<minvalue)
			{
				minScore++;
				minvalue= scores[i];
			}
		}
//		System.out.println(maxScore + " "+ maxvalue);
//		System.out.println(minScore + " "+ minvalue);
		
		arr[0] = maxScore;
		arr[1] = minScore;
		
		return arr;


    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {10,5, 20, 20, 4 ,5, 2, 25, 1};
		breakingRecords(scores);
		
		
	}

}
