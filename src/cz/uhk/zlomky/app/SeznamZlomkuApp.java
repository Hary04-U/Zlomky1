package cz.uhk.zlomky.app;

import cz.uhk.zlomky.model.SeznamZlomku;
import cz.uhk.zlomky.model.Zlomek;

public class SeznamZlomkuApp {

    public static void main(String[] args) {
        SeznamZlomku seznam = new SeznamZlomku();
        seznam.pridatZlomek(new Zlomek(1, 2));
        seznam.pridatZlomek(new Zlomek(2, 3));
        seznam.pridatZlomek(new Zlomek(-4, 5));
        seznam.pridatZlomek(new Zlomek(7, 8));
        seznam.vypisZlomky();

        //extract -> variable
        //suma
        Zlomek soucet = seznam.spoctiSoucet();
        System.out.println("Součet zlomků je:\n" + soucet);
        System.out.println("Součet zlomků reálně je:\n" + soucet.doubleValue());

        //prumer
        Zlomek prumer = seznam.spoctiPrumer();
        System.out.println("Průměr zlomků je:\n" + prumer);
        System.out.println("Průměr zlomků reálně je:\n" + prumer.doubleValue());
    }
}
