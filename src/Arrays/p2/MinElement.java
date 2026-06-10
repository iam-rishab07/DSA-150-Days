package Arrays.p2;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {-1, 34 ,45,23 , -77};
        int min = Integer.MAX_VALUE;
        for(int num:arr)
        {
            if(num<min)
                min = num;
        }
        System.out.println("The Min Element is "+min);
    }
}
