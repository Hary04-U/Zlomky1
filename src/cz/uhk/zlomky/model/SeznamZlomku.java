package cz.uhk.zlomky.model;

import java.util.ArrayList;
import java.util.List;

public class SeznamZlomku {
    private List<Zlomek> zlomky = new ArrayList<>();

    public void pridatZlomek(Zlomek zlomek) {
        if (zlomek != null) {
            zlomky.add(zlomek);
        }
        else {
            throw new NullPointerException("zlomek is null");
        }
    }

    public void odebratZlomek(int index) {
        zlomky.remove(index);
    }

    public Zlomek vratZlomek(int index) {
        return zlomky.get(index);
    }

    public Zlomek spoctiSoucet() {
        Zlomek suma = new Zlomek(0, 1);
        if (zlomky.size() == 0) {
            throw new IndexOutOfBoundsException("Seznam je prázdný");
        } else {
            for (Zlomek z : zlomky) {
                suma = suma.scitani(z);
            }
            return suma.zkratit();
        }
    }
    public Zlomek spoctiPrumer() {
        if (zlomky.size() == 0) {
            throw new IndexOutOfBoundsException("Seznam je prázdný");
        } else {
            Zlomek suma = spoctiSoucet();
            Zlomek pocet = new Zlomek(zlomky.size(), 1); //musime vytvorit zlomek pocet aby byl v return suma / pocet
            return suma.deleno(pocet).zkratit();
        }
    }

    public int pocetZlomku () {
        return zlomky.size();
    }

    public void vypisZlomky() {
        for (Zlomek z : zlomky) {
            System.out.println(z);
        }
//        for (int i = 0; i < zlomky.size(); i++) {
//            System.out.printf("[%d] => %s\n", i+1, zlomky.get(i));
//        }
    }
}
