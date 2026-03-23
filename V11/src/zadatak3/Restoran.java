package zadatak3;

public class Restoran extends UgostiteljskiObjekat{
    private int brojSala;

    public Restoran(int brojProstorija, String naziv, int brojSala) {
        super(brojProstorija, naziv);
        this.brojSala = brojSala;
    }

    @Override
    protected void prikaziStrukturuProstorija() {
        System.out.println("Lobi, sale, kuhinja...");
    }

    @Override
    public String toString() {
        return super.toString()+ "Restoran{" +
                "brojSala=" + brojSala +
                '}';
    }
}
