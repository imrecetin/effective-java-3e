package effective.java3e.chapter2.item2.builder;

// Builder Pattern
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;
        // Optional parameters - initialized to default values
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //If a check fails, throw an IllegalArgumentException whose detail message indicates which parameters are invalid (Item 75)
        public Builder calories(int val)
        { calories = val; return this; }
        public Builder fat(int val)
        { fat = val; return this; }
        public Builder sodium(int val)
        { sodium = val; return this; }
        public Builder carbohydrate(int val)
        { carbohydrate = val; return this; }
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }
    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}
