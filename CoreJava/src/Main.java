//  Test.java
class Main {
   // swap() doesn't swap i and j
   
   public static void main(String[] args) 
   {
	  
      System.out.println(fun(2));
      
   }
   
   public static int fun(int x)
   {
       int i, b = 0;
       for (i = 1; i <= x; i++) {
           b = b + i + fun(i - 1);
       }
       return b;
   }

}