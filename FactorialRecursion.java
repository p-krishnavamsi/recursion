public class FactorialRecursion{
     static int factorial(int n){
        
            // Base Condition.
            if(n == 0){
                
                return 1;
            }
            
            // Problem broken down into 2 parts and then combined.
            return n * factorial(n-1);
            

    }
    public static void main(String[] args) {

       // Here, let’s take the value of n to be 3.
       int n = 0;
       System.out.println(factorial(n));
    }
}