package Lesson07;

public class Bowl {
    int foodAmount = 0;

    public Bowl() {
    }

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public void changeFoodAmount(int appetit) {
        foodAmount -= appetit;

    }
}
