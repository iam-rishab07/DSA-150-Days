package AdvanceArray.TwoD;

public class WavePrint {
    public static void wave(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("row "+i+": ");
            if(i%2==0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }else {
                for (int j = arr[0].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        wave(mat);
    }
}
