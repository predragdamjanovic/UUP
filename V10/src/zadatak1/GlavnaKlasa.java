package zadatak1;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Osoba nnLice = new Osoba("Pera","Peric",1995);
        nnLice.predstaviSe();

        Student brucos = new Student("Marko","Minic",1995,"141/2017");
        brucos.predstaviSe();

        nnLice.setIme("Aleksandar");
        nnLice.setPrezime("Miskovic");
        nnLice.setGodiste(1973);
        nnLice.predstaviSe();

        brucos.setIme("Nenad");
        brucos.setPrezime("Ristic");
        brucos.setGodiste(1966);
        brucos.setBrIndeska("001/2018");
        brucos.predstaviSe();
    }
}
