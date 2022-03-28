package Lesson06;

public class RunApp {
    public static void main(String[] args) {
        int distanceRun = 130;
        int distanceSwim = 80;

        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("––––––––––––––––––––––––––––––");
        cat.Run(distanceRun);
        dog.Run(distanceRun);
        System.out.println("––––––––––––––––––––––––––––––");
        cat.Swim(distanceSwim);
        dog.Swim(distanceSwim);


        System.out.println("––––––––––––––––––––––––––––––");
    }
}
