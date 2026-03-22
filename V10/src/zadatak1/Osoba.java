package zadatak1;

public class Osoba {
    private String ime, prezime;
    private int godiste;

    public Osoba(String ime, String prezime, int godiste) {
        this.ime = ime;
        this.prezime = prezime;
        this.godiste = godiste;
    }

    public void predstaviSe() {
        System.out.println("Osoba " + ime + " " + prezime + " rodjena je " + godiste + " godine.");
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodiste() {
        return godiste;
    }

    public void setGodiste(int godiste) {
        this.godiste = godiste;
    }
}
