package Lesson03;

import java.util.Random;

public class arrCheckBalance {
    public static void main(String[] args) {
        //Ввод данных здесь
        int arrLength = 5;
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

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

    //Ложные срабатывания
    //true вместо false
    //==false
    //0, 1, 2, 1
    //0, 1, 0, 0//
    //2, 1, 2, 0
    //2, 1, 1, 1
    //1, 2, 0, 1
    //0, 1, 1, 1

    //2, 0, 0, 2 ok

    //==true
    //1 0 1 0
    //1 1 0 0
    //0 1 1 2
    //0 1 0 1


    private static boolean arrCheckBalance(int[] arrayRandom, int arrLength) {
        int arrLengthCount = arrLength;
        int arrLengthCountA = 1;
        int arrLengthCountZ = 1;
//        arrayRandom = new int[]{2, 0, 0, 2};
//        System.out.println("0, 1, 1, 1");

        boolean isCheckElement = true;

        int iA = 0;
        int iZ = arrLength - 1;
        int arrSumElementA = arrayRandom[iA];
        int arrSumElementZ = arrayRandom[iZ];

        for (; arrLengthCount >= 0; ) {
            if (arrLengthCountA + arrLengthCountZ > arrLength) {
                return isCheckElement;
            }
            //––––––––––––––––––––––––––––––
            if (arrSumElementA == arrSumElementZ && arrLengthCount == 0) {
                return true;
            }
            if (arrSumElementA == arrSumElementZ && arrLengthCount == 1) {
                return false;
            }
            for (; arrSumElementA == arrSumElementZ && arrLengthCount > 1; ) {
//                isCheckElement = true;
                arrLengthCount--;
                arrLengthCount--;
                arrLengthCountA++;
                arrLengthCountZ++;
                iA++;
                iZ--;
                arrSumElementA += arrayRandom[iA];
                arrSumElementZ += arrayRandom[iZ];
                if (arrLengthCountA + arrLengthCountZ >= arrLength) {
                    break;
                }
            }
            //––––––––––––––––––––––––––––––
            for (; arrSumElementA < arrSumElementZ && arrLengthCount >= 1; ) {
                isCheckElement = false;
                arrLengthCount--;
                iA++;
                arrSumElementA += arrayRandom[iA];
                arrLengthCountA++;
                if (arrLengthCountA + arrLengthCountZ >= arrLength) {
                    return isCheckElement;
                }
            }
            //––––––––––––––––––––––––––––––
            for (; arrSumElementA > arrSumElementZ && arrLengthCount >= 1; ) {
                isCheckElement = false;
                arrLengthCount--;
                iZ--;
                arrSumElementZ += arrayRandom[iZ];
                arrLengthCountZ++;
                if (arrLengthCountA + arrLengthCountZ >= arrLength) {
                    return isCheckElement;
                }
            }
        }
        return isCheckElement;
    }
}
