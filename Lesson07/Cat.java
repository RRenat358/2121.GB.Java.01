package Lesson07;

public class Cat {
    String name = "КотНеизвестный";
    int appetit = 0;
    int catHappyScale = 0;
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

    public int getCatHappyScale() {
        return catHappyScale;
    }

    public void setCatHappyScale(int catHappyScale) {
        this.catHappyScale = catHappyScale;
    }

    //======================================================================
    public void eating2(Bowl bowl) {
        if (bowl.getFoodAmount() == getAppetit() && bowl.getFoodAmount() != 0) {
            bowl.changeFoodAmount(bowl.getFoodAmount() - getAppetit());
            setCatHappyScale(100);
        }
        if (bowl.getFoodAmount() > getAppetit()) {
            bowl.changeFoodAmount(bowl.getFoodAmount() - getAppetit());
            setCatHappyScale(50);
        }
        if (bowl.getFoodAmount() == 0) {
            setCatHappyScale(0);
        }

        //todo процент сытости
        switch (getCatHappyScale()) {
            case (0):
                catHappy = "голодный"; //todo сейчас не задействовано
            case (50):
                catHappy = "не наелся"; //todo сейчас не задействовано
            case (100):
                catHappy = "сыт и счастлив";
        }
    }

    public void eating3(Bowl bowl) {
        if (bowl.getFoodAmount() == getAppetit() && bowl.getFoodAmount() != 0) {
            bowl.changeFoodAmount(bowl.getFoodAmount() - getAppetit());
            setCatHappyScale(100);
        }
        if (bowl.getFoodAmount() > getAppetit()) {
            bowl.changeFoodAmount(bowl.getFoodAmount() - getAppetit());
            setCatHappyScale(50);
        }
        if (bowl.getFoodAmount() == 0) {
            setCatHappyScale(0);
        }
    }


}
