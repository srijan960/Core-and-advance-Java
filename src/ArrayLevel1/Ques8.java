//WAP to accept 10 numbers in an array and search a given number, if the number exists display
//its position (index) else display a suitable message.(Binary Search)
package ArrayLevel1;

import java.util.Scanner;

public class Ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter  number in  array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search");
        int key=sc.nextInt();
        int first=0;
        int last=(arr.length-1);
        int mid=(first+last)/2;
        while(first<=last){
            if(arr[mid]<key){
                first=mid+1;
            }
            else if(arr[mid]==key){
                System.out.println("Elements found at index: "+mid);
                break;
            }
            else{
                last=mid-1;
            }
            mid=(first+last)/2;
        }
        if(first>last){
            System.out.println("Element not found");
        }
    }
    }
