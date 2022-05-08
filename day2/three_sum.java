import java.util.Arrays;
import java.util.Scanner;

public class three_sum {
    public static void Solve(int[] arr,int ansSum){
       Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
           int s=i+1;
           int e=arr.length-1;
           while(s<e){
               int sum=arr[s]+arr[e];
               if(sum==ansSum){
                   System.out.println("found");
                   return;
               }
               else if(sum<ansSum){
                 s++;
               }
               else{
                 e--;
               }
           }
       }
       System.out.println("Not Found!");
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elment of the array:");
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the sum");
        int ansSum=input.nextInt();
        Solve(arr,ansSum);                
    }
}
