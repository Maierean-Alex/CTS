public class PizzaFactory {

    public static Pizza createPizza(String type){

        if(type.equals("Cheese")){
            return new CheesePizza();
        } else if (type.equals("Pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("Shrooms")) {
            return new ShroomsPizza();
        }

        return null;

    }

}
