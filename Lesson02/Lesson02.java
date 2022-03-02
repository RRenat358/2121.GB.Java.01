package Lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        System.out.println("––––––––––––––––––––––––––––––");
        int checkSumA = 20;
        int checkSumB = 10;
        checkSum(checkSumA, checkSumB);
        System.out.println("––––––––––––––––––––––––––––––");
        checkEven(0);
        System.out.println("––––––––––––––––––––––––––––––");


    }


    private static void checkSum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println(a + " + " + b + " = в пределе с 10 по 20");
        } else
            System.out.println(a + " + " + b + " = за пределом с 10 по 20");
    }

    private static void checkEven(int a) {
        if ((a % 2) == 0) {
            System.out.println(a + " = положительное");
        } else
            System.out.println(a + " = отрицательное");

    }
}
