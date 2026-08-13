package TCS;

public class PalindromeNumber {
    public boolean isPalindrome(int n) {
        int temp = Math.abs(n);
        int num = 0;
        while(temp>0)
        {
            int digit = temp%10;
            num = num*10 + digit;
            temp/=10;
        }

        return Math.abs(n)==num;
    }
}
