package zadatak2;

public class Krug {
    public double poluprecnik;

    public void obim() {
        System.out.println("Obim kruga je: " + 2 * poluprecnik * Math.PI);
    }

    public void povrsina() {
        System.out.println("Povrsina kruga je: " + poluprecnik * poluprecnik * Math.PI);
    }
}
