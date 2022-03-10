package Lesson03;



import java.util.Arrays;
import java.util.Random;

public class ArrShift {
    public static void main(String[] args) {
        //Ввод данных здесь
        int arrLength = 9;
        int arrRandomDelta = 99;
        int nShift = 1;

        System.out.println("––– РандомМассив –––––––––––––––––––––––––––");
        int[] arrayRandom = new int[arrLength];
        Random random = new Random();
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = random.nextInt(arrRandomDelta);
        }
        //======================================================================
        System.out.println("––– 08 *** –––––––––––––––––––––––––––");
        System.out.println("ArrayShift N elements");
/*
        8. *** Написать метод, которому на вход подается одномерный массив
        и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично.
        Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры:
        [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
        [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.
*/
        System.out.println("N == " + nShift);
        System.out.println(Arrays.toString(arrayRandom));
        System.out.println(Arrays.toString(arrShift(arrayRandom, nShift)));
        System.out.println("––––––––––––––––––––––––––––––");
    }
    //======================================================================
    private static int[] arrShift(int[] arrayRandom, int nShift) {
        int arrLength = arrayRandom.length;
        int temp1 = 0;

        for (int i = 0; i < nShift; i++) {
            temp1 = arrayRandom[0];
            //Подсказала ИДЕА:
            //System.arraycopy(arrayRandom, 1, arrayRandom, 0, arrLength - 1);
            //Почитал про этот метод, работает быстрее чем цикл.
            //Это мой метод)):
            for (int i2 = 0; i2 < arrLength - 1; i2++) {
                arrayRandom[i2] = arrayRandom[i2 + 1];
            }
            arrayRandom[arrLength - 1] = temp1;
        }
        return arrayRandom;
    }
}
