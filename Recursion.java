public class Recursion{
    int count=0;
public void print(){
    if(count<3){
        System.out.print("hi ");
        count++;
    print();}
    
}
    public static void main(String[] args){
        Recursion r=new Recursion();
        r.print();
    }
}