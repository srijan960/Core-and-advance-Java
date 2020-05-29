//	WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name (eq- Amar Kumar Singh-   A.K.S)
package StringLevel1;

import java.util.Scanner;


public class Ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name, Second Name and Last name seperated by spaces ");
        String F=sc.next();
        String M=sc.next();
        String L=sc.next();
        System.out.println(F.charAt(0)+"."+M.charAt(0)+"."+L.charAt(0));
        
    }
  
}
