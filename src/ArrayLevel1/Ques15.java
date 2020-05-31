//WAP to find the Prime numbers present in a predefined integer array.
package ArrayLevel1;

import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            int num=arr[i];
            for(int j=2;j<=num/2;j++){
                int flag=0;
                if(num%j==0){
                    System.out.println(num +" is not prime");
                     flag=1;
                    break;
                }
            if(flag==0&&j==num/2){
                System.out.println(num + " is prime");
               
            }}
            
             
        }
      
        }
    }

