//13.	WAP to accept two strings and tell which comes later in lexicographics order(dictionary order). If equal how appropriate message.
package StringLevel1;

import java.util.Scanner;


public class Ques13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings");
        String a=sc.nextLine();
        String b=sc.nextLine();
        if(a.compareToIgnoreCase(b)>0){
            System.out.println("First string comes first in lexicographics order ");
        }
        else if(a.compareToIgnoreCase(b)<0){
            System.out.println("Second string comes first in lexicographic order");
        }
        
    }
}
