package cz.uhk.zlomky.model;

import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SeznamZlomkuTest {
    SeznamZlomku seznam;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        seznam = new SeznamZlomku();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Test pridavani")
    void pridatZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void pridatZlomekNull() {
        assertThrows(NullPointerException.class, () -> seznam.pridatZlomek(null));
        assertEquals(0, seznam.pocetZlomku(), "Pocet Zlomku");
    }

    @org.junit.jupiter.api.Test
    void odebratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        seznam.odebratZlomek(0);
        assertEquals(0, seznam.pocetZlomku(), "Pocet Zlomku");
    }

    @org.junit.jupiter.api.Test
    void vratZlomek() {
        seznam.pridatZlomek(new Zlomek(3,5));
        Zlomek z = seznam.vratZlomek(0);
        assertEquals(3, z.getCitatel(), "Citatel");
        assertEquals(5, z.getJmenovatel(), "Jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void vratZlomekZPrazdneho() {
        assertThrows(IndexOutOfBoundsException.class, () -> seznam.vratZlomek(0));
    }

    @org.junit.jupiter.api.Test
    void spoctiSoucet() {
        seznam.pridatZlomek(new Zlomek(3,4));
        seznam.pridatZlomek(new Zlomek(1,2));
        Zlomek z1 = seznam.vratZlomek(0);
        Zlomek z2 = seznam.vratZlomek(1);
        Zlomek z = seznam.spoctiSoucet();
        assertEquals(5, z.getCitatel(), "Citatel");
        assertEquals(4, z.getJmenovatel(), "Jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void spoctiPrumer() {
        seznam.pridatZlomek(new Zlomek(3,4));
        seznam.pridatZlomek(new Zlomek(1,2));
        Zlomek z1 = seznam.vratZlomek(0);
        Zlomek z2 = seznam.vratZlomek(1);
        Zlomek z = seznam.spoctiPrumer();
        assertEquals(5, z.getCitatel(), "Citatel");
        assertEquals(8, z.getJmenovatel(), "Jmenovatel");
    }

    @org.junit.jupiter.api.Test
    void vypisZlomky() {

    }
}