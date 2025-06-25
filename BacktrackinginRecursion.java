/*public class BacktrackinginRecursion{
    public void print(int i,int n){
        if(i<1) return;
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        BacktrackinginRecursion x=new BacktrackinginRecursion();
        int n=10;
        x.print(n,n);
    }
}*/
public class BacktrackinginRecursion{
    public void print(int i,int n){
        if(i>n) return;
        print(i+1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args){
        BacktrackinginRecursion x=new BacktrackinginRecursion();
        int n=10;
        x.print(1,n);
    }
}