
public class BirthDay_Cake {
    public static void cake(int arr[])
    {
    	int count = 0;
    	int max = arr[0];
    	for(int i =0;i<arr.length;i++)
    	{
    		if(arr[i] > max)
    		{
    			max = arr[i];
    			
    		}
    		
    	}
    	for(int i =0;i<arr.length;i++)
    	{
    		if(arr[i] == max)
    		{
    			count++;	
    		}
    		
    	}
    	System.out.println(max);
    	System.out.println(count);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1,2,4,5,5};
      cake(arr);
	}

}
