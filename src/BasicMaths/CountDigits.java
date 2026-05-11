package BasicMaths;

import java.util.Scanner;

public class CountDigits {

    public static void countDigit(int n)
    {
        int count=0;
        while(n!=0)
        {
            count++;
            n/=10;
        }
        System.out.println("The no. of digits is "+count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        countDigit(n);
    }
}
