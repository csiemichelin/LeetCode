import java.util.*;

public class Main {
    public static List<List<String>> groupAnagrams(String[] strs) {
        /*  //會TLE
        List<List<String>> resultLsit = new LinkedList<>();
        String[] cloneString = (String[]) strs.clone();
        LinkedList<String> MapList = new LinkedList<>();
        for (int i=0; i<cloneString.length; i++) {
            //System.out.println(cloneString[i]);
            char[] sArray = cloneString[i].toCharArray();
            Arrays.sort(sArray);
            String SortString = String.valueOf(sArray);
            //System.out.println("SortString = " + SortString);
            MapList.add(SortString);
        }
        System.out.println(MapList);
        for (int i=0; i<MapList.size(); i++) {
            if (resultLsit.size() == 0) {
                resultLsit.add(new LinkedList<>());
                resultLsit.get(0).add(strs[0]);
                continue;
            }
            boolean bool = false;
            int index = 0;
            for (int j=0; j<resultLsit.size(); j++) {
                char[] sArray = resultLsit.get(j).get(0).toCharArray();
                Arrays.sort(sArray);
                if (MapList.get(i).equals(String.valueOf(sArray))) {
                    bool = true;
                    index = j;
                    break;
                }
            }
            if (bool == true) {
                resultLsit.get(index).add(strs[i]);
            }else {
                resultLsit.add(new LinkedList<>());
                resultLsit.get(resultLsit.size()-1).add(strs[i]);
            }
        }
        return resultLsit;
         */
        Map<String, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortString = String.valueOf(temp);
            if (!map.containsKey(sortString)) {
                LinkedList<String> valueList = new LinkedList<>();
                valueList.add(strs[i]);
                map.put(sortString, valueList);
            }else {
                String key = sortString;
                List<String> value = map.get(key);
                value.add(strs[i]);
                map.put(sortString, value);
            }
        }
        List<List<String>> resultLsit = new LinkedList<>();
        int i = 0;
        for (String key : map.keySet()) {
            resultLsit.add(new LinkedList<>());
            resultLsit.set(i, map.get(key));
            i++;
        }
        return resultLsit;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> resultList = groupAnagrams(strs);
        System.out.println(resultList);
    }
}