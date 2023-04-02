package BuilderClasses;

public class HamburgerBuilder implements BurgerBuilder{
    private Burger hamburger;

    HamburgerBuilder() { this.hamburger = new Hamburger(); }

    @Override
    public void buildChifla() { this.hamburger.setChifla("Chifla neagra integrala");}

    @Override
    public void buildCarne() { this.hamburger.setCarne("Carne de porc");}

    @Override
    public void buildSos() { this.hamburger.setSos("Sos de maioneza si ketchup");}

    @Override
    public void buildLegume() { this.hamburger.setLegume("Castraveti si rosii");}

    @Override
    public void buildCondimente() { this.hamburger.setCondimente("Condimente hamburger");}

    public void buildBacon() { ((Hamburger) hamburger).setBacon("Crunchy");}

    @Override
    public Burger getBurger() {
        return this.hamburger;
    }
}
