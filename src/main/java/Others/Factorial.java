package Others;

  
public class Factorial {
   public static void main(String[] args) {
	   int A = 33;
	   Integer B = 33;
       System.out.println("Factorial of " + A + " is " + fact(A));
       System.out.println("Factorial of " + B + " is " + factInteger(B));
       System.out.println("Factorial of " + A + " is " + Integer.MAX_VALUE);
   }
   public static int fact(int A) {
       int ans = 1;
       for(int i=1; i<=A; i++) {
           ans = ans * i;
       }
       return ans;
   }
   public static int factInteger(int B) {
	   Integer ans = 1;
	   for(Integer i=1; i<=B; i++) {
		   ans = ans * i;
	   }
	   return ans;
   }
}