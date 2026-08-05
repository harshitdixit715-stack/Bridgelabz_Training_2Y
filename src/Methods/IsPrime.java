package Methods;

import java.util.*;
public class IsPrime {
    public static boolean IsPrime(int n){
        if(n<=0){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        if(IsPrime(n)){
            System.out.println(n + " Number is prime ");
        }else{
            System.out.println(n + " Number is not prime ");
        }
    }
}
