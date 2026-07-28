import java.util.*;
public class chocolate {
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter money: ");
       int money = sc.nextInt();
        System.out.println("Enter wrapper required for 1 chocolate : ");
        int wrapperNeed = sc.nextInt();
        int chocolates = money;  // 1 rs = 1 chocolate
        int wrappers = chocolates;
        while(wrappers>=wrapperNeed){
            int free = wrappers/wrapperNeed;
            chocolates += free;
            wrappers = free+(wrappers%wrapperNeed);
        }
        System.out.println("Maximum Chocolates = " + chocolates);
        sc.close();
    }
}