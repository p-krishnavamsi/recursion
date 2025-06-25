import java.util.*;
public class ReverseArray{
    public static void print(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int i,int arr[],int n){
            if(i>=n/2) return;
                int temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            
            swap(i+1,arr,n);
    }
    public static void main(String[] args){
        
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int [] arr=new int[n];
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
            }
            swap(0,arr,n);
            print(n,arr);
    }
}