package zadatak3;

public abstract class Objekat {
    private int brojProstorija;

    protected Objekat(int brojProstorija) {
        this.brojProstorija = brojProstorija;
    }

    protected abstract void prikaziStrukturuProstorija();

    public int getBrojProstorija() {
        return brojProstorija;
    }

    public void setBrojProstorija(int brojProstorija) {
        this.brojProstorija = brojProstorija;
    }

    @Override
    public String toString() {
        return "Objekat{" +
                "brojProstorija=" + brojProstorija +
                '}';
    }
}
