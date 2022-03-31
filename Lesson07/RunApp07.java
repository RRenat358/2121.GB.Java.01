package Lesson07;

public class RunApp07 {
    public static void main(String[] args) {
        //Ввод количества еды в миске
        int foodAmount = 70;


        Cat cat1 = new Cat("Мурзик", 20);
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();

        Bowl bowl = new Bowl(foodAmount);

        System.out.println("––––––––––––––––––––––––––––––");
//        System.out.println(bowl.getFoodAmount());
//        cat1.eating(bowl.getFoodAmount());

//        int a1;
//        a1 = cat1.eating(foodAmountR);
//        System.out.println(a1);

//        int a2;
//        a2 = bowl.getFoodAmount() - cat1.getAppetit();
//        System.out.println(a2);

//        int a3;

//        System.out.println(cat1.eating(bowl));
//        bowl.getFoodAmount() = a3;
//        bowl.foodAmount = a3;

//        cat1.eating(bowl);


        System.out.println(foodAmount + " -- еды в миске");
        System.out.println("––––––––––––––––––––––––––––––");
//        System.out.println(bowl.changeFoodAmount(foodAmountR));


//        cat1.eating(bowl);
//        System.out.println(bowl.getFoodAmount());
//        cat1.eating(bowl);
//        System.out.println(bowl.getFoodAmount());


//        cat1.eating2(bowl);
//        System.out.println(bowl.getFoodAmount());
//        cat1.eating2(bowl);
//        System.out.println(bowl.getFoodAmount());
//        cat1.eating2(bowl);
//        System.out.println(bowl.getFoodAmount());

/*        do {
            cat1.eating2(bowl);
            System.out.println(bowl.getFoodAmount());
        } while (cat1.getCatHappyScale()<100);*/

/*        for (;cat1.getCatHappyScale()<100;){
            cat1.eating2(bowl);
            System.out.println(bowl.getFoodAmount());
        }*/

//        for (;cat1.getCatHappyScale()<100;){
        System.out.print(cat1.getName() + " ест:");
        while (true) {
            if (cat1.getCatHappyScale() < 100) {
                cat1.eating2(bowl);
                System.out.print(" → " + bowl.getFoodAmount());
            }
            if (cat1.getCatHappyScale() == 100 || cat1.getCatHappyScale() == 0) {
                break;
            }
        }
        System.out.println();

        System.out.println("––––––––––––––––––––––––––––––");
//        System.out.printf(" %s съел -- %s \n В миске осталось -- %s \n", cat1.getName(), cat1.getAppetit(), bowl.getFoodAmount());
//        System.out.printf(" %s съел -- %s \n В миске осталось -- %s \n", cat1.getName(), cat1.getAppetit(), b);
        System.out.println(cat1.getName() + " -- " + cat1.catHappy);

        System.out.println("––––––––––––––––––––––––––––––");
    }
}
