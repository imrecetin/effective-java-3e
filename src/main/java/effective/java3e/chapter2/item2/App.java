package effective.java3e.chapter2.item2;

import effective.java3e.chapter2.item2.builder.NutritionFacts;
import effective.java3e.chapter2.item2.hierarchicalbuilder.Calzone;
import effective.java3e.chapter2.item2.hierarchicalbuilder.NyPizza;

import static effective.java3e.chapter2.item2.hierarchicalbuilder.NyPizza.Size.*;
import static effective.java3e.chapter2.item2.hierarchicalbuilder.Pizza.Topping.*;

public class App {

    public static void main(String args[]){
        //The NutritionFacts class is immutable
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM).sauceInside().build();
    }
}
