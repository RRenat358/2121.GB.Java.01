package Lesson07;

public class Cat {
    String name = "КотНеизвестный";
    int appetit = 0;

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

    //======================================================================
//    public void eating(Bowl nFoot) {
//        nFoot.changeFoodAmount(getAppetit());
//    }

    public void eating2(Bowl bowl) {
        bowl.setFoodAmount(bowl.getFoodAmount() - getAppetit());
    }

}
