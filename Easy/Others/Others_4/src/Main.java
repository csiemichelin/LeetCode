import java.util.LinkedList;
import java.util.List;

public class Main {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new LinkedList<>();
        for (int i=0; i<numRows; i++) { //層數
            resultList.add(new LinkedList<>());
            if (i == 0) {
                resultList.get(0).add(1);
                continue;
            }
            for (int j=0; j<=i; j++) {  //每一層的值
                if (j == 0 || j == i) {
                    resultList.get(i).add(1);
                }else {
                    resultList.get(i).add(resultList.get(i-1).get(j-1) + resultList.get(i-1).get(j));
                }
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> resultList= generate(numRows);
        System.out.println(resultList);
    }
}