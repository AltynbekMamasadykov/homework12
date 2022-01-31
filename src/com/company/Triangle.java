package com.company;

import java.util.Scanner;

public class Triangle {
    int a,b,c;

    static void area(){    //formula of area =  (a+b+c)/2 = s ==> sqrt s*(s-a)*(s-b)*(s-c)
        Triangle triangle = new Triangle();
        System.out.println("enter the first side of triangle");
        Scanner scanner = new Scanner(System.in);
        triangle.a = scanner.nextInt();
        System.out.println("enter the second side of triangle");
        triangle.b = scanner.nextInt();
        System.out.println("enter the third side of triangle");
        triangle.c = scanner.nextInt();
        double s = (triangle.a+ triangle.b+ triangle.c)/(double)2;
        double area = Math.sqrt(s*(s-triangle.a)*(s-triangle.b)*(s-triangle.c));
        System.out.println("Area of your triangle is: "+area);
    }
}
