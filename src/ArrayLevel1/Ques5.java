//WAP to assign some values in two arrays an merge them into third array.
package ArrayLevel1;

import java.util.Scanner;


public class Ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of First  array");
        int n1=sc.nextInt();
        int[] a=new int[n1];
        System.out.println("Enter elements of First array");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Size of Second array");
        int n2=sc.nextInt();
        int[] b=new int[n2];
        System.out.println("Enter elements of Second array");
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        int[] c=new int[n1+n2];
        System.arraycopy(a, 0, c, 0, n1);
        System.arraycopy(b, 0, c, n1, n2);
        System.out.println("Merged array is");
        for (int i = 0; i < (n1+n2); i++) {
            System.out.print(c[i]+ " ");
            
        }
}}
