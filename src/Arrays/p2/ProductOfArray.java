package Arrays.p2;

// print the product of integer array
public class ProductOfArray {
    public static void main(String[] args) {
        int[] arr = {3,4,7,9};
        int product = 1;
        for(int num:arr)
        {
            product*=num;
        }
        System.out.println("the product of array is "+product);
    }
}
