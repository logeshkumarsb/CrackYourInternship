import java.util.Arrays;
import java.util.Scanner;

public class sort_colors {
    public static int[] sortColor(int[] arr){
            int low=0;
            int mid=0;
            int high=arr.length-1;
            while(mid<=high){
                if(arr[mid]==0){
                    int temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                }
                else if(arr[mid]==1){
                    mid++;
                }
                else if(arr[mid]==2){
                    int temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                    high--;
                }
            }
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
            System.out.println(Arrays.toString(sortColor(arr1)));
        }
    }
}
