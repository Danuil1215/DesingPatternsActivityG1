package src.Exercise2;

public enum IngredientPrices {
    CHEESE_PORTION_PRICE(0.10),
    PEPPERONI_PORTION_PRICE(0.15),
    HAM_PORTION_PRICE(0.20),
    MUSHROOM_PORTION_PRICE(0.25),
    PEPPER_PORTION_PRICE(0.30),
    ONION_PORTION_PRICE(0.35),
    OLIVE_PORTION_PRICE(0.40),
    PINEAPPLE_PORTION_PRICE(0.45),
    CHEESE_COVER_PRICE(0.50);

    private Double optionPrice;

    IngredientPrices(Double optionPrice) {
        this.optionPrice = optionPrice;
    }

    public Double getOptionPrice() {
        return optionPrice;
    }
}
