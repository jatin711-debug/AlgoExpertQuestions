public class MergeSortedArrays {
    static int[] mergeArray(int[] array1, int[] array2){
        int mergeArrayLength = (array1.length  + array2.length);
        int i=0,j=0,k=0;
        int[] mergeArray = new int[mergeArrayLength]; 
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j])
                mergeArray[k++] = array1[i++];
            else
                mergeArray[k++] = array2[j++];
        }
        while(i < array1.length){
            mergeArray[k++] = array1[i++];
        }
        while(j < array2.length){
            mergeArray[k++] = array2[j++];
        }
        return mergeArray;
    }
    public static void main(String[] args){
        int array1[] = {1,2,3,4,5,6};
        int array2[] = {6,7,8,9,10,11};
        var res = mergeArray(array1,array2);
        for(int r:res){
            System.out.print("->"+r);
        }
    }
}
