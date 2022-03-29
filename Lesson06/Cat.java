package Lesson06;

public class Cat extends Animals {
    //Ввод максимальных дистанций
    private int runMax = 100;
    private int swimMax = 0;

    public Cat() {
        animalCount++;
    }

    public Cat(int runMax, int swimMax) {
        this.runMax = runMax;
        this.swimMax = swimMax;
    }

    public int getRunMax() {
        return runMax;
    }

    public void setRunMax(int runMax) {
        this.runMax = runMax;
        if (runMax < 0) {
            this.runMax = 0;
        }
    }

    public int getSwimMax() {
        return swimMax;
    }

    public void setSwimMax(int swimMax) {
        this.swimMax = swimMax;
        if (swimMax < 0) {
            this.swimMax = 0;
        }
    }

    //======================================================================
    @Override
    public void Run(int a) {
        if (runMax >= a) {
            System.out.println("Cat run = " + a);
        } else {
            System.out.println("Cat run maximum = " + runMax);
        }
    }

    @Override
    public void Swim(int a) {
        //На случай, если какой-нибудь из экземпляров Cat всё же захочет)) проплыть
        if (swimMax > a) {
            System.out.println("Cat swim = " + a);
        } else {
            System.out.println("Cat swim maximum = " + swimMax);
        }
    }

}
