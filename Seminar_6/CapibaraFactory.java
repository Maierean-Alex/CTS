public class CapibaraFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Capibara();
    }
}
