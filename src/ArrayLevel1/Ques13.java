//WAP to accept N inetegers from user and find the Largest/Smallest element in an array.
package ArrayLevel1;

import java.util.Scanner;


public class Ques13 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        int LargestIndex=0;
        int SmallestIndex=0;
        for( int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>arr[LargestIndex]){
                LargestIndex=i;
            }
            if(arr[i]<arr[SmallestIndex]){
                SmallestIndex=i;
            }
        }
        System.out.println("Largest element is "+arr[LargestIndex]);
        System.out.println("Smallest element is "+arr[SmallestIndex]);
    }
}
