package BuilderClasses;

public class CheeseBurger implements Burger{

    private String chifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;
    private String branza;

    @Override
    public void setChifla(String chifla) { this.chifla = chifla; }

    @Override
    public void setCarne(String carne) { this.carne = carne; }

    @Override
    public void setSos(String sos) { this.sos = sos; }

    @Override
    public void setLegume(String legume) { this.legume = legume; }

    @Override
    public void setCondimente(String condimente) { this.condimente = condimente; }

    public void setBranza(String branza) { this.branza = branza; }

    @Override
    public String showDetails() {
        return "Cheeseburgerul contine: {" +
                "chifla: '" + chifla + '\'' +
                ", carne: '" + carne + '\'' +
                ", sos: '" + sos + '\'' +
                ", legume: '" + legume + '\'' +
                ", condimente: '" + condimente + '\'' +
                ", branza: '" + branza + '\'' +
                '}';
    }
}
