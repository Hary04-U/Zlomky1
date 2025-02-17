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

    @Override
    public String toString() {
//        return " " + citatel + "\n" + "---" + "\n" + " " + jmenovatel;
          return String.format(" %d \n---\n %d", citatel, jmenovatel);
    }
}
