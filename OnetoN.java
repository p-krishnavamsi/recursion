public class OnetoN{
    public void print(int i,int n){
        if(i<1) return;
        System.out.println(i);
        
        print(i-1,n);
    }
    public static void main(String[] args){
        OnetoN x=new OnetoN();
        int n=10;
        x.print(n,n);
    }
}