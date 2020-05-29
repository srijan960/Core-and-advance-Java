
//WAP to accept a string and count number of Words Present in it.(eq- Amar  Singh-- 2)

package StringLevel1;

import java.util.Scanner;


public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
        s=s.trim();
        int count=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {count++;
        }
    }
        System.out.println("Mumber of words are: "+count);
}}
