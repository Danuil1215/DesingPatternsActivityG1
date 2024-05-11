package Ejercicio2;

import java.util.Objects;

public class Pizza {

    private PizzaSize pizzaSize;
    private PizzaMass pizzaMass;
    private Integer cheesePortions;
    private Integer pepperoniPortions;
    private Integer hamPortions;
    private Integer mushroomPortions;
    private Integer pepperPortions;
    private Integer onionPortions;
    private Integer olivePortions;
    private Integer pineapplePortions;
    private Boolean hasCheeseCover;

    public Pizza(PizzaSize pizzaSize, PizzaMass pizzaMass, Integer cheesePortions, Integer pepperoniPortions, Integer hamPortions, Integer mushroomPortions, Integer peeperPortions, Integer onionPortions, Integer olivePortions, Integer pineapplePortions, Boolean hasCheeseCover) {
        this.pizzaSize = pizzaSize;
        this.pizzaMass = pizzaMass;
        this.cheesePortions = cheesePortions;
        this.pepperoniPortions = pepperoniPortions;
        this.hamPortions = hamPortions;
        this.mushroomPortions = mushroomPortions;
        this.pepperPortions = peeperPortions;
        this.onionPortions = onionPortions;
        this.olivePortions = olivePortions;
        this.pineapplePortions = pineapplePortions;
        this.hasCheeseCover = hasCheeseCover;
    }

    public Double getTotalPrice(){
        Double result = 0.0;

        if(Objects.nonNull(pizzaSize) && Objects.nonNull(pizzaMass) ){
            result += pizzaSize.getBasePrice()*pizzaMass.getThicknessMultiplierFactor();
        }

        if(Objects.nonNull(cheesePortions)){
            result += cheesePortions*IngredientPrices.CHEESE_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(pepperoniPortions)){
            result += pepperoniPortions*IngredientPrices.PEPPERONI_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(hamPortions)){
            result += hamPortions*IngredientPrices.HAM_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(mushroomPortions)){
            result += mushroomPortions*IngredientPrices.MUSHROOM_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(pepperPortions)){
            result += pepperPortions*IngredientPrices.PEPPER_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(onionPortions)){
            result += onionPortions*IngredientPrices.ONION_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(olivePortions)){
            result += olivePortions*IngredientPrices.OLIVE_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(pineapplePortions)){
            result += pineapplePortions*IngredientPrices.PINEAPPLE_PORTION_PRICE.getOptionPrice();
        }

        if(Objects.nonNull(hasCheeseCover)){
            result += hasCheeseCover ? IngredientPrices.CHEESE_COVER_PRICE.getOptionPrice() : 0;
        }

        return result;
    }

    public String getPizzaDescription(){
        StringBuilder stringBuilder = new StringBuilder();
        if(Objects.nonNull(pizzaSize) && Objects.nonNull(pizzaMass) ){
            stringBuilder.append("The pizza ");
            stringBuilder.append(pizzaSize + " " + pizzaMass+" contains : \n");
        }

        if(Objects.nonNull(cheesePortions)){
            stringBuilder.append("- "+cheesePortions+" cheese portions \n");
        }

        if(Objects.nonNull(pepperoniPortions)){
            stringBuilder.append("- "+pepperoniPortions+" pepperoni portions \n");
        }

        if(Objects.nonNull(hamPortions)){
            stringBuilder.append("- "+hamPortions+" ham portions \n");
        }

        if(Objects.nonNull(mushroomPortions)){
            stringBuilder.append("- "+mushroomPortions+" mushroom portions \n");
        }

        if(Objects.nonNull(pepperPortions)){
            stringBuilder.append("- "+pepperPortions+" pepper portions \n");
        }

        if(Objects.nonNull(onionPortions)){
            stringBuilder.append("- "+onionPortions+" onion portions \n");
        }

        if(Objects.nonNull(olivePortions)){
            stringBuilder.append("- "+olivePortions+" olive portions \n");
        }

        if(Objects.nonNull(pineapplePortions)){
            stringBuilder.append("- "+pineapplePortions+" pineapple portions \n");
        }

        if(Objects.nonNull(hasCheeseCover) && hasCheeseCover.booleanValue()){
            stringBuilder.append("- cheese cover \n");
        }

        stringBuilder.append("------------------------");

        return stringBuilder.toString();
    }
}
