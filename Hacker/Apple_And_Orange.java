
public class Apple_And_Orange {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges)
	{
	    
	    int countapple = 0;
	    int countorange = 0;
	    for(int i = 0 ;i<apples.length;i++)
	    {
	    	if((apples[i] + a) >= s && (apples[i] + a)<=t)
	    	  countapple++;
	    }
	    for(int i = 0 ;i<oranges.length;i++)
	    {
	    	if((oranges[i] + b) >= s && (oranges[i] + b) <= t)
	    		countorange++;
	    }
	   
	    System.out.println(countapple);
	    System.out.println(countorange);
	   
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int s = 7;
     int t = 10;
     int a =  4;
     int b = 12;
     int[] apples = {2,3,-4};
     int[] oranges = {3,-2,-4};
     countApplesAndOranges(s,t,a,b,apples,oranges);
	}

}
