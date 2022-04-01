package Lesson07;

public class RunApp07 {
    public static void main(String[] args) {
        //Ввод количества еды в миске
        int foodAmount = 100;

        Cat cat1 = new Cat("Мурзик", 20);

        Bowl bowl = new Bowl(foodAmount);

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(foodAmount + " -- еды в миске");

        System.out.println("––––––––––––––––––––––––––––––");

/*        if (foodAmount != 0) {
            while (true) {
                if (cat1.getCatHappyScale() < 100) {
                    cat1.eating2(bowl);
                    System.out.print(" → " + bowl.getFoodAmount());
                }
                if (cat1.getCatHappyScale() == 100 || cat1.getCatHappyScale() == 0) {
                    break;
                }
            }
        } else {
            System.out.print("Еды в тарелке нет...");
        }*/
        if (foodAmount > 0) {
            cat1.eating3(bowl);
            System.out.print(cat1.getName() + " съел: " + cat1.getAppetit() + " --→ в тарелке осталось: " + bowl.getFoodAmount());
        } else {
            System.out.print("Еды в тарелке нет...");
        }




        System.out.println();

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(cat1.getName() + " -- " + cat1.catHappy);

        System.out.println("––––––––––––––––––––––––––––––");
    }
}
