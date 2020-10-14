package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value;
        char type;
        do{
            value= input.nextDouble();
            String in= input.next();
            type= in.charAt(0);
            if(type=='d'){
                double R=value*3.1415/180/2;
                System.out.println("Angel: "+ R);
            }else if(type=='r'){
                double R=2*value*57.295;
                System.out.println("Angel: "+ R);
            }
        }while(type=='d' || type=='r');


    }
}
