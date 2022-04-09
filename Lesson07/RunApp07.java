package Lesson07;

public class RunApp07 {
    //Ввод количества еды в миске
    static int foodAmount = 140;
    static int footAdd = 100;

    public static void main(String[] args) {
        Cat[] cat = new Cat[]{
                new Cat("Мурзик", 10),
                new Cat("Барсик", 15),
                new Cat("Персик", 20)
        };

        Bowl bowl = new Bowl(foodAmount);

        System.out.println("––––––––––––––––––––––––––––––");
        System.out.println(foodAmount + " -- еды в миске");

        System.out.println("––––––––––––––––––––––––––––––");
        if (foodAmount > 0) {
            for (int i = 0; i < cat.length; i++) {
                cat[i].eatingCat(bowl);
                System.out.print(cat[i].getName() + " съел: " + cat[i].getAppetit() + " --→ в тарелке осталось: " + bowl.getFoodAmount() + " | ");
                System.out.println(cat[i].getName() + " -- " + cat[i].getCatHappy());
            }
        } else {
            System.out.println(" Еды в тарелке нет...\n Коты голодные");
        }
        System.out.println("––––––––––––––––––––––––––––––");
        bowl.incrementFoodAmount(footAdd);
        System.out.println("В миску добавили " + footAdd + " еды. Теперь в миске " + bowl.getFoodAmount());
        System.out.println("––––––––––––––––––––––––––––––");
    }
}
