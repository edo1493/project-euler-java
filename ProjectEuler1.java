
 public class ProjectEuler1 { 

   public static void main(String[] args) { 

     long result  = 0; 
     int counter  = Integer.parseInt(args[0]);

     for ( int x = 0; x < counter; x++) { 

       if ( (x % 3 == 0) || (x % 5 == 0) ) { 

         result += x; 

       }

     }

     System.out.println("The result is " + result); 

   } //endMain

 } //endClass
