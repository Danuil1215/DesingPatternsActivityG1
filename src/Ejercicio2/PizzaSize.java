package Ejercicio2;

public enum PizzaSize {
    BIG(15.0),
    MEDIUM(10.0),
    SMALL(5.0);

    private Double basePrice;

    PizzaSize(Double basePrice) {
        this.basePrice = basePrice;
    }

    public Double getBasePrice() {
        return basePrice;
    }
}
