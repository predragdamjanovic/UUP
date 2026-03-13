package zadatak6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Parni brojevi od 1 do 50");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " | ");
            }
        }
    }
}
