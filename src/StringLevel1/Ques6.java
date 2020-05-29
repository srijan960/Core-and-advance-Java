//WAP of Java String Comparison 2 String
package StringLevel1;

import java.util.Scanner;


public class Ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String");
        String a=sc.nextLine();
        System.out.println("Enter Second String");
        String b=sc.nextLine();
        if(a.endsWith(b))
        {System.out.println("String matches");
        
        }
        else{
            System.out.println("String does no match");
        }
        
                
                
    }
    
}
