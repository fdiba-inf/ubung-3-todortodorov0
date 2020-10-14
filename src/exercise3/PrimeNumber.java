package exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int d = 2;
        boolean prime=true;
        while(d<n){
            if (n%d==0){
                prime=false;
                break;
            }
            d++;
        }
        System.out.println("Prime number: "+prime);


    }
}
