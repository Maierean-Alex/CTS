package BuilderClasses;

public class Main {
    public static void main(String[] args) {

        BurgerBuilder builder = new CheeseBurgerBuilder();
        Bucatar bucatar = new Bucatar(builder);
        bucatar.buildBurger();
        Burger burger = bucatar.getBurger();
        System.out.println(burger.showDetails());

        builder = new HamburgerBuilder();
        bucatar = new Bucatar(builder);
        bucatar.buildBurger();
        burger = bucatar.getBurger();
        System.out.println(burger.showDetails());

    }
}