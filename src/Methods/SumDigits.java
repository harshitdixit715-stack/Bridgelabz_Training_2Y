package Methods;

import java.util.*;
public class SumDigits {
    public static int sum(int a, int b){
        return a+b;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a = sc.nextInt();
        System.out.println("Enter a second number");
        int b = sc.nextInt();
        System.out.println("Sum of two digits :- " + sum(a,b));
    }

}
