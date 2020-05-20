
public class Plus_Minus {
    static void plusMinus(int arr[])
    {
    	int n = arr.length;
    	int pos = 0;
    	int neg = 0;
    	int zero = 0;
    	for(int i =0;i<n;i++)
    	{
    		if(arr[i] > 0)
    		{
    			pos++;
    		}
    		if(arr[i] < 0)
    		{
    			neg++;
    		}
    		if(arr[i] == 0)
    		{
    			zero++;
    		}
    	}
    	   double posRatio = (double)pos/(double)(n);
    	   double negRatio = (double)neg/(double)n;
    	   double zeroRatio = (double)zero/(double)n;
    	   System.out.println(n);
    	   System.out.format("%.6f\n" , posRatio );
    	   System.out.format("%.6f\n" , negRatio);
    	   System.out.format("%.6f\n" , zeroRatio);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1,-5,-2,0,7,3};
      plusMinus(arr);
	}

}
