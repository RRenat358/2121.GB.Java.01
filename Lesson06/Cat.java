package Lesson06;

public class Cat extends Animals{
    private int CatDistanceTraveled = 50;


    public Cat(int distanceTraveled) {
        super(distanceTraveled);
       Cat cat = new Cat(distanceTraveled);
    }

    @Override
    public void Run() {
        System.out.println("Cat run = " + CatDistanceTraveled);

    }
}
