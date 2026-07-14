package BinarySearch.P2;

public class SqrtP {

        public static double mySqrt(int x) {
            if(x==0) return 0;
            double low = 1, high = x ;
            double ans = -1;
            while(low<=high)
            {
                double mid = low + (high-low)/2;
                if(mid==x/mid)
                {
                    return mid;
                }else if(mid>x/mid)
                {
                    high = mid-1;
                }else{
                    ans = mid;
                    low = mid+1;
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int num = 60;
        double ans = mySqrt(num);
        System.out.println(ans );
    }

}
