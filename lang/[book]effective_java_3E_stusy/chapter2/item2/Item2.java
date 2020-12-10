/**
 * item2
 */
public class Item2 {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    // public item2(int servingSize, int servings) {
    // this(servingSize, servings, 0);
    // }

    // public item2(int servingSize, int servings, int calories) {
    // this(servingSize, servings, calories, 0);
    // }

    // public item2(int servingSize, int servings, int calories, int fat) {
    // this(servingSize, servings, calories, fat, 0);
    // }

    // public item2(int servingSize, int servings, int calories, int fat, int
    // sodium) {
    // this(servingSize, servings, calories, fat, sodium, 0);
    // }

    // public item2(int servingSize, int servings, int calories, int fat, int
    // sodium, int carbohydrate) {
    // this.servingSize = servingSize;
    // this.servings = servings;
    // this.calories = calories;
    // this.fat = fat;
    // this.sodium = sodium;
    // this.carbohydrate = carbohydrate;
    // }

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            this.calories = val;
            return this;
        }

        public Builder fat(int val) {
            this.fat = val;
            return this;
        }

        public Builder sodium(int val) {
            this.sodium = val;
            return this;
        }

        public Builder carbohydrate(int val) {
            this.carbohydrate = val;
            return this;
        }

        public Item2 build() {
            return new Item2(this);
        }

    }

    private Item2(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }

    public static void main(String[] args) {
        // item2 i = new item2(240, 8, 100, 0, 35, 27);
        Item2 item2 = new Item2.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(item2.calories);// 테스트

    }
}