package zadatak3;

public class Matematika {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;

        double zbir, razlika, proizvod, kolicnik, ostatak, kvadrat, koren;
        /*
        Koristeci klasu Math iz javine biblioteke java.lang.Math,
        izvrsavamo osnovne i slozenije aritmeticke operacije
         */
        zbir = Math.addExact(a, b);
        razlika = Math.subtractExact(a, b);
        proizvod = Math.multiplyExact(a, b);
        kolicnik = Math.floorDiv(a, b);
        ostatak = Math.floorMod(a, b);
        kvadrat = Math.pow(a, 2);
        koren = Math.sqrt(b);

        System.out.println("zbir = " + zbir);
        System.out.println("razlika = " + razlika);
        System.out.println("proizvod = " + proizvod);
        System.out.println("kolicnik = " + kolicnik);
        System.out.println("ostatak = " + ostatak);
        System.out.println("kvadrat = " + kvadrat);
        System.out.println("kvadrat = " + kvadrat);
        System.out.println("koren = " + koren);
    }
}
