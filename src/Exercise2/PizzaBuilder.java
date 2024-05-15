package src.Exercise2;

public interface PizzaBuilder {

    void setPizzaSize(PizzaSize pizzaSize);
    void setPizzaMass(PizzaMass pizzaMass);
    void setCheesePortions(Integer cheesePortions);
    void setPepperoniPortions(Integer pepperoniPortions);
    void setHamPortions(Integer hamPortions);
    void setMushroomPortions(Integer mushroomPortions);
    void setPepperPortions(Integer pepperPortions);
    void setOnionPortions(Integer onionPortions);
    void setOlivePortions(Integer olivePortions);
    void setPineapplePortions(Integer pineapplePortions);
    void setCheeseCover(Boolean hasCheeseCover);
    Pizza build();

}
