package exercise3;

import java.util.Scanner;

public class AngleCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float value= input.nextFloat();
        String in= input.next();
        char type= in.charAt(0);
        do{
            if(type=='d'){
              float R=value*Math.PI/180/2;
                System.out.println("Angel: "+ R);
            }else if(type=='r'){
                float R=2*value*57.29578;
                System.out.println("Angel: "+ R);
            }break;
        }while(type=='d' || type=='r');


    }
}
