public class SelectionSort {
    public void sort(int[] array){
        for(int i = 0; i < array.length;i++){
            int min = i;
            int temp = array[min];
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            array[i] = array[min];
            array[min] = temp;
        }
    }
    public static void main(String[] args) {
        SelectionSort o = new SelectionSort();
        int[] arr = {34,57,68,324,7,87,4,3};
        o.sort(arr);

        for(int i:arr){
            System.out.println(i);
        }
    }

}
