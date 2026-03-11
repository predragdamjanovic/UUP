package zadatak1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Rastojanje {
    public static void main(String[] args) {

        /*
        Celobrojni: byte, short, int i long;
        Sa pokretnim zarezom: float i double;
        Znakovni: char;
        Logicki: boolean;
         */

        final int BRZINA_SVETLOSTI = 300000;

        long brojDana, brojSekundi, rastojanje;

        brojDana = 1000;

        brojSekundi = brojDana * 24 * 60 * 60;
        rastojanje = BRZINA_SVETLOSTI * brojSekundi;

        System.out.println("Za : " + brojDana + " dana,");
        System.out.println("svetlost ce preci: ");
        System.out.println();
        System.out.println(rastojanje + "kilometara.");

    }
}
