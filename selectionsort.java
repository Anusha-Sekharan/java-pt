public class selectionsort {
    void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        selectionsort ss = new selectionsort();
        int[] arr = { 1, 5, 2, 9, 6 };
        ss.selection(arr);
    }
}
