package Lesson06;

public abstract class Animals {
    private int distanceTraveled = 0;

    public Animals(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public abstract void Run();
}
