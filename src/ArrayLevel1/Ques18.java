//WAP to accept 10 integers in an array and display the frequency of each Distinct element.
//(eq- 5,5,6,7,7,8,9,1)--- 5,6,7,8,9,1
package ArrayLevel1;

import java.util.Scanner;


public class Ques18 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
          int count=1;
            for(int j=0;j<arr.length;j++){
              if(i!=j&&arr[i]==arr[j]){
                  count++;
              }
              if(j==arr.length-1){
                  System.out.println("Frequesncy of "+ arr[i]+" is "+ count);
              }
          }
            
        }
    }
}
