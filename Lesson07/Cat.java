package Lesson07;

public class Cat {
    String name = "КотНеизвестный";
    int appetit = 0;
    String catHappy = " не ел совсем...";

    public Cat() {
    }

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public String getCatHappy() {
        return catHappy;
    }

    public void setCatHappy(String catHappy) {
        this.catHappy = catHappy;
    }

    //======================================================================
    public void eatingCat(Bowl bowl) {
        if (bowl.getFoodAmount() != 0) {
            bowl.decrementFoodAmount(this.appetit);
            if (bowl.isFoodEnough()) {
                this.catHappy = " сыт и счастлив";
            } else {
                catHappy = " поел, но не наелся";
            }
        }
    }


}
