package Lesson06;

public abstract class Animals {
    protected static int animalCount = 0;

    public static int getAnimalCount() {
        return animalCount;
    }

    public static void setAnimalCount(int animalCount) {
        Animals.animalCount = animalCount;
    }
    //======================================================================
    public abstract void Run(int a);
    public abstract void Swim(int a);
}
