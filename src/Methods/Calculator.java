package Methods;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static double div(int a, int b){
        if(b==0){
            System.out.println("Division is not allowed");
            return 0;
        }
        return  a/b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number : " );
        int a = sc.nextInt();
        System.out.println("Enter a Second Number : ");
        int b = sc.nextInt();

        System.out.println("Addition of two Number :- " + add(a,b));
        System.out.println("Subtraction of two Number :- " + sub(a,b));
        System.out.println("Multiplication of two Number :- " + mul(a,b));
        System.out.println("Divide of two Number :- " + div(a,b));

    }
}
