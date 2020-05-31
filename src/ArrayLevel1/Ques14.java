//WAP to accept N integers from user and find the Second largest/Second Smallest element.
package ArrayLevel1;

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        int Largest=Integer.MIN_VALUE;
        int Smallest=Integer.MAX_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        int SecondSmallest=Integer.MAX_VALUE;
        for( int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>Largest){
                SecondLargest=Largest;
                Largest=arr[i];
            }
             else if(arr[i] > SecondLargest){
                SecondLargest=arr[i];
            }
            if(arr[i]<Smallest){
                SecondSmallest=Smallest;
                Smallest=arr[i];
            }
            else if(arr[i]< SecondSmallest){
                SecondSmallest=arr[i];
            }
            }
            System.out.println("Largest element is "+ Largest);
            System.out.println("Smallest element is "+ Smallest);
            System.out.println("Second Largest element is "+ SecondLargest);
            System.out.println("Second Smallest element is "+ SecondSmallest);
            
        }
    }

