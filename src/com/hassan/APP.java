package com.hassan;


import java.util.Arrays;
import java.util.Scanner;
public class APP {

    public static void main(String[] args) {
        int[] myArr ={1,2,3,4};

        myArr[3] = 30;

//        for (int i = 0; i <myArr.length ; i++) {
//
//            System.out.println(myArr[i]);
//        }

        int arr[] = new int[6];

        int myFirst = arr[5];

        Scanner num = new Scanner(System.in);
        for (int j = 0; j <arr.length ; j++) {
            System.out.println("ENter value");
            arr[j]  = num.nextInt();

        }
        Arrays.sort(arr);

        for (int h = 0; h <arr.length ; h++) {
            System.out.println("Array result "+ arr[h]);
        }

        System.arraycopy(arr , 0 , myFirst , 3 , 2);


        for (int w = 0; w <4 ; w++) {
            System.out.println(myFirst);
        }




    }
}
