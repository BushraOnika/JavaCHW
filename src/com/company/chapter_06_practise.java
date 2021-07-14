package com.company;

import java.util.Scanner;

public class chapter_06_practise {
    public static void main(String[] args) {

//           //ques 1
//        float[] arr = {3.4f, 1.3f, 3.5f, 2.5f, 6.0f};
//        float sum = 0f;
//      //  for (int i = 0; i < arr.length; i++)
//        //sum += arr[i];
//        for (float element : arr){
//            sum += element;
//        }
//        System.out.println(sum);

        // ques 2
//
//        int [] arr ={4,6,7,8,120};
//        Scanner b= new Scanner(System.in);
//        System.out.println("ENTER the number ");
//        int n = b.nextInt();
//        int count=0;
//        for(int a : arr){
//            if(a==n){
//                count++;
//                break;
//            }
//        }
//        if(count>0){
//            System.out.println("\t the element is present");
//        }
//        else
//            System.out.println("\t the element is Not present");
//
           // ques 3
//
//        float[] arr = {3.4f, 1.3f, 3.5f, 2.5f, 6.0f};
//        float sum = 0f;
//      //  for (int i = 0; i < arr.length; i++)
//        //sum += arr[i];
//        for (float element : arr){
//            sum += element;
//        }
//        System.out.println("THE AVG of the MARKS is  " +sum/arr.length);
//
//
           // ques 4
        int [][] arr = {{1,2,3},{4,5,6}};
        int [][] arr1 ={{5,9,13},{8,7,5}};
        int[][] result= new int[2][3];
       // int sum =0;
        for (int i = 0; i<arr.length;i++){
            for (int j =0;j< arr1[i].length;j++){
                result[i][j]=arr[i][j]+arr1[i][j];
                System.out.print("\t" +result[i][j]);
            }
            System.out.println(" ");
        }
     ///System.out.println(sum);
        // ques 5


   }
}
