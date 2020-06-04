
public class Divisible_Sum_Pairs {
	 static int divisibleSumPairs(int n, int k, int[] ar)
	 {
         //n = ar.length;
         //int sum = 0;
         int count =0;
         for(int i = 0 ; i<n-1 ;i++)
         {
        	for(int j = i+1 ;j<n;j++)
        	{
        		int sum = ar[i]+ar[j];
    			if(sum%k==0)
    			{
    				count++;
    			}
//        		if(ar[i]<ar[j])
//        		{
//        			int sum = ar[i]+ar[j];
//        			if(sum%k==0)
//        			{
//        				count++;
//        			}
//        		}
        	}

         }
         return count;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
      int ar[] = {1,3,2,6,1,2};
      int n = ar.length;
      int res = divisibleSumPairs(n,3,ar);
      System.out.println(res);
	}

}
