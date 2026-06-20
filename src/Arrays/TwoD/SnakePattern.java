package Arrays.TwoD;


// print matrix in a snake pattern
public class SnakePattern {
    public void print(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[0].length-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{12,35,56,12},{3,2,54,23},{86,899,345,90},{89,912,248,35}};
        SnakePattern sp = new SnakePattern();
        sp.print(arr);
    }
}
