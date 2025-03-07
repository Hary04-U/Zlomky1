package cz.uhk.zlomky.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {
    SeznamZlomku seznam;

    @BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @Test
    @DisplayName("Test pridavani")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class, () -> seznam.pridatZlomek(null));
        assertEquals(0, seznam.pocetZlomku(), "Pocet Zlomku");
    }

    @Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        seznam.odebratZlomek(0);
        assertEquals(0, seznam.pocetZlomku(), "Pocet Zlomku");
    }

    @Test
    void odebratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.odebratZlomek(0));
    }

    @Test
    void vratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void vratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(3,4));
        seznam.pridatZlomek(new Zlomek(1,2));
        Zlomek z = seznam.spoctiSoucet();
        assertEquals(5, z.getCitatel(), "Citatel");
        assertEquals(4, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiSoucetZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.spoctiSoucet());
    }

    @Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(3,4));
        seznam.pridatZlomek(new Zlomek(1,2));
        Zlomek z = seznam.spoctiPrumer();
        assertEquals(5, z.getCitatel(), "Citatel");
        assertEquals(8, z.getJmenovatel(), "Jmenovatel");
    }

    @Test
    void spoctiPrumerZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.spoctiPrumer());
    }
}