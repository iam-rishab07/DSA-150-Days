package BitwiseOperators;

import java.util.Scanner;

public class CheckPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive Number : ");
        int num = sc.nextInt();
        if((num & (num-1)) == 0)
        {
            System.out.println("The Number is power of 2");
        }else{
            System.out.println("The Number is not a power of 2");
        }
    }
}
