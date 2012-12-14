
 public class ProjectEuler2 { 

   public static void main(String[] args) { 

     long stopValue = 4000000;
     long x         = 0;
     long result    = 0;
     int y          = 0;  

     while ( x < stopValue) {

       x = fib(y); 

       if ( x % 2 == 0) { 

         result += x; 

       }

       y++;

     } 

     System.out.println(result);

   } //endMain

   public static long fib(int n) { 
 
     if ( n <= 1 ) 
       return n; 
     else 
       return fib(n-1) + fib(n-2); 

   }

 } //endClass
            
