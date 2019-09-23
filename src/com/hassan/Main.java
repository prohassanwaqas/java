package com.hassan;
import javax.swing.*;
import java.util.*;
public class Main {


    static int add(int m){
        final int nom = m ;
        return nom;
    }


    public static void main(String[] args) {
	// write your code here


        JOptionPane.showConfirmDialog(null , "Hello Buttt");
        String a = "Nom";

        System.out.println(a.charAt(2));
        System.out.println(add(90));

        int[] arr = new int[5];

        int nom[] = {1,2,3,4};






        String[] myStr = new String[5];

        Scanner number = new Scanner(System.in);

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter Value in Array " + i);
//            arr[i] = number.nextInt();
//        }
//
//        for (int j = 0 ; j <5 ; j++){
//            System.out.println("Array Values  " + arr[j]);
//        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Value in Array " + i);

            myStr[i] = number.nextLine();
        }

        for (int j = 0 ; j <5 ; j++){
            System.out.println("Array Values  " + myStr[j].toUpperCase());
        }





      //int  int a ,b ;
      //  String c ;
//
//        System.out.println("Enter Operator + - / * ");
//        Scanner oper = new Scanner(System.in);
//        c = oper.nextLine();
       // Scanner num1 = new Scanner(System.in);

       // System.out.println("Enter value");
//        for (int i = num1.nextInt(); i == num1.nextInt() ; i++) {
//
//            System.out.println("Value => " + i );
//
//        }


//        Scanner num2 = new Scanner(System.in);
//        System.out.println("Enter value 1 ");
//        a = num1.nextInt();
//        System.out.println("Enter value 1 ");
//        b = num2.nextInt();
//        switch (c){
//            case "+":
//                System.out.println("Result Add => " + add(a ,b));
//
//                break;
//            case "-":
//                System.out.println("Result Minus => " + minus(a ,b));
//
//                break;
//            case "/":
//                System.out.println("Result Divided => " + dvd(a ,b));
//
//                break;
//            case "*":
//                System.out.println("Result Multiple => " + multi(a ,b));
//
//                break ;
//            default:
//                System.out.println("Wrong Operator");
//        }

    }

    private  static int add(int a ,int b){

        return a+b;

    }private  static int multi(int a ,int b){

        return a*b;

    }private  static int minus(int a ,int b){

        return a-b;

    }private  static int dvd(int a ,int b){

        return a/b;

    }




}
