package Lesson02;

public class Lesson02 {
    public static void main(String[] args) {
        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(checkSum(2, 10));
        System.out.println("––––––––––––––––––––––––––––––");



    }

    private static boolean checkSum(int a, int b) {
        int c = a+b;
        if (c >= 10 && c <= 20) {
            return true;
        }
        return false;
    }
}
