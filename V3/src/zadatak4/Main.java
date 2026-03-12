package zadatak4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti prirodan broj: ");
        int broj = sc.nextInt();
        if (broj % 2 == 0 && broj > 0) {
            System.out.println("Broj je paran");
        } else if (broj < 0) {
            System.out.println("Broj je negativan");
        } else if (broj == 0) {
            System.out.println("Broj je jednak nuli");
        } else {
            System.out.println("Broj je neparan");
        }
    }
}
