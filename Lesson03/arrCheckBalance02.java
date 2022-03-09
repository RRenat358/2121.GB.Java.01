package Lesson03;

import java.util.Random;

public class arrCheckBalance02 {
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
        //======================================================================
        System.out.println("––– 07 ** –––––––––––––––––––––––––––");
        System.out.println("true is balance in array");
        /*      7. ** Написать метод, в который передается не пустой одномерный целочисленный массив.
        Метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
        checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1.
        (граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ)*/
        System.out.println(arrRandomToString);
        boolean isBalance = arrCheckBalance(arrayRandom, arrLength);
        System.out.println(isBalance);
        System.out.println("––––––––––––––––––––––––––––––");
    }
    //======================================================================
    private static boolean arrCheckBalance(int[] arrayRandom, int arrLength) {
        boolean isCheckElement = false;
        int iA = 0;
        int iZ = arrLength - 1;
        int arrSumElementA = arrayRandom[iA];
        int arrSumElementZ = arrayRandom[iZ];
        arrLength -= 2;
        //––––––––––––––––––––––––––––––
        while (arrLength > 1) {
            for (; arrSumElementA == arrSumElementZ && arrLength > 1; ) {
                arrLength--;
                arrLength--;
                iA++;
                iZ--;
                arrSumElementA += arrayRandom[iA];
                arrSumElementZ += arrayRandom[iZ];
            }
            for (; arrSumElementA < arrSumElementZ && arrLength > 1; ) {
                arrLength--;
                iA++;
                arrSumElementA += arrayRandom[iA];
            }
            for (; arrSumElementA > arrSumElementZ && arrLength > 1; ) {
                arrLength--;
                iZ--;
                arrSumElementZ += arrayRandom[iZ];
            }
        }
        //––––––––––––––––––––––––––––––
        while (arrLength == 1) {
            if ( arrSumElementA == arrSumElementZ ) {
                arrLength--;
                iA++;
                arrSumElementA += arrayRandom[iA]; //последний элемент можно суммировать с Любой суммой
                break;
            }
            if ( arrSumElementA < arrSumElementZ ) {
                arrLength--;
                iA++;
                arrSumElementA += arrayRandom[iA];
                break;
            }
            if ( arrSumElementA > arrSumElementZ  ) {
                arrLength--;
                iZ--;
                arrSumElementZ += arrayRandom[iZ];
                break;
            }
        }
        //––––––––––––––––––––––––––––––
        while (arrLength < 1) {
            if ( arrSumElementA == arrSumElementZ ) {
                isCheckElement = true;
                break;
            }
            if ( arrSumElementA < arrSumElementZ) {
                isCheckElement = false;
                break;
            }
            if ( arrSumElementA > arrSumElementZ ) {
                isCheckElement = false;
                break;
            }
        }
        //––––––––––––––––––––––––––––––
        return isCheckElement;
    }
}
