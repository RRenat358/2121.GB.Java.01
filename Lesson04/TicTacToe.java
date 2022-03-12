/*
package Lesson04;

import java.util.Scanner;

public class TicTacToe {
//    public static void main(String[] args) {
        //======================================================================
        System.out.println("––– TicTacToe ––––––––––––––––\n");
//        System.out.println("Заполнить диагонали квадратного массива");

        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;




        arrayTictactoe();
        moveHuman();



        System.out.println("\n––––––––––––––––––––––––––––––");
        //======================================================================


    public static int arrLength = 3;
    static String[][] arrayTictactoe = new String[arrLength][arrLength];


    public static void arrayTictactoe(String[][] arrayTictactoe) {
        for (int i = 0; i < arrayTictactoe.length; i++) {
            for (int j = 0; j < arrayTictactoe[i].length; j++) {
                arrayTictactoe[i][j] = " · ";
                System.out.print(arrayTictactoe[i][j]);
            }
            System.out.println();
        }
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }

    public static Scanner sc = new Scanner(System.in);
    String moveHuman = "○";
    String moveComp = "X";

    public static void isMoveValid() {

        }

    public static void moveHuman(String moveHuman) {
        int x, y;

        do {
            System.out.println("Введите координаты = X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isMoveValid(x, y));
        arrayTictactoe[y][x] = moveHuman;
    }

    public static void isMoveValid(x,y) {

    }

}
*/
