package com.company;
class Cylinder{
    private int radius;
    private int height;

   // public Cylinder(int radius, int height) {
        //this.radius = radius;
       // this.height = height;
  //  }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfacearea(){
        return  2*Math.PI*radius*radius+2*3.14*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }


}
class Rectangle{
    private int l;
    private int b;

    public Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public int getL() {
        return l;
    }


    public int getB() {
        return b;
    }

    public Rectangle() {
        this.l = 4;
        this.b =5;
    }
}
public class Chapter_09_Practise {
    public static void main(String[] args) {
////        //problem 1
//       Cylinder mycylinder = new Cylinder();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius  : ");
//        int radius =sc.nextInt();
//      mycylinder.setRadius(radius);
//        System.out.println( "THE RADIUS OF THE CYLINDER IS "+mycylinder.getRadius());
//
//       System.out.println("ENter the height ");
//        int height =sc.nextInt();
//       mycylinder.setHeight(height);
//        System.out.println("The height is : "+mycylinder.getHeight());
//
////        //problem 2
//        System.out.println("Surface Area is : "+mycylinder.surfacearea());
//       System.out.println("Volume is : "+ mycylinder.volume());
        // problem 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the radius  : ");
//        int radius =sc.nextInt();
//        System.out.println( "THE RADIUS OF THE CYLINDER IS "+radius);
//        System.out.println("ENter the height ");
//        int height =sc.nextInt();
//        System.out.println("The height is : "+height);
//        Cylinder mycylinder = new Cylinder(radius,height);
//        System.out.println("Surface Area is : "+mycylinder.surfacearea());
//        System.out.println("Volume is : "+ mycylinder.volume());
        // problem 4
        Rectangle r = new Rectangle(12,56);
        System.out.println(r.getB());
        System.out.println(r.getL());







    }
}
