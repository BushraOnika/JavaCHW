import java.util.Random;
import java.util.Scanner;

public class chapter_4_practise {
    public static void main(String[] args) {
        // question 1 chapter 4
        /*int a= 10;
        if(a=11){
            System.out.println("im 11");
        }
        else
            System.out.println("im not 11");

         */
        /* question 2 chap 4
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the 1st subject number ");
        float mark1 = a.nextFloat();
        System.out.println("Enter the 2nd subject number ");
        float mark2 =a.nextFloat();
        System.out.println("Enter the 2nd subject number ");
        float mark3 =a.nextFloat();
        float avg = (mark1+mark2+mark3)/3f;
        if(avg>=40 && mark1>=33 && mark2 >=33 && mark3>=33){
            System.out.println("You are passed!!!");
        }
        else
            System.out.println("Sorry!You Are not passed");

         */
        // question 3 chap 4
      /*  float tax =0;
        float income = 3.3f;
        if (income<2.5){
            tax = 0;
        }
        else if (income>2.5f && income <5f){
            tax = tax + 0.05f *(income-2.5f);
        }
        else if (income>5f && income <10f){
            tax = tax + 0.05f *(5.0f-205f);
            tax = tax +0.2f*(income - 2.5f);
        }
        else if (income>10f){
            tax = tax + 0.05f *(5.0f-2.5f);
            tax = tax +0.2f*(10f -5f);
            tax  = tax +.3f*(income-10f);

        }
        System.out.println(" tax is "+ tax);

       */
        // ques 4
       /*Scanner a = new Scanner(System.in);
        int day = a.nextInt();
        switch (day){
            case 1 ->{
                System.out.println("MONDAY");
            }
            case 2 ->{
                System.out.println("TUESDAY");
            }
            case 3 ->{
                System.out.println("WEDNESDAY");

            }
            case 4 ->{
                System.out.println("THRUSDAY");

            }
            case 5 ->{
                System.out.println("FRIDAY");
            }
            case 6 ->{
                System.out.println("SATURDAY");
            }
            case 7->
                System.out.println("SUNDAY");
        }

        */
       // ques 5 chapter 4
        /*Scanner a = new Scanner(System.in);
        int year = a.nextInt();
        if (year%400==0 && year%100==0)
        {
            System.out.println("IT IS A " + year +"  LEAP YEAR");
        }
        else
            System.out.println("IT IS NOT A leAP year");

         */
     // ques 6 chapter 4
        /*Scanner a= new Scanner(System.in);
        System.out.println("\tENTER the website to  find out the ype of the website from the URL");
        String website = a.next();
        if(website.endsWith(".com")){
            System.out.println("\tIT IS A COMMERCIAL WEBSITE!!");
        }
        else if(website.endsWith(".org")){
            System.out.println("\tIT IS A ORGANIZED WEBSITE!!");
        }
        else if(website.endsWith(".in")){
            System.out.println("\tIT IS A INDIAN WEBSITE!!");
        }
        else
            System.out.println("YOU HAVE NOT PUT A VALID WEBSITE!!");



         */
        Random r = new Random();
        int ran = r.nextInt();
        System.out.println(ran);
    }
}
