package Lesson04;

public class TicTacToe {
    public static void main(String[] args) {
        //======================================================================
        int arrLength = 3;
        System.out.println("––– 04 –––––––––––––––––––––––––––");
        System.out.println("Заполнить диагонали квадратного массива");
        String[][] arraySqDiagonal = new String[arrLength][arrLength];
        for (int i = 0; i < arraySqDiagonal.length; i++) {
            for (int j = 0; j < arraySqDiagonal[i].length; j++) {
                if (i == j || i == arrLength - 1 - j) {
                    arraySqDiagonal[i][j] = " ⬛ ";
                } else {
                    arraySqDiagonal[i][j] = " · ";
                }
                System.out.print(arraySqDiagonal[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //======================================================================


    }
}
