package zadatak1;

public class GlavnaKlasa {
    public static void main(String[] args) {

        Osoba Asistent = new Osoba();

        Osoba Student = new Osoba();

        Asistent.ime = "Predrag";
        Asistent.prezime = "Damjanovic";
        Asistent.godiste = 1973;

        Student.ime = "Marko";
        Student.prezime = "Markovic";
        Student.godiste = 1977;

        Asistent.predstaviSe();
        Student.predstaviSe();
    }
}
