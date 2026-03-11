package zadatak2;

public class PrimerZaChar {
    public static void main(String[] args) {
        char slovo1, slovo2;

        slovo1 = 88;
        slovo2 = 'Y';
        System.out.println("Koristili smo slova");
        System.out.println(slovo1 + "  i  " + slovo2);
        char slovo3 = 'A';
        System.out.println("Sada smo zadali slovo: " + slovo3);
        slovo3++;
        // povecali smo slovo 3 za 1
        System.out.println("Sada slovo A postaje: " + slovo3);
    }
}
