import java.util.Arrays;

public class SortedSquareArray {
    public static void main(String[] args){
        int arr[] = {-1,98,54,44,7,9,-65,-43};
        var dup = Arrays.copyOf(arr, arr.length);
        Integer[] res = Arrays.stream(dup).map(a->a*a).sorted().boxed().toArray(Integer[]::new);
        System.out.println(Arrays.asList(res));
    }
}
