package Lesson06;

public class Cat extends Animals {
    //Ввод максимальных дистанций
    private int RunMax = 100;
    private int SwimMax = 0;
//    private int a = 0;

/*

    public Cat(int distanceTraveled) {
        super(distanceTraveled);
//        System.out.println("Cat run = " + distanceTraveled);
    }

    public int getCatDistanceMax() {
        return CatDistanceMax;
    }

    public void setCatDistanceMax(int catDistanceMax) {
        CatDistanceMax = catDistanceMax;
    }
*/
/*
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }*/

    @Override
    public void Run(int a) {
        if (RunMax >= a) {
            System.out.println("Cat run = " + a);
        } else {
            System.out.println("Cat run maximum = " + RunMax);
        }
    }

    @Override
    public void Swim(int a) {
        if (SwimMax >= a) {
            System.out.println("Cat swim = " + a);
        } else {
            System.out.println("Cat swim maximum = " + SwimMax);
        }
    }

}
