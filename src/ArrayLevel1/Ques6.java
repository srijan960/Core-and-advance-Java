//WAP to accept 10 numbers in an array and search a given number, if the number exists display
//its position (index) else display a suitable message.(Linear Search)
package ArrayLevel1;

import java.util.Scanner;


public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.println("Enter Number");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Number to search for");
        int s=sc.nextInt();
        for (int i = 0; i <a.length; i++) {
            if(a[i]==s){
                System.out.println("Number found at "+(i+1));
                break;
            
        }
            if(i==(a.length-1)){
                System.out.println("Element not found");
            }
        }  
        
        
    }
}
