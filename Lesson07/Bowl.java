package Lesson07;

public class Bowl {
    int foodAmount = 0;
    boolean foodEnough = true;

    public Bowl() {
    }

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(int foodAmount) {
        if (this.foodAmount >= foodAmount) {
            this.foodAmount = foodAmount;
        } else this.foodAmount = 0;
    }

    public boolean isFoodEnough() {
        return foodEnough;
    }

    public void setFoodEnough(boolean foodEnough) {
        this.foodEnough = foodEnough;
    }

    //======================================================================
    public void decrementFoodAmount(int eating) {
        if (this.foodAmount >= eating) {
            this.foodAmount -= eating;
            this.foodEnough = true;
        } else {
            this.foodAmount = 0; //доедаем всё
            this.foodEnough = false;
        }
    }

    public void incrementFoodAmount(int addFood) {
        this.foodAmount += addFood;
    }

}
