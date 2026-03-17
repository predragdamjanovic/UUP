package zadatak2;

public class StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String rec1 = "Java";
        String rec2 = "Programiranje";
        String rec3 = "IT";

        //StringBuilder

        StringBuilder stringBuilder = new StringBuilder(rec3);
        System.out.println(stringBuilder);

        System.out.println();

        //StringBuffer

        StringBuffer sb = new StringBuffer("Ja volim");
        sb.append(rec1);
        sb.append(" ").append(rec2);

        String recenica = sb.toString();
        System.out.println(recenica);

        System.out.println();

        //duzina i kapacitet buffer-a

        System.out.println("Duzina buffera: " + sb.length());
        System.out.println("Kapacitet buffera: " + sb.capacity());

        System.out.println();

        sb.setLength(21);
        System.out.println(sb);


        sb.ensureCapacity(112);
        System.out.println(sb);
        System.out.println("Novi kapacitet baffera: "+sb.capacity());

    }
}
