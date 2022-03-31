package Lesson07;

public class RunApp07 {
    public static void main(String[] args) {
        //Ввод дистанций
        int foodAmountR = 130;


        Cat cat1 = new Cat("Мурзик", 10);
//        Cat cat2 = new Cat();
//        Cat cat3 = new Cat();

        Bowl bowl = new Bowl(foodAmountR);

        System.out.println("––––––––––––––––––––––––––––––");
//        System.out.println(bowl.getFoodAmount());
//        cat1.eating(bowl.getFoodAmount());

//        int a;
//        a = cat1.eating();
        int b;
        b = bowl.getFoodAmount() - cat1.getAppetit();



        System.out.println("––––––––––––––––––––––––––––––");
//        cat.Swim(distanceSwim);
//        dog.Swim(distanceSwim);

        System.out.println("––––––––––––––––––––––––––––––");
//        System.out.printf(" %s съел -- %s \n В миске осталось -- %s \n", cat1.getName(), cat1.getAppetit(), bowl.getFoodAmount());
        System.out.printf(" %s съел -- %s \n В миске осталось -- %s \n", cat1.getName(), cat1.getAppetit(), b);

        System.out.println("––––––––––––––––––––––––––––––");
    }
}
