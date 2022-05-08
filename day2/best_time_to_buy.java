import java.util.Scanner;

public class best_time_to_buy {
 public static void Solve(int[] market){
     int min=market[0];
     int max=Integer.MIN_VALUE;
     for(int i=1;i<market.length;i++){
         if(min>market[i]){
             min=market[i];
         }
         else{
             max=Math.max(max, market[i]-min);
         }
     }
     System.out.println(max);
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
     Solve(arr);
 }   
}
