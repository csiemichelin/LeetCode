import java.util.*;
public class Main {
    //此題用map好像會錯，不知道為甚麼
    /*
    public static boolean isAnagram(String s, String t) {
        Map<String, Integer> sMap = new HashMap<>();
        Map<String, Integer> tMap = new HashMap<>();
        String skey = "";
        String tkey = "";
        int svalue = 0;
        int tvalue = 0;
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(String.valueOf(s.charAt(i)))) {
                skey = String.valueOf(s.charAt(i));
                svalue = sMap.get(skey);
                svalue++;
            } else {
                skey = String.valueOf(s.charAt(i));
                svalue = 1;
            }
            sMap.put(skey, svalue);
        }
        for (int i = 0; i < t.length(); i++) {
            if (tMap.containsKey(String.valueOf(t.charAt(i)))) {
                tkey = String.valueOf(t.charAt(i));
                tvalue = tMap.get(tkey);
                tvalue++;
            } else {
                tkey = String.valueOf(t.charAt(i));
                tvalue = 1;
            }
            tMap.put(tkey, tvalue);
        }
        boolean resultBool = true;
        if (sMap.size() >= tMap.size()) {
            for (String sKeys : sMap.keySet()) {
                //System.out.println("sKeys = " + sKeys + ", value = " + sMap.get(sKeys));
                boolean checkbit = false;
                for (String tKeys : tMap.keySet()) {
                    //System.out.println("tKeys = " + tKeys + ", value = " + tMap.get(tKeys));
                    if (sKeys.equals(tKeys)) {
                        if (sMap.get(sKeys) != tMap.get(tKeys)) {
                            resultBool = false;
                            break;
                        }
                        checkbit = true;
                    }
                }
                if (checkbit == false) {
                    resultBool = false;
                }
            }
        } else {
            for (String tKeys : tMap.keySet()) {
                boolean checkbit = false;
                for (String sKeys : sMap.keySet()) {
                    if (tKeys.equals(sKeys)) {
                        if (tMap.get(tKeys) != sMap.get(sKeys)) {
                            resultBool = false;
                            break;
                        }
                        checkbit = true;
                    }
                }
                if (checkbit == false) {
                    resultBool = false;
                }
            }
        }
        return resultBool;
    }
     */
    public static boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String sSortSring = Arrays.toString(sArray);
        String tSortSring = Arrays.toString(tArray);
        if (sSortSring.equals(tSortSring)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "cra";
        String t = "raq";
        Boolean bool = isAnagram(s, t);
        System.out.println(bool);
    }
}