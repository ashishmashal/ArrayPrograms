package com.bridgelabz;

public class ArrayPositions{
    public static void main(String[] args) {
        //Initializing an array
        int []arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        //loop for positions and element locations
        for (int i=0;i<arr.length;i++) {
            /*
            arr[i] for element
            and i is for position
             */
            System.out.println("Array elements are " + arr[i] + "Potions Are " + i);

        }
    }
}
