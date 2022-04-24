package com.bridgelabz;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int arr[] =new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3,4,5,5};
        /*
        i loop is for selecting an elements
        j loop is for comparing the elements
         */
        for (int i= 0; i<arr.length; i++){
            for (int j=i+1;j<arr.length;j++)
            {
                //check then elements
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
