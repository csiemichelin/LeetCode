import java.util.Arrays;

public class Main {
    public static void rotate(int[][] matrix) {
        int[][] resultMatrix = new int[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                resultMatrix[j][(matrix.length-1)-i] = matrix[i][j];
            }
        }
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[i].length; j++) {
                matrix[i][j] = resultMatrix[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i=0; i<matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}