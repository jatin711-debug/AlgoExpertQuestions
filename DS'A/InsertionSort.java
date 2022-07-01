public class InsertionSort {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        InsertionSort s = new InsertionSort();
        int[] arr = {34,56,98,32,65};
        s.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
