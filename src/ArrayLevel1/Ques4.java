//WAP to assign a set of numbers in an Array and display it is Reverse.
package ArrayLevel1;

import java.util.Scanner;


public class Ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=(a.length-1);i>=0;i--){
            System.out.println("Reverse is "+a[i]);
        }
}}
