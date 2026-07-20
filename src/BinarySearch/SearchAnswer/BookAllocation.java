package BinarySearch.SearchAnswer;

// allocate minimum pages (GFG)
public class BookAllocation {
    public static boolean isValidAnswer(int[] arr, int k , long maxPages)    // predicate Function
    {   // check whether mid(maxPages) is a valid solution or not
        int studentCount = 1;
        long pages = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(pages+arr[i]>maxPages)   // if adding current book exceeds pagelimit(maxPages),
            {                           // assign book to next student
                studentCount++;
                pages=arr[i];
            }else{
                pages+=arr[i];
            }
        }
        return (studentCount<=k);       // books can only be assigned to students less than or equal to K
    }

    public int findPages(int[] arr, int k) {
        if(k>arr.length) return -1; // k must be always less than or equal arr.length
        long low = arr[0], high = 0;
        long ans = -1;
        for(int num:arr)
        {
            if(num>low) low = num;
            high+=num;
        }
        // low is max Element in array(max page limit per student, at least one student takes max page book)
        // high is sum of all pages (worst case scenario, k =1 i.e. one student reads all pages)
        while(low<=high)
        {
            long mid = low + (high-low)/2;
            if(isValidAnswer(arr,k,mid)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return (int)ans;
    }
}
