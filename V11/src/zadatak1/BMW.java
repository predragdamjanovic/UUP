package zadatak1;

public class BMW {
    private String tipVozila;
    private String model;
    private int snaga;
    private int zapremina;

    /*
    private - samo u klasi,
    public - svuda u projektu,
    protected - samo u okviru paketa i potklasama
    i
    default - samo u okviru paketa
     */
    protected BMW(String model, int snaga, int zapremina) {
        this.model = model;
        this.snaga = snaga;
        this.zapremina = zapremina;
    }

    public String getTipVozila() {
        return tipVozila;
    }

    public void setTipVozila(String tipVozila) {
        this.tipVozila = tipVozila;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSnaga() {
        return snaga;
    }

    public void setSnaga(int snaga) {
        this.snaga = snaga;
    }

    public int getZapremina() {
        return zapremina;
    }

    public void setZapremina(int zapremina) {
        this.zapremina = zapremina;
    }

    @Override
    public String toString() {
        return "BMW{" +
                "tipVozila='" + tipVozila + '\'' +
                ", model='" + model + '\'' +
                ", snaga=" + snaga +
                ", zapremina=" + zapremina +
                '}';
    }
}
