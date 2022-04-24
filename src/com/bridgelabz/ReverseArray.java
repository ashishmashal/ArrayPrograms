package com.bridgelabz;

public class ReverseArray {
    public static void main(String[] args) {
        //Initializing an array
        int arr[] =new int[]{10,20,30,40,50};
        //loop for printing original array
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("original array "+ arr[i] + "" );
        }
        System.out.println("reverse order ");
        /*loop for printing reverse array
        for storing max no position of an array j =arr.length-1
        checking the element if it is grater than 0
        decrement the j
        */
        for (int j =arr.length-1; j>=0; j--)
        {
            System.out.println("Reverse array is "+ arr[j] + "");
        }
    }
}
