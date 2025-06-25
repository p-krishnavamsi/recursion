public class FunctionalRecursion{
    public void print(int n,int sum){
      
        if(n==1){
             System.out.println(sum);
                return;
        }
       print(n-1,sum+n);
        
    }
    public static void main(String[] args){
        FunctionalRecursion x=new FunctionalRecursion();
        int n=10;
        x.print(n,0);
    }
}