public class binarysearch {
    void search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at: " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        binarysearch bs = new binarysearch();
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        bs.search(arr, 4);
    }
}
