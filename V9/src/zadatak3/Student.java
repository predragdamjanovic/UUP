package zadatak3;

public class Student {
    private String ime;
    private String prezime;
    private String brIndeksa;
    public int godinaStudija;

    //Podrazumevani konstruktor
    public Student() {
        ime = "Dragan";
        prezime = "Nikolic";
        brIndeksa = "141/91";
    }

    //Konstruktor sa argumentima
    public Student(String imeSt, String prezimeSt, String brIndeksaSt) {
        ime = imeSt;
        prezime = prezimeSt;
        brIndeksa = brIndeksaSt;
    }

    public void informacije() {
        System.out.println("Student " + ime + " " + prezime + " ");
        System.out.println("sa brojem indeksa " + brIndeksa + " ");
        System.out.println("je student " + godinaStudija + ". godine studija.");
    }
}
