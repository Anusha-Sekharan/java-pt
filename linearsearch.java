public class linearsearch {
    void search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found at: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        linearsearch ls = new linearsearch();
        int[] arr = { 10, 20, 30, 40, 50 };
        ls.search(arr, 30);
    }
}
