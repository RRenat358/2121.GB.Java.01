package Lesson04;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();
    //Ввод данных здесь
    public static int arrMapLength = 3;
    public static final int whatStepInLineToWin = 3;

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

        while (true) {
            System.out.println("––––––––––––––––––––––––––––––");
            stepHuman();
            arrMapPrint();

//            if (checkWinHumanOrdinateX() || checkWinHumanOrdinateY()) {
            if (checkWinOrdinateX(stepX) || checkWinOrdinateY(stepX) ||
                    checkWinOrdinateXY(stepX)) {
                System.out.println("\n––––––––––––––––––––––––––––––");
                System.out.println("    Вы победили!");
                break;
            }
            if (!checkCellNull()) {
                break;
            }
            System.out.println("––––––––––––––––––––––––––––––");
            stepComp();
            arrMapPrint();
            if (checkWinOrdinateX(stepO) || checkWinOrdinateY(stepO) ||
                    checkWinOrdinateXY(stepO)) {
                System.out.println("\n––––––––––––––––––––––––––––––");
                System.out.println("    Компьютер победил!");
                break;
            }
            if (!checkCellNull()) {
                break;
            }
//            System.out.println("––––––––––––––––––––––––––––––");
//            System.out.println("    Победила дружба!)");
        }
        System.out.println("––––––––––––––––––––––––––––––");
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
    //======================================================================
    public static void stepHuman() {
        int x, y;
        while (true) {
            System.out.println("Ваш ход!");
            System.out.print("x = ");
            x = sc.nextInt() - 1;
            System.out.print("y = ");
            y = sc.nextInt() - 1;
            System.out.println("----------");
            if (x < 0 || x > arrMapLength || y < 0 || y > arrMapLength) {
                continue;
            }
            if (arrMap[x][y] == cellNull) {
                arrMap[x][y] = stepX;
                return;
            }
        }

    }

    public static void stepComp() {
        int x, y;
        while (true) {
            System.out.println("Компьютер ходит:");
            x = random.nextInt(arrMapLength);
            System.out.println("x = " + (x + 1));
            y = random.nextInt(arrMapLength);
            System.out.println("y = " + (y + 1));
            System.out.println("----------");
            if (arrMap[x][y] == cellNull) {
                arrMap[x][y] = stepO;
                return;
            }
        }
    }

    public static boolean checkCellNull() {
        for (int i = 0; i < arrMapLength; i++) {
            for (int j = 0; j < arrMapLength; j++) {
                if (arrMap[i][j] == cellNull) {
                    return true;
                }
            }
        }
        return false;
    }
    //======================================================================
    public static boolean checkWinOrdinateX(String step) {
        int tempWin;
        for (int x = 0; x < arrMapLength; x++) {
            tempWin = 0;
            for (int y = 0; y < arrMapLength; y++) {
                if (arrMap[x][y] == step) {
                    tempWin++;
                    if (tempWin == whatStepInLineToWin) {
                        return true;
                    }
                } else {
                    tempWin = 0;
                }
            }
        }
        return false;
    }
    public static boolean checkWinOrdinateY(String step) {
        int checkWin;
        for (int y = 0; y < arrMapLength; y++) {
            checkWin = 0;
            for (int x = 0; x < arrMapLength; x++) {
                if (arrMap[x][y] == step) {
                    checkWin++;
                    if (checkWin == whatStepInLineToWin) {
                        return true;
                    }
                } else {
                    checkWin = 0;
                }
            }
        }
        return false;
    }
    //======================================================================
    public static boolean checkWinOrdinateXY(String step) {
        int checkWin = 0;
        for (int x = 0, y = 0; x < arrMapLength; x++, y++) {
//            checkWin = 0;
            if (arrMap[x][y] == step) {
                checkWin++;
                if (checkWin == whatStepInLineToWin) {
                    return true;
                }
            } else {
                checkWin = 0;
            }
        }
        return false;
    }


}
