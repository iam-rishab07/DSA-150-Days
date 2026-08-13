package TCS;

public class FibSequence {
    public static int[] fibonacciNumbers(int n) {
        int[] res = new int[n];

        int a = 0, b = 1;
        for(int i=1;i<=n;i++)
        {
            res[i-1]=a;
            int c = a+b;
            a = b;
            b = c;
        }
        return res;
    }
}
