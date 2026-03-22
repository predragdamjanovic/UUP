package zadatak2;

public class Trougao extends Oblik {
    private int c, h_c;

    public Trougao(int c, int h_c) {
        this.c = c;
        this.h_c = h_c;
    }

    @Override
    public void crtaj() {
        System.out.println("Crtam trougao!");
    }

    @Override
    public void povrsina() {
        System.out.println("Povrsina: " + c * h_c / 2);
    }

}
