//WAP to accept an Array input from an User. and find the Sum of Numbers of each array.
package ArrayLevel1;

import java.lang.reflect.Array;
import java.util.Scanner;


public class Ques1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int[] a=new int[n];
    System.out.println("Enter elements of array");
    int sum=0;    
    for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
             sum+=a[i];
        }
        System.out.println("Sum of array: "+sum );
}}
