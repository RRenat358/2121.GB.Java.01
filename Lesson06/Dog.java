package Lesson06;

public class Dog extends Animals {
    //Ввод максимальных дистанций
    private int runMax = 300;
    private int swimMax = 100;

    public Dog() {
        animalCount++;
    }

    public Dog(int runMax, int swimMax) {
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
            System.out.println("Dog run = " + a);
        } else {
            System.out.println("Dog run maximum = " + runMax);
        }
    }

    @Override
    public void Swim(int a) {
        if (swimMax >= a) {
            System.out.println("Dog swim = " + a);
        } else {
            System.out.println("Dog swim maximum = " + swimMax);
        }
    }


}
