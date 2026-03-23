package zadatak3;

public class Kuca extends StambeniObjekat {
    private int povrsinaDvorista;

    public Kuca(int brojProstorija, String podrucje, int povrsinaDvorista) {
        super(brojProstorija, podrucje);
        this.povrsinaDvorista = povrsinaDvorista;
    }

    @Override
    protected void prikaziStrukturuProstorija() {
        System.out.println("Dnevna soba, Spavaca soba, Kuhinja, Trpezarija, Podrum...");
    }

    @Override
    public String toString() {
        return super.toString() + "Kuca{" +
                "povrsinaDvorista=" + povrsinaDvorista +
                '}';
    }
}
