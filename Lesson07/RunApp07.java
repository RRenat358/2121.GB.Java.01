package Lesson07;

public class RunApp07 {
    public static void main(String[] args) {
        //Ввод количества еды в миске
        int foodAmount = 20;


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
                cat[i].eating3(bowl);
                System.out.print(cat[i].getName() + " съел: " + cat[i].getAppetit() + " --→ в тарелке осталось: " + bowl.getFoodAmount() + " | ");
                System.out.println(cat[i].getName() + " -- " + cat[i].catHappy);
            }
        } else {
            System.out.print(" Еды в тарелке нет...\n Коты голодные");
        }
        System.out.println();

        System.out.println("––––––––––––––––––––––––––––––");
    }
}
