package Lesson03;

import java.util.Random;


public class Lesson03 {
    public static void main(String[] args) {

        System.out.println("––– 01 –––––––––––––––––––––––––––");
        System.out.println("Инвертировать = 0 на 1, 1 на 0");
        int[] array01 = new int[10];                                  // ◀◀◀ Ввод. Размер массива
        int[] array01Invert = new int[array01.length];
        String array01ToString = "";
        String array01InvertToString = "";

        for (int i = 0; i < array01.length; i++) {
            Random random = new Random();
            array01[i] = random.nextInt(2);
            array01ToString = array01ToString + array01[i] + " ";
            if (array01[i] == 0) {
                array01Invert[i] = 1;
            } else {
                array01Invert[i] = 0;
            }
            array01InvertToString = array01InvertToString + array01Invert[i] + " ";
        }
        System.out.println(array01ToString);
        System.out.println(array01InvertToString);

        //======================================================================
        System.out.println("––– 02 –––––––––––––––––––––––––––");
        System.out.println("Массив от 1 до 100");
        int[] array100 = new int[100];                                  // ◀◀◀ Ввод. Размер массива
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
            System.out.print(array100[i] + " ");
        }
        System.out.println();

        //======================================================================
        System.out.println("––– 03 –––––––––––––––––––––––––––");
        System.out.println("Числа меньшие 6 умножить на 2");
        int[] arrayMultBy2 = new int[10];                               // ◀◀◀ ввод. Размер массива
        int[] arrayMultBy2Invert = new int[arrayMultBy2.length];
        String arrayMultBy2ToString = "";
        String arrayMultBy2InvertToString = "";

        for (int i = 0; i < array01.length; i++) {
            Random random = new Random();
            arrayMultBy2[i] = random.nextInt(10);
            arrayMultBy2ToString = arrayMultBy2ToString + arrayMultBy2[i] + " ";
            if (arrayMultBy2[i] < 6) {
                arrayMultBy2Invert[i] = arrayMultBy2[i] * 2;
            } else {
                arrayMultBy2Invert[i] = arrayMultBy2[i];
            }
            arrayMultBy2InvertToString = arrayMultBy2InvertToString + arrayMultBy2Invert[i] + " ";
        }
        System.out.println(arrayMultBy2ToString);
        System.out.println(arrayMultBy2InvertToString);

        //======================================================================
        System.out.println("––– 04 –––––––––––––––––––––––––––");
        System.out.println("Заполнить диагонали квадратного массива");
        int arraySqLength = 13;                 // ◀◀◀ ввод. Размер массива

        String[][] arraySqDiagonal = new String[arraySqLength][arraySqLength];
        for (int i = 0; i < arraySqDiagonal.length; i++) {
            for (int j = 0; j < arraySqDiagonal[i].length; j++) {
                if (i == j || i == arraySqLength - 1 - j) {
                    arraySqDiagonal[i][j] = " ⬛ ";
                } else {
                    arraySqDiagonal[i][j] = " · ";
                }
                System.out.print(arraySqDiagonal[i][j]);
            }
            System.out.println();
        }
        //======================================================================
        System.out.println("––– 05 –––––––––––––––––––––––––––");
        System.out.println("Массив длиной len, каждая ячейка равна initialValue");
        int len = 13;
        int initialValue = 5;
        arr02(len, initialValue);
        System.out.println();
        System.out.println("––– -- –––––––––––––––––––––––––––");
    }

    public static void arr02(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
