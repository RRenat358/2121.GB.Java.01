package Lesson03;

import java.util.Random;

public class Lesson03 {
    public static void main(String[] args) {
        //Ввод данных здесь
        int arrLength = 4;
        int arrRandomDelta = 3;

        System.out.println("––– РандомМассив –––––––––––––––––––––––––––");
        int[] arrayRandom = new int[arrLength];
        String arrRandomToString = "";
        Random random = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(arrRandomDelta);
            arrRandomToString = arrRandomToString + arrayRandom[i] + " ";
        }
        System.out.println(arrRandomToString);
        System.out.println();
        System.out.println("––– 01 –––––––––––––––––––––––––––");
        System.out.println("Инвертировать = 0 на 1, 1 на 0");
        int[] array01 = new int[arrLength];
        int[] array01Invert = new int[array01.length];
        String array01ToString = "";
        String array01InvertToString = "";

        for (int i = 0; i < array01.length; i++) {
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
        System.out.println();
        //======================================================================
        System.out.println("––– 02 –––––––––––––––––––––––––––");
        System.out.println("Массив от 1 до 100");
        int[] array100 = new int[100];
        for (int i = 0; i < array100.length; i++) {
            array100[i] = i + 1;
            System.out.print(array100[i] + " ");
        }
        System.out.println();
        System.out.println();
        //======================================================================
        System.out.println("––– 03 –––––––––––––––––––––––––––");
        System.out.println("Числа меньшие 6 умножить на 2");
        int[] arrayMultBy2 = new int[arrLength];
        String arrayMultBy2ToString = "";

        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] < 6) {
                arrayMultBy2[i] = arrayRandom[i] * 2;
            } else {
                arrayMultBy2[i] = arrayRandom[i];
            }
            arrayMultBy2ToString = arrayMultBy2ToString + arrayMultBy2[i] + " ";
        }
        System.out.println(arrRandomToString);
        System.out.println(arrayMultBy2ToString);
        System.out.println();
        //======================================================================
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
        System.out.println("––– 05 –––––––––––––––––––––––––––");
        System.out.println("Массив длиной len, каждая ячейка равна initialValue");
        int len = arrLength;
        int initialValue = 5;
        arr02(len, initialValue);
        System.out.println();
        System.out.println();

        //======================================================================
        System.out.println("––– 06 * –––––––––––––––––––––––––––");
        System.out.println("Найти в массиве Минимальное и Максимальное число");
        int arrMinElement;
        int arrMaxElement = 0;
        for (int j : arrayRandom) {
            if (arrMaxElement < j) {
                arrMaxElement = j;
            }
        }
        arrMinElement = arrayRandom[0];
        for (int i : arrayRandom) {
            if (arrMinElement > i) {
                arrMinElement = i;
            }
        }
        System.out.println(arrRandomToString);
        System.out.printf("Минимальное == %s \nМаксимальное == %s \n", arrMinElement, arrMaxElement);
        System.out.println();

        //======================================================================
        System.out.println("––– 07 ** –––––––––––––––––––––––––––");
        System.out.println("true is balance in array");
        /*      7. ** Написать метод, в который передается не пустой одномерный целочисленный массив.
        Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1.
        (граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ)*/
        boolean isBalance = arrCheckBalance(arrayRandom, arrLength);

        System.out.println(arrRandomToString);
        System.out.println(isBalance);

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

    private static boolean arrCheckBalance(int[] arrayRandom, int arrLength) {
        int arrLengthCount = arrLength;
        boolean isCheckElement = false;

        int iA = 0;
        int iZ = arrLength - 1;
        for (; true /*iA < arrLength*/; ) {
            //––––––––––––––––––––––––––––––
            if (arrayRandom[iA] == arrayRandom[iZ]) {
                isCheckElement = true;
                arrLengthCount--;
                arrLengthCount--;

                if ((iZ + 1) - (iA + 1) <= arrLengthCount) {
                    iA++;
                    iZ++;
                    continue;
                } else {
                    break;
                }
            }
            //––––––––––––––––––––––––––––––
            if (arrayRandom[iA] < arrayRandom[iZ]) {
                isCheckElement = false;
                arrLengthCount--;

                if ((iZ + 1) - (iA + 1) <= arrLengthCount) {
                    iA++;
                    continue;
                } else {
                    break;
                }
            }
            //––––––––––––––––––––––––––––––

        }


        return isCheckElement;
    }

    //======================================================================
    public static void arr02(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i] + " ");
        }
    }
}
