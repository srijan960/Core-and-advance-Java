//WAP to assign 10 numbers in an array and Sort it is ascending order using Selection sort
//technique.
package ArrayLevel1;

import java.util.Scanner;


public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length-1;i++){
            int minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }}
                    int temp=arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
                
            }
        
      System.out.println("Sorted array:");
            for(int item:arr){
                System.out.print(item+" ");
            }}}