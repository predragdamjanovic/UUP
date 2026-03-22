package zadatak4;

public class Dete {
    private String ime;
    private double visina;
    private double tezina;

    public Dete(String ime, double visina, double tezina) {
        this.ime = ime;
        this.visina = visina;
        this.tezina = tezina;
    }

    public void unosNoveTezine(double tezina) {
        this.tezina = tezina;
    }

    public void unosNoveVisine(double visina) {
        this.visina = visina;
    }
    public void informacije(){
        System.out.println("Ime deteta je: "+ime);
        System.out.println("Visina deteta je: "+visina);
        System.out.println("Tezina deteta je: "+tezina);
    }
}
