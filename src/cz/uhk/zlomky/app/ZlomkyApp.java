package cz.uhk.zlomky.app;

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

        Zlomek[] poleZlomku = new Zlomek[4];
        poleZlomku[0] = a;
        poleZlomku[1] = b;
        poleZlomku[2] = c;
        poleZlomku[3] = a.deleno(b);

        Zlomek all = sumaZlomku(poleZlomku);
        System.out.println("Součet je: \n" + all);


        Number[] pole2 = new Number[8];
        for (int i = 0; i < poleZlomku.length; i++) {
            pole2[i] = poleZlomku[i];
        }
        pole2[4] = 10;
        pole2[5] = 20;
        pole2[6] = 30.025;
        pole2[7] = 40;
        double suma = 0;
        for (Number n : pole2) {
            System.out.printf("%s\n", n);
            suma += n.doubleValue();
        }
        System.out.printf("Soucet je %s\n", suma);
    }

    public static Zlomek sumaZlomku(Zlomek[] pole) {
        Zlomek soucet = new Zlomek(0, 1);
        for (Zlomek z : pole) {
            soucet = soucet.scitani(z);
        }
        return soucet.zkratit();
    }
}