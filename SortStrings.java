package Strings;

import java.util.Scanner;
public class SortStrings{

    int n;
    String[] arr = new String[20];

    public void getData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of Strings");
        n = in.nextInt();
        System.out.println("Enter the Strings");
        for(int i=0;i<n;i++){
            arr[i] = in.next();
        }
    }

    public void printData(){
        System.out.println("\nDisplaying the Strings");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public void SortAlpha(){
        for(int i=0;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if(arr[i].compareTo(arr[j]) > 0){
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}




