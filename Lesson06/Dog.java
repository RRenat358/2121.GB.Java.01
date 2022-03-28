package Lesson06;

public class Dog extends Animals {
    private int RunMax = 300;
    private int SwimMax = 100;

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

    @Override
    public void Run(int a) {
        if (RunMax >= a) {
            System.out.println("Dog run = " + a);
        } else {
            System.out.println("Dog run maximum = " + RunMax);
        }
    }
    @Override
    public void Swim(int a) {
        if (SwimMax >= a) {
            System.out.println("Dog swim = " + a);
        } else {
            System.out.println("Dog swim maximum = " + RunMax);
        }
    }


}
