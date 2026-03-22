package zadatak2;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Vozilo nnAuto = new Vozilo("Fiat","500l");
        PutnickoVozilo mojAuto = new PutnickoVozilo("Peugeot","308 GT Line",1.6);

        nnAuto.pokreniVozilo();
        mojAuto.pokreniVozilo();

        mojAuto.setBrzina(120);
        mojAuto.setMarka("Fiat");
        mojAuto.setModel("Grande Punto");

        mojAuto.pokreniVozilo();
    }
}
