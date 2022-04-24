package com.bridgelabz;

public class MinNoInArray {
    public static void main(String[] args) {
        //Initializing an array

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 90;
        arr[3] = 70;
        arr[4] = 05;
        //Assigning min with the 1st element of array
        int min = arr[0];

        //used for loop for checking max in array
        for (int i = 0 ; i<arr.length ; i++)
        {
            //Comparing elements of array with min
            if(arr[i]<min)
                min = arr[i];
        }
        //printing the min no in the array
        System.out.println("Largest No in Array IS " + min);
    }
}
