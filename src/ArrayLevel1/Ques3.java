//WAP to accept an Array to accept a Month number and Display the numbr of days that months
//has.(Eq- March- 31)
package ArrayLevel1;

import java.util.Scanner;


public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        System.out.println("Enter Month number");
        int n=sc.nextInt();
        
        if(n>=1&&n<=12){
            if(n==1||n==3||n==5||n==7||n==8||n==10||n==12){
                System.out.println("Number of days in "+a[n-1]+ " is "+ 31);
            }
            else if(n==2){
                System.out.println("Number of days in "+a[n-1]+" is "+28+ "or(leap year}"+ 29);
            }
            else{
                System.out.println("Number of days in "+a[n-1]+" is "+30);
            }
                
        }

        
        
        
        
    }
    
}
