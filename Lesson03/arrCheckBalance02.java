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

        int isBalance = arrCheckBalance(arrayRandom, arrLength);
        System.out.println(isBalance);

        //======================================================================
        System.out.println("––––––––––––––––––––––––––––––");
    }

    //Ложные срабатывания

    //должно быть ==false
    //0, 1, 2, 1
    //0, 1, 0, 0//
    //2, 1, 2, 0
    //2, 1, 1, 1
    //1, 2, 0, 1
    //0, 1, 1, 1

    //2, 0, 0, 2 ok

    //должно быть ===true
    //1, 0, 1, 0
    //0, 1, 0, 1
    //1, 1, 0, 0
    //0, 1, 1, 2
    //1, 1, 2, 0

    //0, 2, 1, 1


    private static int arrCheckBalance(int[] arrayRandom, int arrLength) {
        int arrLengthCount = arrLength;
        int arrLengthCountA = 1;
        int arrLengthCountZ = 1;
//        arrayRandom = new int[]{0, 2, 1, 1};
//        System.out.println("0, 2, 1, 1");

        int isCheckElement = 0;

        int iA = 0;
        int iZ = arrLength - 1;
        int arrSumElementA = arrayRandom[iA];
        int arrSumElementZ = arrayRandom[iZ];

        //todo arrLength > 1 ==================================================
        for (; arrLength > 1; ) {

            for (; arrSumElementA == arrSumElementZ && arrLength > 1; ) {
                isCheckElement = 11; //todo true
                arrLength--;
                arrLength--;
                iA++;
                iZ--;
                arrSumElementA += arrayRandom[iA];
                arrSumElementZ += arrayRandom[iZ];
            }
            //––––––––––––––––––––––––––––––
            for (; arrSumElementA < arrSumElementZ && arrLength > 1; ) {
                isCheckElement = 22; //todo false
                arrLength--;
                iA++;
                arrSumElementA += arrayRandom[iA];
            }
            //––––––––––––––––––––––––––––––
            for (; arrSumElementA > arrSumElementZ && arrLength > 1; ) {
                isCheckElement = 33; //todo false
                arrLength--;
                iZ--;
                arrSumElementZ += arrayRandom[iZ];
            }
        }
        //todo arrLength > 1 ==================================================
        for (; arrLength == 1; ) {
            for (; arrSumElementA == arrSumElementZ; ) {
                isCheckElement = 111; //todo false
            }
            for (; arrSumElementA < arrSumElementZ; ) {
                isCheckElement = 222; //todo false
                arrLength--;
                iA++;
                arrSumElementA += arrayRandom[iA];
            }
            for (; arrSumElementA > arrSumElementZ ; ) {
                isCheckElement = 333; //todo false
                arrLength--;
                iZ--;
                arrSumElementZ += arrayRandom[iZ];
            }
        }
        //todo arrLength > 1 ==================================================
        for (; arrLength == 0; ) {
            for (; arrSumElementA == arrSumElementZ; ) {
                isCheckElement = 1111; //todo true
            }
            for (; arrSumElementA < arrSumElementZ; ) {
                isCheckElement = 2222; //todo false
            }
            for (; arrSumElementA > arrSumElementZ ; ) {
                isCheckElement = 3333; //todo false
            }
        }

        return isCheckElement;
    }
}
