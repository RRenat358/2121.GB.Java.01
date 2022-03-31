package Lesson07;

public class RunApp07 {
    public static void main(String[] args) {
        //Ввод дистанций
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
        System.out.println("В соревнованиях участвовало: " + cat.getAnimalCount() + " животных.");

        System.out.println("––––––––––––––––––––––––––––––");
    }
}
