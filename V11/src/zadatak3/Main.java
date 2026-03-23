package zadatak3;

public class Main {
    public static void main(String[] args) {
        StambeniObjekat kuca= new Kuca(7,"selo",15);
        StambeniObjekat zgrada = new Zgrada(3,"grad",6);

        UgostiteljskiObjekat hotel = new Hotel(2,"FFF",5);
        UgostiteljskiObjekat restoran = new Restoran(4,"GGG",2);

        kuca.prikaziStrukturuProstorija();
        System.out.println();

        zgrada.prikaziStrukturuProstorija();
        System.out.println();

        hotel.prikaziStrukturuProstorija();
        System.out.println();

        restoran.prikaziStrukturuProstorija();
        System.out.println();

        System.out.println("-----------------------------");

        kuca.getPodrucje();
        zgrada.getPodrucje();

        hotel.getNaziv();
        restoran.getNaziv();

        System.out.println("-----------------------------");

        kuca.getBrojProstorija();
        zgrada.getBrojProstorija();

        hotel.getBrojProstorija();
        restoran.getBrojProstorija();
    }
}
