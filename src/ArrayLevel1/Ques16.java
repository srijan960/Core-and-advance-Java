//WAP to accept 10 integers in an array and display the non-repeating Array (eq- 1, 2 , 3, 5, 6, 7,
//2, 3 , 5)--- 1,6,7
package ArrayLevel1;

import java.util.Scanner;


public class Ques16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j&&arr[i]==arr[j]){
                flag=1;
                break;
                }
               else if(flag==00&&j==arr.length-1){
                   
                    System.out.println("Non repeating element is "+ arr[i]); 
                }
            }
        }
        
    }
}
