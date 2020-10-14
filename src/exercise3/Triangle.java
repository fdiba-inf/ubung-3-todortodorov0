package exercise3;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a= input.nextDouble();
        double b= input.nextDouble();
        double c= input.nextDouble();
        boolean b1 = a > 0 && b > 0 && c > 0 && b+c>a && a+c>b && a+b>c;
        do{
            if(b1) {
                double P = (a + b + c) / 2;
                double Area = Math.sqrt(P * (P - a) * (P - b) * (P - c));
                System.out.println("Area: " + Area);
                if (a == b && b == c) {
                    System.out.println("Triangle: equilateral");
                } else if (a == b || b == c) {
                    System.out.println("Triangle: isosceles");
                } else {
                    System.out.println("Triangle: scalene");

                }
            }else{
                System.out.println("Values are not correct!");
            }break;
        }while(b1);
        }
    }

