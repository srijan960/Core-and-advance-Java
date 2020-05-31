//WAP to assign 10 numbers in an array and Sort it is ascending order using Bubble sort
//technique.
package ArrayLevel1;

import java.util.Collections;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;


public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length-1;i++)
        {for(int j=0;j<arr.length-i-1;j++){
            if(arr[j+1]<arr[j]){
               int temp=arr[j+1];
               arr[j+1]=arr[j];
               arr[j]=temp;
            }
        }}
            System.out.println("Sorted array:");
            for(int item:arr){
                System.out.print(item+" ");
            }
            
        }
        
         
    }

