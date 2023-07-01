import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void setZeroes(int[][] matrix) {
        LinkedList<Integer> length = new LinkedList<>();
        LinkedList<Integer> width = new LinkedList<>();
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (!length.contains(i)) {
                        length.add(i);
                    }
                    if (!width.contains(j)) {
                        width.add(j);
                    }
                }
            }
        }
        //System.out.println(length);
        //System.out.println(width);
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                if (length.contains(i) || width.contains(j)) {
                    matrix[i][j] = 0;
                }
               //System.out.print(matrix[i][j] + " ");
            }
           //System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
    }
}