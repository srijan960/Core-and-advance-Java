//WAP to accept N integers from user and Count how many of them are positive.
//(eq- 1, -3, 4, 7, -10)= 2
package ArrayLevel1;

import java.util.Scanner;


public class Ques11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                count++;
            }
        }
        System.out.println("Negative numbers are "+count );
    }
}
