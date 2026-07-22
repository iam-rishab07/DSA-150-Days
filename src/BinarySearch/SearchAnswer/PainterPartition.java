package BinarySearch.SearchAnswer;

// painter partition problem (GFG)
public class PainterPartition {
    public static boolean isValid(int[] arr, int k , long timeLimit)
    {
        int cnt = 1;        // painter count
        int time = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>timeLimit)  // if board is longer than time limit ,
            {                       //  it's impossible to assign
                return false;
            }
            if(time+arr[i]>timeLimit)
            {
                cnt++;
                time = arr[i];
            }else{
                time+=arr[i];
            }
        }
        return (cnt<=k);
    }

    public int minTime(int[] arr, int k) {
        if(k>arr.length) return -1;
        long low = arr[0], high = 0;
        for(int num:arr)
        {
            if(num>low) low = num;
            high+=num;
        }
        long ans = -1;
        while(low<=high)
        {
            long mid = low+(high-low)/2;
            if(isValid(arr,k,mid))
            {
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return (int)ans;
    }
}
