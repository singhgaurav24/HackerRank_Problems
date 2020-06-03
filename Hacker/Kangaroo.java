
public class Kangaroo {
     
	static String kangaroo(int x1, int v1, int x2, int v2) {
		
		
		int sum1 = x1;
		int sum2 = x2;
		String s1 = "YES";
		String s2 = "NO";
		if(x2>x1 && v2>v1)
		{
			return s2;
		}
        for(int i = 0; i < 10000 ; i++)
        {
        		sum1 += v1;
        		sum2 += v2;
        		if(sum1 == sum2)
            	{
            		return s1;
            	}  	
        }
        return s2;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x1 = 2,x2=1,v1=1,v2=2;
        String s = kangaroo(x1,v1,x2,v2);
        System.out.println(s);
        
	}

}
