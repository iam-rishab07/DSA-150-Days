package BinarySearch;
// single among doubles in a sorted array
public class SingleDoubles {
    int single(int[] arr) {
        int n = arr.length;
        // Edge cases
        if (n == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If mid is the unique element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // Determine if we are in the "left" half or "right" half
            // Even index should match the next, Odd index should match the previous
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                    (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                low = mid + 1; // Unique element is on the right
            } else {
                high = mid - 1; // Unique element is on the left
            }
        }
        return -1;
    }
}
