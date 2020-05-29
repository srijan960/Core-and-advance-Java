//	WAP to accept  word and check if it is palindrome
package StringLevel1;

import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        int i=0,j=s.length()-1;
        int flag = 0;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j)){
                 flag=1;
                break;
            }
            i++;
            j--;
        }
        if(flag!=1){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Palindrom");
        }
    }
    
}
