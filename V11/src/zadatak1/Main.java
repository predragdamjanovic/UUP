package zadatak1;

public class Main {
    public static void main(String[] args) {
        // POLIMORFIZAM - cuvanje objekta tipa potklase u promenjivoj tipa natklase
        BMW automobil = new Automobil("PEUGEOT 308", 120, 1600);
        BMW motor = new Motor("M1000RR", 212, 999);

        System.out.println(automobil);
        System.out.println();
        System.out.println(motor);
    }
}
