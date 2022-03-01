package Lesson01;

public class Lesson01 {
    public static void main(String[] args) {
        System.out.println("––––––––––––––––––––––––––––––");
        printThreeWords();
        System.out.println("––––––––––––––––––––––––––––––");
        printColor();
        System.out.println("––––––––––––––––––––––––––––––");
        compareNumbers();
        System.out.println("––––––––––––––––––––––––––––––");

    }
    //======================================================================
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    //======================================================================
    @SuppressWarnings("ConstantConditions")
    private static void printColor() {
        int numberColor = 2000;

        if (numberColor <= 0){
            System.out.println("Red");
        } else if (numberColor <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    //======================================================================
    private static void compareNumbers() {
        int a = 20;
        int b = 50;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    //======================================================================


    }


}
