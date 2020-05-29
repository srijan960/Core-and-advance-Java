//WAP to accept a string and count number of Vowels present in it
package StringLevel1;

import java.util.Scanner;


public class Ques4 {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {  count++;
        }
    }
        System.out.println("Number of vowels is: "+count );
}}
