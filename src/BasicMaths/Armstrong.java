package BasicMaths;

import java.util.Scanner;

public class Armstrong {

    public static boolean armstrong(int n)
    {
        int org = n;
        int sum = 0;
        while(n!=0)
        {
            int digit = n%10;
            sum += digit*digit*digit;
            n = n/10;
        }
        return org==sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean ans = armstrong(n);
        if(ans) System.out.println(n+" is Armstrong number");
        else System.out.println(n+" is not an Armstrong number");
    }
}
