package com.company;
//      problem 1
class Circle{
    int radius;
    // circle constructor parameter
    Circle(int r){
        System.out.println("I'm Circle constructor !!");
        this.radius=r;

    }
    void area() {
        System.out.println("The area of a circle is " + Math.PI * radius * radius);
    }
}
class Cylinder1 extends Circle{
    int height;
    // constructor with parameters
    Cylinder1(int r ,int h ){
        super(r); //it will call the constructor of circle and do circles constructor work 1st..
        this.height=h;
        System.out.println("I'm Cylinder1 constructor !!");

    }
    void volume(){
        System.out.println("the volume of the cylinder is "+Math.PI*radius*height);
    }
}

public class Chapter_10_practise {
    public static void main(String[] args) {
        Cylinder1 cy =new Cylinder1(2,3);
        cy.area();
        cy.volume();
    }
}
