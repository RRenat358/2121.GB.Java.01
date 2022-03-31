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
        if (this.foodAmount <= foodAmount) {
            this.foodAmount = foodAmount;
        } else this.foodAmount = 0;
    }

    public void changeFoodAmount(int eating) {
        if (this.foodAmount >= eating) {
            this.foodAmount = eating;
        } else this.foodAmount = 0;
    }

}
