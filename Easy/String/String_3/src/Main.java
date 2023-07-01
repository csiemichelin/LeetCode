import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int firstUniqChar(String s) {
        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();
        int resultValue = 0;
        int value = 0;
        String resultKey = "";
        String key = "";
        for (int i=0; i<s.length(); i++) {
            if (sMap.containsKey(String.valueOf(s.charAt(i)))) {
                key = String.valueOf(s.charAt(i));
                value = sMap.get(key);
                value++;
            }
            else {
                key = String.valueOf(s.charAt(i));
                value = 1;
            }
            sMap.put(key, value);
        }
        boolean checkbool = false;
        for (String keys : sMap.keySet()) {
            //System.out.println("key = " + keys + ", value = " + sMap.get(keys));
            if (sMap.get(keys) == 1) {
                checkbool = true;
                for (int i=0; i<s.length(); i++) {
                    if (String.valueOf(s.charAt(i)).equals(keys) && !resultMap.containsKey(keys)) {
                        resultKey = keys;
                        resultValue = i;
                        resultMap.put(resultKey, resultValue);
                    }
                }
            }
        }
        if (checkbool == false) return -1;
        int minIndex = s.length();
        for (String keys : resultMap.keySet()) {
            //System.out.println("key = " + keys + ", value = " + resultMap.get(keys));
            if (resultMap.get(keys) < minIndex) {
                minIndex = resultMap.get(keys);
            }
        }
        return  minIndex;
    }
    public static void main(String[] args) {
        String s = "aass";
        int result = firstUniqChar(s);
        System.out.println(result);
    }
}