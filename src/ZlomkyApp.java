import cz.uhk.zlomky.model.Zlomek;

public class ZlomkyApp {
    public static void main(String[] args) {
        System.out.println("Zlomkoaplikace");
        Zlomek a = new Zlomek(3,4);
        Zlomek b = new Zlomek(2,5);
        Zlomek c = a.krat(b).zkratit();
        Zlomek d = a.deleno(b).zkratit();
        Zlomek e = a.scitani(b);
        Zlomek f = a.odcitani(b);
//        System.out.println(" "+a.getCitatel());
//        System.out.println("---");
//        System.out.println(" "+a.getJmenovatel());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
    }
}