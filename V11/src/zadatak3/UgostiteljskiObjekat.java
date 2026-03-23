package zadatak3;

public abstract class UgostiteljskiObjekat extends Objekat{

    private String naziv;

    protected UgostiteljskiObjekat(int brojProstorija, String naziv) {
        super(brojProstorija);
        this.naziv = naziv;
    }

    public String getNaziv() {
        return "Ugostiteljski objekat: "+naziv;

    }

    @Override
    public String toString() {
        return super.toString()+ "UgostiteljskiObjekat{" +
                "naziv='" + naziv + '\'' +
                '}';
    }
}
