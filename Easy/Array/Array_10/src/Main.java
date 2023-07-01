import java.util.LinkedList;

public class Main {
    public static boolean isValidSudoku(char[][] board) {
        //判斷列1~9
        for (int i=0; i<board.length; i++) {
            LinkedList<String> number = new LinkedList<>();
            number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
            number.add("6");number.add("7");number.add("8");number.add("9");
            for (int j=0; j<board[i].length; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(1);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷行1~9
        for (int j=0; j<board[0].length; j++) {
            LinkedList<String> number = new LinkedList<>();
            number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
            number.add("6");number.add("7");number.add("8");number.add("9");
            for (int i=0; i<board.length; i++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(2);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格一1~9
        LinkedList<String> number = new LinkedList<>();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(3);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格二1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=3; i<6; i++) {
            for (int j=0; j<3; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(4);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格三1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=6; i<9; i++) {
            for (int j=0; j<3; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(5);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格四1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=0; i<3; i++) {
            for (int j=3; j<6; j++) {
                //System.out.println(board[i][j]);
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(6);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格五1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=3; i<6; i++) {
            for (int j=3; j<6; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(7);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格六1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=6; i<9; i++) {
            for (int j=3; j<6; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(8);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格七1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=0; i<3; i++) {
            for (int j=6; j<9; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(9);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格八1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=3; i<6; i++) {
            for (int j=6; j<9; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(10);
                    return false;   //代表列有重複的數字
                }
            }
        }
        //判斷九宮格九1~9
        number.clear();
        number.add("1");number.add("2");number.add("3");number.add("4");number.add("5");
        number.add("6");number.add("7");number.add("8");number.add("9");
        for (int i=6; i<9; i++) {
            for (int j=6; j<9; j++) {
                if (number.contains(String.valueOf(board[i][j]))) {
                    number.remove(String.valueOf(board[i][j]));
                } else if (board[i][j] == '.'){
                    continue;
                } else {
                    //System.out.println(11);
                    return false;   //代表列有重複的數字
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /*
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

         */

        /*
        char[][] board = {{'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

         */

        char[][] board = {{'.','.','.','.','5','.','.','1','.'}
                        ,{'.','4','.','3','.','.','.','.','.'}
                        ,{'.','.','.','.','.','3','.','.','1'}
                        ,{'8','.','.','.','.','.','.','2','.'}
                        ,{'.','.','2','.','7','.','.','.','.'}
                        ,{'.','1','5','.','.','.','.','.','.'}
                        ,{'.','.','.','.','.','2','.','.','.'}
                        ,{'.','2','.','9','.','.','.','.','.'}
                        ,{'.','.','4','.','.','.','.','.','.'}};
        boolean bool = isValidSudoku(board);
        System.out.println(bool);
    }
}