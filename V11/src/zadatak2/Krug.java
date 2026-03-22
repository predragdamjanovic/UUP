package zadatak2;

public class Krug extends Oblik{
    private int r;
    public Krug(int r){
        this.r = r;
    }

    @Override
    public void crtaj() {
        System.out.println("Crtam krug");
    }

    @Override
    public void povrsina() {
        System.out.println("Povrsina: "+r*r*Math.PI);
    }
}
