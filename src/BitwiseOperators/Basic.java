package BitwiseOperators;

public class Basic {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("AND : "+(5&6));
        System.out.println("OR : "+(5|6));
        System.out.println("XOR : "+(5^6));
        System.out.println("NOT 6: "+(~6));
        System.out.println("Left Shift 5 by 1 bit : "+(5<<1));
        System.out.println("Right Shift 5 by 1 bit : "+(5>>1));
        System.out.println("Unsigned Right Shift 5 by 1 bit : "+(5>>>1));
    }
}
