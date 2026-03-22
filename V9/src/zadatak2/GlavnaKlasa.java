package zadatak2;

public class GlavnaKlasa {
    public static void main(String[] args) {
        Krug A = new Krug();
        Krug B = new Krug();

        A.poluprecnik = 12.5;
        B.poluprecnik = 4.25;

        System.out.println("Za krug A vazi sledece: ");
        A.povrsina();
        A.obim();

        System.out.println("\n");

        System.out.println("Za krug B vazi sledece: ");
        B.povrsina();
        B.obim();
    }
}
