package BasicMaths;

import java.util.Scanner;

public class Perfect {
    public static boolean checkPerfect(int n)
    {
        int sum = 1;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0){
                int firstFactor = i;
                int secondFactor = n/i;
                sum+= firstFactor+secondFactor;
            }
        }
        return (sum==n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        boolean ans = checkPerfect(n);
        if(ans) System.out.println(n+" is Perfect number");
        else System.out.println(n+" is not a Perfect number");
    }
}
