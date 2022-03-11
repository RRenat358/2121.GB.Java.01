package Lesson04;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        //======================================================================

        System.out.println("––– TicTacToe ––––––––––––––––\n");
//        System.out.println("Заполнить диагонали квадратного массива");
        System.out.println("\n––––––––––––––––––––––––––––––");
        //======================================================================

    }
    public static int arrLength = 3;
    String[][] arrayTictactoe = new String[arrLength][arrLength];




    public static void arrayTictactoe() {
        for (int i = 0; i < arrayTictactoe.length; i++) {
            for (int j = 0; j < arrayTictactoe[i].length; j++) {
                arrayTictactoe[i][j] = " · ";
                System.out.print(arrayTictactoe[i][j]);
            }
            System.out.println();
        }

    }

    public static Scanner sc = new Scanner(System.in);

    public static void moveHuman() {
        int x, y;
        do {
            System.out.println("Введите координаты = X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        arrayTictactoe[y][x] = DOT_X;

    }

}
