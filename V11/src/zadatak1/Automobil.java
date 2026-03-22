package zadatak1;

public class Automobil extends BMW {
    protected Automobil(String model, int snaga, int zapremina) {
        super(model, snaga, zapremina);
        this.setTipVozila("automobil");
    }

    @Override
    public String toString() {
        return "ATOMOBIL{" +
                "tipVozila='" + getTipVozila() + '\'' +
                ", model='" + getModel() + '\'' +
                ", snaga=" + getSnaga() +
                ", zapremina=" + getZapremina() +
                '}';
    }
}

