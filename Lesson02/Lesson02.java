package Lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        System.out.println("––––––––––––––––––––––––––––––");
        //сумма чисел в диапазоне с 10 по 20 ?
        int checkSumA = 20;
        int checkSumB = 10;
        checkSum(checkSumA, checkSumB);

        System.out.println("––––––––––––––––––––––––––––––");
        //положительное или отрицательное ?
        int positiveNumber = -1;
        positiveNumber(positiveNumber);
        System.out.println(positiveNumberBoolean(positiveNumber));

        System.out.println("––––––––––––––––––––––––––––––");
        //чётное или нет ?
        int checkEven = 0;
        checkEven(checkEven);

        System.out.println("––––––––––––––––––––––––––––––");
        //печать N строк
        int countString = 7;
        String printString = "Всё хорошо!";
        printString(printString, countString);

        System.out.println("––––––––––––––––––––––––––––––");
    }

    //======================================================================
    private static void checkSum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(a + " + " + b + " = в пределе с 10 по 20");
        } else
            System.out.println(a + " + " + b + " = за пределом с 10 по 20");
    }

    //======================================================================
    private static void positiveNumber(int a) {
        if (a >= 0) {
            System.out.println(a + " = положительное");
        } else
            System.out.println(a + " = отрицательное");
    }
    //------------------------------
    private static boolean positiveNumberBoolean(int a) {
        return a < 0;
    }

    //======================================================================
    private static void checkEven(int a) {
        if ((a % 2) == 0) {
            System.out.println(a + " = чётное");
        } else
            System.out.println(a + " = нечётное");
    }

    //======================================================================
    private static void printString(String s, int c) {
        int stringNumber = 1;
        for (; c > 0; c--) {
            System.out.println(stringNumber + ". " + s);
            stringNumber++;
        }
    }

    //======================================================================


}


