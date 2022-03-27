package Lesson06;

public class Cat extends Animals {
    private int CatDistanceMax = 100;

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
        if (CatDistanceMax >= a) {
            System.out.println("Cat run = " + a);
        } else {
            System.out.println("Cat run maximum = " + CatDistanceMax);
        }
    }

}
