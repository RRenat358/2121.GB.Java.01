package Lesson03;

import java.util.Random;

public class L03_06 {
    public static void main(String[] args){
        System.out.println("––– 06 –––––––––––––––––––––––––––");
        System.out.println("Найти в массиве Минимальное и Максимальное число");
        int[] array06 = new int[10];  // ◀◀◀ Ввод. Размер массива
        int arrMinElement = 0;
        int arrMaxElement = 0;
        String array06ToString = "";

        for (int i = 0; i < array06.length; i++) {
            Random random = new Random();
            array06[i] = random.nextInt(20);
            array06ToString = array06ToString + array06[i] + " ";
            if (arrMaxElement < array06[i]) {
                arrMaxElement = array06[i];
            }
        }
        arrMinElement = array06[0];
        for (int i : array06) {
            if (arrMinElement > i) {
                arrMinElement = i;
            }
        }
        System.out.println(array06ToString);
        System.out.printf("Минимальное == %s \nМаксимальное == %s \n", arrMinElement, arrMaxElement);
        System.out.println("––– -- –––––––––––––––––––––––––––");
    }
}
