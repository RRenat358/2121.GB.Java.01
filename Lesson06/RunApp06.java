package Lesson06;

public class RunApp06 {
    public static void main(String[] args) {
        //Ввод дистанций
        int distanceRun = 130;
        int distanceSwim = 80;
//        int CatRunMax = 100;
        int attendance = 0;


        Cat cat = new Cat();
        Dog dog = new Dog();
        NoAnimal noAnimal = new NoAnimal();

        if (cat instanceof Animals) {
            System.out.println("В animal действительно лежит кот");
        }
        if (noAnimal instanceof Animals) {
            System.out.println("В animal действительно лежит кот");
        }
        Cat.Run();

        System.out.println("––––––––––––––––––––––––––––––");
        cat.Run(distanceRun);
        dog.Run(distanceRun);

        System.out.println("––––––––––––––––––––––––––––––");
        cat.Swim(distanceSwim);
        dog.Swim(distanceSwim);

        System.out.println("––––––––––––––––––––––––––––––");
//        HowManyAnimals(cat);
        HowManyAnimals(noAnimal);


        System.out.println("––––––––––––––––––––––––––––––");
    }

    private static void HowManyAnimals(String animal) {
//        animals.Run(0);
        if (animal instanceof Animals) {
            System.out.println("В animal действительно лежит кот");
        }



    }
}
