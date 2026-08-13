package TCS;

public class DigitSum {
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n>0)
        {
            int digit = n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}
