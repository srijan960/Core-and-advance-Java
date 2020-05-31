//WAP to assign 10 integers in an array and extract the even element into another array.
package ArrayLevel1;

import java.util.Scanner;


public class Ques17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] even=new int[n];
        System.out.println("Enter  number in  array");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even[i]=arr[i];
                System.out.println("Even array is "+ even[i]+ " ");
            }
            
                     
        }
        
    }
}
