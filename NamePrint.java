public class NamePrint{
    public static void print(int i,int n){
        if(i>n) return;
        System.out.println("krish ");
        print(i+1,n);
    }
    public static void main(String [] args){
        int n=5;
        print(1,n);
    }}