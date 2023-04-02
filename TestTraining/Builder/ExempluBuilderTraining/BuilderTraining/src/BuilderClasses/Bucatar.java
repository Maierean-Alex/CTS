package BuilderClasses;

public class Bucatar {

    private BurgerBuilder builder;

    Bucatar(BurgerBuilder builder) { this.builder = builder; }

    public void buildBurger(){

        builder.buildChifla();
        builder.buildCarne();
        builder.buildSos();
        builder.buildLegume();
        builder.buildCondimente();

        if(builder instanceof CheeseBurgerBuilder){
            ((CheeseBurgerBuilder)builder).buildBranza();
        }else {
            ((HamburgerBuilder)builder).buildBacon();
        }

    }

    public Burger getBurger() { return builder.getBurger(); }

}
