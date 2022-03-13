package Lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static int arrMapLength = 3;
    static String[][] arrMap = new String[arrMapLength][arrMapLength];

    public static final String cellNull = " · ";
    public static final String stepX = " ❌ ";
    public static final String stepO = " ⭕ ";


    //======================================================================
    public static void main(String[] args) {
        System.out.println("––– TicTacToe ––––––––––––––––\n");
        System.out.println("Сыграем в крестики-нолики?)");


        arrMap(arrMapLength);
        arrMapPrint();
        System.out.println("––––––––––––––––––––––––––––––");
        stepHuman();
        System.out.println();
        arrMapPrint();

        System.out.println("\n––––––––––––––––––––––––––––––");
        System.out.println("    Конец игры");
        System.out.println("––––––––––––––––––––––––––––––");
    }

    //======================================================================


    public static void arrMap(int arrMapLength) {
        System.out.println();
        for (int i = 0; i < arrMapLength; i++) {
            for (int j = 0; j < arrMap[i].length; j++) {
                arrMap[i][j] = cellNull;
            }
        }
    }
    private static void arrMapPrint() {
        System.out.print("    ");
        for (int i = 0; i < arrMapLength; i++) {
            System.out.print("y" + (i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < arrMapLength; i++) {
            System.out.print("x" + (i + 1) + "  ");
            for (int j = 0; j < arrMap[i].length; j++) {
                System.out.print(arrMap[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }



/*
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
*/

    public static Scanner sc = new Scanner(System.in);

    public static void stepHuman() {
        int x, y;
        do {
            System.out.println("Ваш ход!");
            System.out.print("x = " );
            x = sc.nextInt();
            System.out.print("y = " );
            y = sc.nextInt();
        } while (x < 1 || x > arrMapLength || y < 1 || y > arrMapLength);
        arrMap[x-1][y-1] = stepX;
    }


    public static void isMoveValid() {

    }

/*
    public static void stepHuman(String stepHuman) {
        int x, y;

        do {
            System.out.println("Введите координаты = X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isMoveValid(x, y));
        arrayTictactoe[y][x] = stepHuman;
    }

    public static void isStepValid(x,y) {


    }
*/
}
