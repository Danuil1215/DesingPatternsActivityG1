package Ejercicio2;

public class PizzaBuilderImpl implements PizzaBuilder{

    private PizzaSize pizzaSize;
    private PizzaMass pizzaMass;
    private Integer cheesePortions;
    private Integer pepperoniPortions;
    private Integer hamPortions;
    private Integer mushroomPortions;
    private Integer peeperPortions;
    private Integer onionPortions;
    private Integer olivePortions;
    private Integer pineapplePortions;
    private Boolean hasCheeseCover;

    @Override
    public void setPizzaSize(PizzaSize pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    @Override
    public void setPizzaMass(PizzaMass pizzaMass) {
        this.pizzaMass = pizzaMass;
    }

    @Override
    public void setCheesePortions(Integer cheesePortions) {
        this.cheesePortions = cheesePortions;
    }

    @Override
    public void setPepperoniPortions(Integer pepperoniPortions) {
        this.pepperoniPortions = pepperoniPortions;
    }

    @Override
    public void setHamPortions(Integer hamPortions) {
        this.hamPortions = hamPortions;
    }

    @Override
    public void setMushroomPortions(Integer mushroomPortions) {
        this.mushroomPortions = mushroomPortions;
    }

    @Override
    public void setPepperPortions(Integer pepperPortions) {
        this.peeperPortions = pepperPortions;
    }

    @Override
    public void setOnionPortions(Integer onionPortions) {
        this.onionPortions = onionPortions;
    }

    @Override
    public void setOlivePortions(Integer olivePortions) {
        this.olivePortions = olivePortions;
    }

    @Override
    public void setPineapplePortions(Integer pineapplePortions) {
        this.pineapplePortions = pineapplePortions;
    }

    @Override
    public void setCheeseCover(Boolean hasCheeseCover) {
        this.hasCheeseCover = hasCheeseCover;
    }

    @Override
    public Pizza build(){
        return new Pizza(pizzaSize,
                         pizzaMass,
                         cheesePortions,
                         pepperoniPortions,
                         hamPortions,
                         mushroomPortions,
                         peeperPortions,
                         onionPortions,
                         olivePortions,
                         pineapplePortions,
                         hasCheeseCover);

    }
}
