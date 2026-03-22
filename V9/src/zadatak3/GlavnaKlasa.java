package zadatak3;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Student A = new Student();

        A.godinaStudija = 3;
        A.informacije();

        Student B = new Student("Milena", "Dravic", "096/94");
        B.godinaStudija = 1;
        B.informacije();
    }
}
