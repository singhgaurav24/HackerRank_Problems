import java.util.Scanner;
public class Grading_Students {
   static void marks(int grade)
   {
	   if(grade <= 40)
	   {
		   System.out.println(grade);
	   }
	   if(grade > 40)
	   {
		   int n = grade % 5;
		   int m = grade - n + 5;
		   //System.out.println(m);
		   int x = m-grade;
		   System.out.println(x);
		   if(x<3)
		   {
			   System.out.println(m);
		   }
		   else {
			   System.out.println(grade);
		   }
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc  = new Scanner(System.in);
         System.out.println("Enter marks");
         int grade = sc.nextInt();
         marks(grade);
         }

}
