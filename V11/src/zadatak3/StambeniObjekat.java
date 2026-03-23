package zadatak3;

public abstract class StambeniObjekat extends Objekat{

    private String podrucje;

    public StambeniObjekat(int brojProstorija, String podrucje) {
        super(brojProstorija);
        this.podrucje = podrucje;
    }

    public String getPodrucje() {
        return "Podrucje u kom se objekat nalazi: "+podrucje;
    }

    @Override
    public String toString() {
        return super.toString() +"\nStambeniObjekat {podrucje ="+podrucje+'}';
    }
}
