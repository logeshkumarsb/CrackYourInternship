import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
class sduplicate{
    //my solution
    public static int[] RemoveDuplicates(int[] arr){
             ArrayList<Integer> without=new ArrayList<>();
             int[] hash=new int[100000];
             for(int i=0;i<arr.length;i++){
                 hash[arr[i]]++;
             }
             for(int i=0;i<arr.length;i++){
                 if(hash[arr[i]]==1){
                     without.add(arr[i]);
                 }
             }
             int[] ans=new int[without.size()];
             int count=0;
             for(int i:without){
                 ans[count++]=i;
             }
             arr=ans;
             return arr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int test_case=input.nextInt();
        while(test_case-->0){
            System.out.println("Enter the size of the Array");
            int size=input.nextInt();
            int[] arr1=new int[size];
            for(int i=0;i<size;i++){
                System.out.println("Enter the element:");
                arr1[i]=input.nextInt();
            }
            System.out.println(Arrays.toString(RemoveDuplicates(arr1)));
        }
    }
}