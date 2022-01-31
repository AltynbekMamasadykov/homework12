package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        
        System.out.println("Enter the first side of a triangle");
        Scanner scanner = new Scanner(System.in);
        triangle.a = scanner.nextInt();
        System.out.println("Enter the second side of a triangle");
        triangle.b = scanner.nextInt();
        System.out.println("Enter the third side of a triangle");
        triangle.c = scanner.nextInt();
        
        triangle.area();

    }
}
