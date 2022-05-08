import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class removeDupfromSortedArray {
    public static int[] removeDupfromSortedArray1(int[] arr){
        ArrayList<Integer> temp=new ArrayList<>();
        int prev=-1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]&&arr[i]!=prev){
                 temp.add(arr[i]);
                 prev=arr[i];
            }
            if(i==arr.length-2){
                System.out.println(arr[i]+" "+prev);
                if(arr[i]!=arr[i+1]){
                    temp.add(arr[i+1]);
                }
            }
            else{
                prev=arr[i];
            }
        }     
        int[] ans=new int[temp.size()];
             int count=0;
             for(int i:temp){
                 ans[count++]=i;
             }
             arr=ans;
             return arr;     
        // return 
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test_case=input.nextInt();
        while(test_case-->0){
            System.out.println("Enter the size of the Array");
            int size=input.nextInt();
            var arr1=new int[size];
            for(int i=0;i<size;i++){
                System.out.println("Enter the element:");
                arr1[i]=input.nextInt();
            }
            System.out.println(Arrays.toString(removeDupfromSortedArray1(arr1)));
        }
    }
}
