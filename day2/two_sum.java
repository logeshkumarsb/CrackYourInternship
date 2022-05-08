import java.util.Arrays;
import java.util.Scanner;
public class two_sum {
    public static void Solve(int[] arr,int ansSum){
        Arrays.sort(arr);
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int sum=arr[s]+arr[e];
            if(sum==ansSum){
                System.out.println("Found");
                return;
            }
            else if(sum<ansSum){
                s++;
            }
            else{
                e--;
            }
        }
        System.out.println("Not found!");
    }
    public static void Solve2(int[] arr,int ansSum){
        int close=Integer.MAX_VALUE;
        int closeans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==ansSum){
                    System.out.println("Found! ans");
                    return;
                }
                else{
                      if(close>Math.abs((arr[i]+arr[j])-ansSum)){
                         close=Math.abs((arr[i]+arr[j])-ansSum);
                         closeans=arr[i]+arr[j];
                      }
                }
            }
        }
        System.out.println(closeans);
    }
    public static void Solve3(int[] arr,int ansSum){
         Arrays.sort(arr);
         int s=0;
         int e=arr.length-1;
         int close=Integer.MAX_VALUE;
         int closeans=Integer.MAX_VALUE;
         while(s<e){
             int sum=arr[s]+arr[e];
             if(sum==ansSum){
                 System.out.println("Found!");
                 return;
             }
             else{
                if(close>Math.abs((arr[s]+arr[e])-ansSum)){
                    close=Math.abs((arr[s]+arr[e])-ansSum);
                    closeans=arr[s]+arr[e];
                 }
                 s++;
                 e--;
             }
         }
         System.out.println(closeans);
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
     Solve2(arr, ansSum);
     Solve3(arr, ansSum);
    }
}