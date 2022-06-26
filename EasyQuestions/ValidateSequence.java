public class ValidateSequence{
    static Boolean validate(int[] arr, int[] seq){
        int arrIdx = 0;
        int seqIdx = 0;
        while(arrIdx < arr.length && seqIdx < seq.length){
            if(arr[arrIdx] == seq[seqIdx]) seqIdx++;
            arrIdx++;
        }
        return (seqIdx == seq.length);
    }
    public static void main(String[] args){
        int[] arr = {1,5,7,9,11,12,13,15,16};
        int[] val = {1,7,11,13};
        System.out.println(validate(arr,val));
    }
}