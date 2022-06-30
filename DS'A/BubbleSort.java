public class BubbleSort {
    public void sort(int[] array){
        int arrayLength = array.length;
        for(int i = 0; i < arrayLength; i++){
            for(int j = 0; j < arrayLength; j++){
                if(array[i] < array[j]){
                    array[i] = array[j] + array[i];
                    array[j] = array[i] - array[j];
                    array[i] = array[i] - array[j]; 
                }
            }
        }
    }
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int[] array = {12,4,4,5,57,8,7,24,89};
        obj.sort(array);
        for(int o: array){
            System.out.print("| "+o+"->");
        }
    }
}
