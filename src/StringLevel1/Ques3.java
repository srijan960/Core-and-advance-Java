//WAP to accept a String and Count number of Capital letters present in it.(eq- ComPuter - 2)
package StringLevel1;

import java.util.Scanner;


public class Ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}
