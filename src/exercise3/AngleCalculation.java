package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value= input.nextDouble();
        String in= input.next();
        char type= in.charAt(0);
        do{
            if(type=='d'){
                double R=value*Math.PI/180/2;
                System.out.println("Angel: "+ R);
            }else if(type=='r'){
                double R=2*value*57.29578;
                System.out.println("Angel: "+ R);
            }break;
        }while(type=='d' || type=='r');


    }
}
