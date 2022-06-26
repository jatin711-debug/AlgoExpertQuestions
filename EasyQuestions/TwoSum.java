import java.util.HashMap;
class TwoSum{
    //using hashmap
    static HashMap<Integer, Boolean> map = new HashMap<>();
    static int[] twoSum(int[] arr,int target){
        int[] result = new int[2];
        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            int y = target - x;
            if(map.get(y) != null ){
                result[0]= x;
                result[1]= y;
            }else{
                map.put(arr[i],true);
            }
        }
        return result;
    }

    //another way
    static int[] twoSumMethod(int[] arr,int target){
        int[] result = new int[2];
        int low = 0;
        int high = arr.length -1;
        while(low < high){
            int currentSum = arr[low] + arr[high];
            if(currentSum == target){
                result[0]= arr[low];
                result[1]= arr[high];
                return result;
            }else if(currentSum < target){
                ++low;
            }else if(currentSum > target){
                --high;
            }
            System.out.println(currentSum);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int[] res = twoSumMethod(arr,6);
        System.out.println(res[0]+" "+res[1]);
    }
}
    