package Lesson06;

public abstract class Animal {
    private static int animalCount = 0;

    public Animal() {
        animalCount++;
    }

    public Animal(int animalCount) {
        this.animalCount = animalCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    //======================================================================
    public abstract void Run(int a);

    public abstract void Swim(int a);
}
