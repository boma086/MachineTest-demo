package Others;

  
public class Factorial2 {
   public static void main(String[] args) {
       int A = 280;
       int llen = 0;
       int[] res = fact(A);
       for (int re : res) {
           System.out.print(re);
           if(re!= 0) llen++;
       }
       System.out.println("----");
       System.out.println(llen);
   }
  
   public static int[] fact(int A) {
       int[] res = new int[1000];
       int len = 1; //present number of digits
       res[0] = 1; // adding 1 at 0 index
     
      // traversing from 2 to A
       for(int x=2; x<=A; x++) {
           int car = 0;
         // traversing the array from left to right
           for (int i = 0; i < len; i++) {
            //multiplying
               int fact = res[i] * x + car;
            //updating values
               res[i] = fact % 10;
               car = fact / 10;
           }
        // if carry is not 0
           while (car != 0) {
               res[len] = car % 10;
               car = car / 10;
               len++;
           }
       }
    //reversing the values to get the desired ones
       for(int i=0; i<len/2; i++) {
           int temp = res[i];
           res[i] = res[len-1-i];
           res[len-1-i] = temp;
       }
       return res;
   }
}