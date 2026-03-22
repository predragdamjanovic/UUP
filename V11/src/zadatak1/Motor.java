package zadatak1;

public class Motor extends BMW{

    public Motor(String model, int snaga, int zapremina) {
        super(model, snaga, zapremina);
        this.setTipVozila("motor");
    }

    @Override
    public String toString() {
        return "MOTOR{" +
                "tipVozila='" + getTipVozila() + '\'' +
                ", model='" + getModel() + '\'' +
                ", snaga=" + getSnaga() +
                ", zapremina=" + getZapremina() +
                '}';
    }
}
