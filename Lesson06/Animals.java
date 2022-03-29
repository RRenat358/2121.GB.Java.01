package Lesson06;

public abstract class Animals {
    protected static int animalCount = 0;

    public Animals() {
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }
    //======================================================================
    public abstract void Run(int a);
    public abstract void Swim(int a);
}
