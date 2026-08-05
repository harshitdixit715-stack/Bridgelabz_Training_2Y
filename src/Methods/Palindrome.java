package Methods;

import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        if(n<=0){
            return false ;
        }
        while(n>0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n = n/10;
        }
        return original == reverse;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(isPalindrome (n)) {
            System.out.println(n + " is a Palindrome ");
        }else{
            System.out.println(n + " is not a Palindrome");
        }
    }
}
