package com.company;

class Square{
    int side;
 public int area(){
     return side*side;
 }
 public int perimeter(){
     return 4*side;
 }
    public int getSide() {
        return side;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing.......");
    }
    public void vibrate(){
        System.out.println("Vibrating.......");
    }
}
class Employee{
    // int salary;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary(int salary) {
        return salary;
    }
}
class Rectangular {
    int l,d;
    public int area(){
        return l*d;
    }
    public int perimeter(){
        return 2*l*d;
    }
}
class TommyVecity{
    public void hit(){
        System.out.println("HITTING THE ENEMY....");
    }
    public void run(){
        System.out.println("RUNNING FROM THE ENEMIES....");
    }
    public void fire(){
        System.out.println("FIRRING ON THE ENEMIES....");
    }


}
public class Chapter_08_practise {
    public static void main(String[] args) {
        // problem 1
//        Employee onika = new Employee();
//        Scanner emp = new Scanner(System.in);// for get the name and salaru from the user
//        System.out.println("\tEnter the name ");
//        String name = emp.nextLine();
//        System.out.println("\tEnter the salary ");
//        int sal = emp.nextInt();
//        onika.setName(name);
//        System.out.println("\t The employee name is \n"+onika.getName());
//        System.out.println("\t The employee's salary is\n "+onika.getSalary(sal));
        // problem 2
//        CellPhone xiaomi = new CellPhone();
//        xiaomi.ring();
//        xiaomi.vibrate();
        // problem 3
//        Square square = new Square();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("\tEnter the side of the square ");
//        int side = sc.nextInt();
//        square.side=side;
//        System.out.println("The area is "+square.area());
//        System.out.println("The perimeter is "+square.perimeter());
        // problem 4
//        Rectangular rectangular = new Rectangular();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of the rectangular is ");
//        int length = sc.nextInt();
//        System.out.println("Enter the width of the rectangular is ");
//        int width=sc.nextInt();
//        rectangular.l=length;
//        rectangular.d=width;
//        System.out.println("The perimeter is "+rectangular.perimeter());
//        System.out.println("the area is "+rectangular.area());
        // PROBLEM 5
//
//        TommyVecity tommy = new TommyVecity();
//        tommy.hit();
//        tommy.run();
//        tommy.fire();
        // problem 6





    }

}
