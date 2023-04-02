package BuilderClasses;

public class CheeseBurgerBuilder implements BurgerBuilder{

    private Burger cheeseBurger;

    CheeseBurgerBuilder() { this.cheeseBurger = new CheeseBurger(); }

    @Override
    public void buildChifla() { this.cheeseBurger.setChifla("Chifla de alba cu seminte");}

    @Override
    public void buildCarne() { this.cheeseBurger.setCarne("Carne de vita");}

    @Override
    public void buildSos() { this.cheeseBurger.setSos("Sos de branza");}

    @Override
    public void buildLegume() { this.cheeseBurger.setLegume("Castraveti murati");}

    @Override
    public void buildCondimente() { this.cheeseBurger.setCondimente("Condimente cheeseburger");}

    public void buildBranza() { ((CheeseBurger) cheeseBurger).setBranza("Cascaval abundent!");}

    @Override
    public Burger getBurger() {
        return this.cheeseBurger;
    }
}
