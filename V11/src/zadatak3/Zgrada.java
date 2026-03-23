package zadatak3;

public class Zgrada extends StambeniObjekat {
    private int brojSpratova;

    public Zgrada(int brojProstorija, String podrucje, int brojSpratova) {
        super(brojProstorija, podrucje);
        this.brojSpratova = brojSpratova;
    }

    @Override
    protected void prikaziStrukturuProstorija() {
        System.out.println(
                "Dnevna soba sa kuhinjom i trpezarijom,..."
        );
    }

    @Override
    public String toString() {
        return super.toString()+ "Zgrada{" +
                "brojSpratova=" + brojSpratova +
                '}';
    }
}
