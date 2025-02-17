import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");
        Zlomek a = new Zlomek(1,2);
//        System.out.println(" "+a.getCitatel());
//        System.out.println("---");
//        System.out.println(" "+a.getJmenovatel());
        System.out.println(a.toString());
    }
}