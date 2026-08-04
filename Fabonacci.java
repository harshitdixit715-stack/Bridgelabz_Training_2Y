package Methods;

import java.util.Scanner;
public class Fabonacci {
    public static void fabonacci(int n){
        int a = 0;
        int b = 1;
        if(n<0){
            System.out.println("Invalid Number");
            return ;
        }
        for(int i=1;i<=n;i++){
            System.out.print(a + " ");
            int c = a+b;
            a = b;
            b = c;
        }
    }
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        fabonacci(n);
    }
}
