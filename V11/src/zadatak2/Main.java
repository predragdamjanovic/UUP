package zadatak2;

public class Main {
    public static void main(String[] args) {
        Krug krug = new Krug(7);
        Pravougaonik pravougaonik = new Pravougaonik(9,12);
        Trougao trougao = new Trougao(27,28);

        krug.crtaj();
        pravougaonik.crtaj();
        trougao.crtaj();

        System.out.println();

        krug.povrsina();
        pravougaonik.povrsina();
        trougao.povrsina();

        System.out.println("\n--------------------\n");


    }
    /*
    Polimorfno ponasanje metoda(metodu se
    predaje objekat tipa Oblik( u kojem se cuva objekat neke od njegovih konkretnih
    implementacija) ili objekta tipa neke od njegovih potklasa)
     */
    private static void nacrtajOblik(Oblik oblik){
        oblik.crtaj();
    }
    private static void izracunajPovrsinuOblika(Oblik oblik){
        oblik.povrsina();
    }
}
