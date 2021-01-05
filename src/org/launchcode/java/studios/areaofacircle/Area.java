package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the radius: ");
//
//        if (input.isNaN()){
//
//        }
        double radius = input.nextDouble();
//
//        if (radius.isNaN()){
//
//        }
        double area = Circle.getArea(radius);

        System.out.println("Area of Circle is: " + area);//Circle.getArea();

        //public static Double getArea(Double radius){
        //    return 3.14 * radius * radius;
    }
}

