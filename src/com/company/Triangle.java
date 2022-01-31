package com.company;

import java.util.Scanner;

public class Triangle {

    int a,b,c;

    public void area(){   //formula of area =  (a+b+c)/2 = s ==> sqrt s*(s-a)*(s-b)*(s-c)

        double s = (a+b+c)/(double)2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of your triangle is: "+area);

    }
}
