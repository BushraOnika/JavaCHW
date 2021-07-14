package  com.company;
import java.util.Scanner;
public class chapter_07_practise {
    static void multiplication(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d",i,n,n*i);
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
            //problem 1
        //multiplication(7);
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        double b=sc.nextFloat();
        String ac = sc.nextLine();
        String c=sc.nextLine();
        int i = 4;
        double d=4.0;
        String s= "HackerRank ";
        //String s = sc.nextLine();nt a;
        //double b;
        System.out.println(i+a);

        //System.out.println(d+b);
        //System.out.printf("%0.1f",d+b);
        System.out.println(s+c);



    }
}
