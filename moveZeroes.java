import java.util.Arrays;

import javax.naming.spi.StateFactory;

public class moveZeroes {
    public static int[] moveZ1ero(int[] arr){
        int n=arr.length;
        while(n-->0){
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]==0){
                 int temp=arr[i+1];
                 arr[i+1]=arr[i];
                 arr[i]=temp;
             }
        }
       }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,3,1,0,3};
        System.out.println(Arrays.toString(moveZ1ero(arr)));
    }
}
