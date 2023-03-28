public class Main {
    public static void main(String[] args) {

        PizzaFactory.createPizza("Cheese");
        PizzaFactory.createPizza("Pepperoni");
        PizzaFactory.createPizza("Shrooms");

        AnimalFactory af1, af2, af3;

        af1 = new DogFactory();
        af1.createAnimal();

        af2 = new CatFactory();
        af2.createAnimal();

        af3 = new CapibaraFactory();
        af3.createAnimal();

    }
}