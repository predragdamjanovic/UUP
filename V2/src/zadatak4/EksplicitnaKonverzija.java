package zadatak4;

public class EksplicitnaKonverzija {
    public static void main(String[] args) {

        byte b;
        int i = 25;
        double d = 323.452;
        // konverzija int u byte
        b = (byte) i;
        System.out.println("Promenjiva b: "+b);
        System.out.println("Promenjiva i: "+i);
        //konverzija double u int
        i = (int) d;
        System.out.println("Promenjiva d: "+d);
        System.out.println("Promenjiva i: "+i);
        //konverzija double u byte
        b = (byte) d;
        System.out.println("Promenjiva d: "+d);
        System.out.println("Promenjiva b: "+b);

    }
}
