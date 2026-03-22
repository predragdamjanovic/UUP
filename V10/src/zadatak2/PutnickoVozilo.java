package zadatak2;

public class PutnickoVozilo extends Vozilo {
    private double zapreminaMotora;
    private int brzina = 140;

    public PutnickoVozilo(String marka, String model, double zapreminaMotora) {
        super(marka, model);
        this.zapreminaMotora = zapreminaMotora;
    }

    @Override
    public void pokreniVozilo() {
        super.pokreniVozilo();
        System.out.println("brzinom od: "+brzina+", vozilo ima :"+zapreminaMotora+" zapreminu motora");
    }

    public double getZapreminaMotora() {
        return zapreminaMotora;
    }

    public void setZapreminaMotora(double zapreminaMotora) {
        this.zapreminaMotora = zapreminaMotora;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }
}
