package zadatak3;

public class Hotel extends UgostiteljskiObjekat{
    private int brojZvezdica;

    public Hotel(int brojProstorija, String naziv, int brojZvezdica) {
        super(brojProstorija, naziv);
        this.brojZvezdica = brojZvezdica;
    }

    @Override
    protected void prikaziStrukturuProstorija() {
        System.out.println("Hol, Recepcija, Apartmani...");
    }

    @Override
    public String toString() {
        return super.toString()+ "Hotel{" +
                "brojZvezdica=" + brojZvezdica +
                '}';
    }
}
