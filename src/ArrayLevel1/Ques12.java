//WAP to accept N integers from user and find average of Even elements present in it.
package ArrayLevel1;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        int avg=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                avg+=arr[i];
                count++;
            }
        }
        System.out.println("Average of even number is "+ avg/count );
    }
   
}
