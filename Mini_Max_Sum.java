
public class Mini_Max_Sum {
    
	static void miniSum(int arr[])
	{
		//int min = 0;
		long max = 0;
		long min = arr[0];
		long minSum = 0;
		long sum = 0;
		long maxSum = 0;
		for(int i = 0;i<arr.length;i++)
		{
		   if(arr[i] > max)
		   {
			   max = arr[i];
		   }
		   if(arr[i] < min)
		   {
			   min = arr[i];
		   }
		   sum = sum +arr[i];
		   minSum = sum-max;
		   maxSum = sum -min;
		   
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(sum);
		System.out.println(minSum +" "+ maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,2,3,4,5};
       miniSum(arr);
	}

}
