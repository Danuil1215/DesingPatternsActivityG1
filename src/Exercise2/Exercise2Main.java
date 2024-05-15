package src.Exercise2;

import java.text.DecimalFormat;

public class Exercise2Main {

    static DecimalFormat df = new DecimalFormat("#.00");

    public static void main(String[] args) {

        System.out.println("\nEXAMPLE 1: ");
        example1();
        System.out.println("\nEXAMPLE 2: ");
        example2();
        System.out.println("\nEXAMPLE 3: ");
        example3();

        //Add some examples as you want!
    }

    private static void example1(){
    /*
        Example 1:
        Pizza slim medium          ( $10*0.8  = $8.00 )
        1 Mushroom portion         ( 1*$0.25  = $0.25 )
        2 Ham portions             ( 2*$0.20  = $0.40 )
        Cheese Cover               (   $0.50  = $0.50 )
        Total --------------------------------> $9.15
     */
        PizzaBuilder pizzaBuilder = new PizzaBuilderImpl();
        pizzaBuilder.setPizzaSize(PizzaSize.MEDIUM);
        pizzaBuilder.setPizzaMass(PizzaMass.SLIM);
        pizzaBuilder.setMushroomPortions(1);
        pizzaBuilder.setHamPortions(2);
        pizzaBuilder.setCheeseCover(true);
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getPizzaDescription());
        System.out.println("And its price is : $"+df.format(pizza.getTotalPrice()));
    }

    private static void example2(){
    /*
        Example 2:
        Pizza integral big          ( $15*1.5  = $22.50 )
        2 Cheese portion            ( 2*$0.10  =  $0.20 )
        3 Pepperoni portions        ( 3*$0.15  =  $0.45 )
        4 Onion portions            ( 4*$0.35  =  $1.40 )
        Total -------------------------------->  $24.55
     */
        PizzaBuilder pizzaBuilder = new PizzaBuilderImpl();
        pizzaBuilder.setPizzaSize(PizzaSize.BIG);
        pizzaBuilder.setPizzaMass(PizzaMass.INTEGRAL);
        pizzaBuilder.setCheesePortions(2);
        pizzaBuilder.setPepperoniPortions(3);
        pizzaBuilder.setOnionPortions(4);
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getPizzaDescription());
        System.out.println("And its price is : $"+df.format(pizza.getTotalPrice()));
    }

    private static void example3(){
    /*
        Example 3:
        Pizza thick small           ( 1*$5.0   =  $5.00 )
        6 pepper portion            ( 6*$0.30  =  $1.80 )
        2 olive portions            ( 2*$0.40  =  $0.80 )
        1 pineapple portions        ( 1*$0.45  =  $0.45 )
        Total -------------------------------->   $8.05
     */
        PizzaBuilder pizzaBuilder = new PizzaBuilderImpl();
        pizzaBuilder.setPizzaSize(PizzaSize.SMALL);
        pizzaBuilder.setPizzaMass(PizzaMass.THICK);
        pizzaBuilder.setPepperPortions(6);
        pizzaBuilder.setOlivePortions(2);
        pizzaBuilder.setPineapplePortions(1);
        Pizza pizza = pizzaBuilder.build();
        System.out.println(pizza.getPizzaDescription());
        System.out.println("And its price is : $"+df.format(pizza.getTotalPrice()));
    }
}