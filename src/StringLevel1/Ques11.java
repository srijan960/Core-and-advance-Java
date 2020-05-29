//	WAP to accept a word and convert it to piglatin form(trouble --- oubletray)
package StringLevel1;

import java.util.Scanner;


public class Ques11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter nay string");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {System.out.println(s.substring(i)+s.substring(0, i)+"ay");
            }
        }
    }
  
}
