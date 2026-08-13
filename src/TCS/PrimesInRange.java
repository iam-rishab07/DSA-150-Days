package TCS;

import java.util.*;
public class PrimesInRange {
    public List<Integer> primeRange(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=l;i<=r;i++)
        {
            if(isPrime(i))
            {
                list.add(i);
            }
        }
        return list;
    }

    public static boolean isPrime(int n)
    {
        if(n==2) return true;
        if(n<2 || n%2==0) return false;

        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
