public class Fibbinoici{
    public static void fibi(int n,int a,int b){
        if(n==0) return; 
            System.out.print(a+" ");
            int res=a+b;
            fibi(n-1,a=b,b=res);
    }
    public static void main(String[] args){
       // Fibbinoici f=new Fibbinoici();
        int n=6;
        int a=0;
        int b=1;
        fibi(n,a,b);
        //System.out.print(res);
    }
}