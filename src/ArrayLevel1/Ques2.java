//WAP to accept an Array input from an User. and find the Average of Numbers of each array.
package ArrayLevel1;

import java.util.Scanner;


public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of array");
        int avg=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            avg+=a[i];
        }
        avg=avg/n;
        System.out.println("Average is: "+ avg);
    }
}
