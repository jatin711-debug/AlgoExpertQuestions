import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String str = "abcdcaf";
        for(int i=0;i < str.length();i++) {
            char key = str.charAt(i);
            var conainer = map.containsKey(key);
            if(!conainer) {
                map.put(key,0);
            }
            map.put(key,map.get(key)+1);
        }
        for(Entry<Character, Integer> set: map.entrySet()){
            if(set.getValue() == 1){
                System.out.println("==>"+set.getKey());
                return;
            }
        }
    }
}
