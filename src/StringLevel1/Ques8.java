//	WAP to accept a String and Convert the case of each alphabet present in it.
package StringLevel1;

import java.util.Scanner;


public class Ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                ch=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                ch=Character.toUpperCase(ch);
            }
            System.out.print(ch);
        }
            
    }
    
}
