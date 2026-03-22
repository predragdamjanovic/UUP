package zadatak2;

public class Pravougaonik extends Oblik {
    private int a, b;

    public Pravougaonik(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void crtaj() {
        System.out.println("Crtam pravougaonik");
    }

    @Override
    public void povrsina() {
        System.out.println("Povrsina: "+a*b);
    }
}
