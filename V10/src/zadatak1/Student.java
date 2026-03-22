package zadatak1;

public class Student extends Osoba {
    private String brIndeska;

    public Student(String ime, String prezime, int godiste, String brIndeska) {
        super(ime, prezime, godiste);
        this.brIndeska = brIndeska;
    }

    public void predstaviSe() {
        System.out.println("Osoba " + getIme() + " " + getPrezime() +
                " rodjena je " + getGodiste() + " godine.");
        System.out.println("Broj indeksa studenta je: " + brIndeska);
    }

    public String getBrIndeska() {
        return brIndeska;
    }

    public void setBrIndeska(String brIndeska) {
        this.brIndeska = brIndeska;
    }
}
