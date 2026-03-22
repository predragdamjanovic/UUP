package zadatak2;

public class Vozilo {
    private String marka;
    private String model;

    public Vozilo(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public void pokreniVozilo(){
        System.out.println("Vozilo "+marka+" ("+model+") se krece");
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
