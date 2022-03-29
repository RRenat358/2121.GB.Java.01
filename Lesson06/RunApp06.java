package Lesson06;

public class RunApp06 {
    public static void main(String[] args) {
        //Ввод дистанций
        int distanceRun = 130;
        int distanceSwim = 80;
//        int CatRunMax = 100;



        Cat cat = new Cat();
        Dog dog = new Dog();
//        NoAnimal  = new NoAnimal();



        System.out.println("––––––––––––––––––––––––––––––");
        cat.Run(distanceRun);
        dog.Run(distanceRun);

        System.out.println("––––––––––––––––––––––––––––––");
        cat.Swim(distanceSwim);
        dog.Swim(distanceSwim);

        System.out.println("––––––––––––––––––––––––––––––");



        System.out.println("––––––––––––––––––––––––––––––");
    }



}
