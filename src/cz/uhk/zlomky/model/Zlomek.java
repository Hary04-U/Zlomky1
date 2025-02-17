package cz.uhk.zlomky.model;

public class Zlomek {
    private int citatel;
    private int jmenovatel;

    public Zlomek(int citatel, int jmenovatel) {
        this.citatel = citatel;
        this.jmenovatel = jmenovatel;
    }

    public int getCitatel() {
        return citatel;
    }

    public int getJmenovatel() {
        return jmenovatel;
    }

    public Zlomek krat(Zlomek druhy){
        return new Zlomek(citatel * druhy.citatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek deleno(Zlomek druhy){
        return new Zlomek(citatel * druhy.jmenovatel, jmenovatel * druhy.citatel);
    }

    public Zlomek scitani(Zlomek druhy) {
        return new Zlomek (citatel * druhy.jmenovatel + druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek odcitani(Zlomek druhy) {
        return new Zlomek (citatel * druhy.jmenovatel - druhy.citatel * jmenovatel, jmenovatel * druhy.jmenovatel);
    }

    public Zlomek zkratit() {
        int a = Math.abs(citatel);
        int b = Math.abs(jmenovatel);
        if (a < b) {
            int pomoc = a;
            a = b;
            b = pomoc;
        }
        int zb;
        do {
            zb = a % b;
            a = b;
            b = zb;
        } while (zb != 0);
        return new Zlomek(citatel/a, jmenovatel/a);
    }

    @Override
    public String toString() {
//        return " " + citatel + "\n" + "---" + "\n" + " " + jmenovatel;
          return String.format(" %d \n---\n %d", citatel, jmenovatel);
    }
}
