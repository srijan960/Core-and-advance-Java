//WAP to accept 5 numbers in an array and search a given number. If the number exists display its
//frequency else display a suitable message.
package ArrayLevel1;

import java.util.Scanner;


public class Ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("Enter five elements ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        System.out.println("Enter number to search for");
        int s=sc.nextInt();
        for(int i=0;i<a.length;i++){
           if(a[i]==s){
               count++;
           }
        }
        if(count==0){
            System.out.println("Number does not exist ");
        }
        else{
            System.out.println("Number exist and its frequency is "+count);
        }
    }
    
}
