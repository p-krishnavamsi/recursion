//Palindromestring
public class Palindromestring{
    public static void print(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
public boolean palindrome(int n,String str){
    if(n>str.length()/2) return true;
    if(str.charAt(n)!=str.charAt(str.length()-n-1)) return false;
         return palindrome(n+1,str);

}
public static void main(String[] arg){
    Palindromestring p=new Palindromestring();
    String str=new String();
    str="madam";
    System.out.print(p.palindrome(0,str));
}
    }