package BasicMaths;
// print digits of a number
import java.util.Scanner;

public class Printdigits {

    public static void printDigit1(int n) // prints digit from right to left
    {
        while(n!=0){
            int digit = n%10;
            System.out.println(digit);
            n /= 10;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        printDigit1(n);
    }
}
