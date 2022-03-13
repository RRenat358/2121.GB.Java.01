package Lesson04;

import java.util.Scanner;

public class TicTacToe {
    public static int arrMapLength = 3;
    static String[][] arrayMap = new String[arrMapLength][arrMapLength];

    public static final String cellNull = "◦";
    public static final String stepX = "✖";
    public static String stepO = "◯";


    //======================================================================
    public static void main(String[] args) {
        System.out.println("––– TicTacToe ––––––––––––––––\n");
        System.out.println("Сыграем в крестики-нолики?)");


        arrayMap(arrMapLength);
//        stepHuman();


        System.out.println("\n––––––––––––––––––––––––––––––");
    }
    //======================================================================


    public static void arrayMap(int arrMapLength) {
        System.out.print("    ");
        for (int i = 0; i < arrMapLength; i++) {
            System.out.print("y" + (i + 1) + " ");
        }
        System.out.println();
        for (int i = 0; i < arrMapLength; i++) {
            System.out.print("x" + (i + 1) + "  ");
            for (int j = 0; j < arrayMap[i].length; j++) {
                //System.out.println(j+1);
                arrayMap[i][j] = cellNull + "  ";
                System.out.print(arrayMap[i][j]);
            }
            System.out.println();
        }
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
