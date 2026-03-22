package zadatak1;

public class Osoba {
    public String ime;
    public String prezime;
    public int godiste;

    public void predstaviSe(){
        System.out.println("Pozdrav svima!!!");
        System.out.println("Zovem se "+ime+" "+prezime+".");
        System.out.println("Rodjen sam "+godiste+". godine.");
    }
}
